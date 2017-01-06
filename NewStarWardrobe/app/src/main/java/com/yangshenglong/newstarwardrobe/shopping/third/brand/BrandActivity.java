package com.yangshenglong.newstarwardrobe.shopping.third.brand;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.yangshenglong.newstarwardrobe.R;
import com.yangshenglong.newstarwardrobe.base.BaseActivity;
import com.yangshenglong.newstarwardrobe.okhttp.NetTool;
import com.yangshenglong.newstarwardrobe.okhttp.onHttpCallback;
import com.yangshenglong.newstarwardrobe.shopping.second.DetailActivity;
import com.yangshenglong.newstarwardrobe.shopping.third.brand.fragment.BrandDefaultFragment;
import com.yangshenglong.newstarwardrobe.shopping.third.brand.fragment.BrandNewFragment;
import com.yangshenglong.newstarwardrobe.shopping.third.brand.fragment.BrandPopOthersFragment;
import com.yangshenglong.newstarwardrobe.shopping.third.brand.fragment.BrandPopPantsFragment;
import com.yangshenglong.newstarwardrobe.shopping.third.brand.fragment.BrandPopSkirtFragment;
import com.yangshenglong.newstarwardrobe.shopping.third.brand.fragment.BrandPopTopsFragment;
import com.yangshenglong.newstarwardrobe.shopping.third.brand.fragment.BrandPriceDownFragment;
import com.yangshenglong.newstarwardrobe.shopping.third.brand.fragment.BrandPriceUpFragment;
import com.yangshenglong.newstarwardrobe.shopping.third.brand.fragment.BrandSalesFragment;

/**
 * Created by xiaoBu on 16/12/27.
 * 内容量比较庞大
 */

public class BrandActivity extends BaseActivity implements View.OnClickListener {

    private TextView tvDefault, tvNew, tvSales, tvPrice, tvClass;
    private TextView tvTops, tvSkirt, tvPants, tvOthers;//女式上装, 裙子, 女裤, 其它女装;

    private ImageView ivTitle;
    private TextView tvBrief;
    private PopupWindow mPopupWindow;

    private TextView tvLineDefault, tvLineNew, tvLineSales, tvLinePrice, tvLineClass;
    private ImageView ivUp, ivDown;

    private ImageView ivBack;

    int type = 0;

    @Override
    public int setLayout() {
        return R.layout.activity_xiaobu_third_brand;
    }

    @Override
    public void initView() {

        tvDefault = (TextView) findViewById(R.id.tv_xiaobu_third_brand_default);
        tvNew = (TextView) findViewById(R.id.tv_xiaobu_third_brand_new);
        tvSales = (TextView) findViewById(R.id.tv_xiaobu_third_brand_sales);

        ivTitle = (ImageView) findViewById(R.id.iv_xiaobu_third_brand_title);
        tvBrief = (TextView) findViewById(R.id.tv_xiaobu_third_brand_brief);
        tvSales = (TextView) findViewById(R.id.tv_xiaobu_third_brand_sales);
        tvPrice = (TextView) findViewById(R.id.tv_xiaobu_third_brand_price);
        tvClass = (TextView) findViewById(R.id.tv_xiaobu_third_brand_class);

        tvLineDefault = (TextView) findViewById(R.id.tv_xiaobu_line_default);
        tvLineNew = (TextView) findViewById(R.id.tv_xiaobu_line_new);
        tvLineSales = (TextView) findViewById(R.id.tv_xiaobu_line_sales);
        tvLinePrice = (TextView) findViewById(R.id.tv_xiaobu_line_price);
        tvLineClass = (TextView) findViewById(R.id.tv_xiaobu_line_class);

        ivUp = (ImageView) findViewById(R.id.iv_xiaobu_third_brand_price_up);
        ivDown = (ImageView) findViewById(R.id.iv_xiaobu_third_brand_price_down);

        ivBack = (ImageView) findViewById(R.id.iv_xiaobu_third_brand_back);
    }

    @Override
    public void initData() {

        isResolve();
        isClick();
        isBack();

    }

    private void isBack() {

        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), DetailActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    public void replace(Fragment fragment) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.fl_xiaobu_third, fragment);
        transaction.commit();
    }

    private void isClick() {

        tvDefault.setOnClickListener(this);
        tvNew.setOnClickListener(this);
        tvSales.setOnClickListener(this);
        tvPrice.setOnClickListener(this);
        tvClass.setOnClickListener(this);
        replace(new BrandDefaultFragment());
    }

    private void isResolve() {

        String url = "http://api-v2.mall.hichao.com/business-shop?method=%2Fbusiness-shop&data=eyJnYSI6Imh0dHA6Ly9hcGktdjIubWFsbC5oaWNoYW8uY29tIiwidHlwZSI6IjEiLCJidXNpbmVzc19pZCI6IjIzMDIifQ%3D%3D&sign=e5106066b5a92c067efd21f6cb77229c&ga=http%3A%2F%2Fapi-v2.mall.hichao.com&source=mxyc_adr&type=1&business_id=2302&version=7.1.0";

        NetTool.getInstance().startRequest(url, BrandDataTitle.class, new onHttpCallback<BrandDataTitle>() {
            @Override
            public void onSuccess(BrandDataTitle response) {

                Glide.with(getBaseContext()).load(response.getResponse().getData().getBusiness().getBusiness_banner_url()).into(ivTitle);
                tvBrief.setText(response.getResponse().getData().getBusiness().getBusiness_brief());
            }

            @Override
            public void onError(Throwable e) {

            }
        });

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.tv_xiaobu_third_brand_default:

                replace(new BrandDefaultFragment());

                tvDefault.setTextColor(Color.argb(255, 206, 16, 79));
                tvNew.setTextColor(Color.argb(255, 117, 117, 117));
                tvSales.setTextColor(Color.argb(255, 117, 117, 117));
                tvPrice.setTextColor(Color.argb(255, 117, 117, 117));
                tvClass.setTextColor(Color.argb(255, 117, 117, 117));

                tvLineDefault.setBackgroundResource(R.color.starRed);
                tvLineNew.setBackgroundResource(R.color.transparent);
                tvLineSales.setBackgroundResource(R.color.transparent);
                tvLinePrice.setBackgroundResource(R.color.transparent);
                tvLineClass.setBackgroundResource(R.color.transparent);

                ivUp.setBackgroundResource(R.mipmap.ic_sort_up_off);
                ivDown.setBackgroundResource(R.mipmap.ic_sort_down_off);

                type = 0;


                break;

            case R.id.tv_xiaobu_third_brand_new:

                replace(new BrandNewFragment());
                tvNew.setTextColor(Color.argb(255, 206, 16, 79));
                tvDefault.setTextColor(Color.argb(255, 117, 117, 117));
                tvSales.setTextColor(Color.argb(255, 117, 117, 117));
                tvPrice.setTextColor(Color.argb(255, 117, 117, 117));
                tvClass.setTextColor(Color.argb(255, 117, 117, 117));

                tvLineNew.setBackgroundResource(R.color.starRed);
                tvLineDefault.setBackgroundResource(R.color.transparent);
                tvLineSales.setBackgroundResource(R.color.transparent);
                tvLinePrice.setBackgroundResource(R.color.transparent);
                tvLineClass.setBackgroundResource(R.color.transparent);

                ivUp.setBackgroundResource(R.mipmap.ic_sort_up_off);
                ivDown.setBackgroundResource(R.mipmap.ic_sort_down_off);

                type = 0;


                break;

            case R.id.tv_xiaobu_third_brand_sales:

                replace(new BrandSalesFragment());
                tvSales.setTextColor(Color.argb(255, 206, 16, 79));
                tvDefault.setTextColor(Color.argb(255, 117, 117, 117));
                tvNew.setTextColor(Color.argb(255, 117, 117, 117));
                tvPrice.setTextColor(Color.argb(255, 117, 117, 117));
                tvClass.setTextColor(Color.argb(255, 117, 117, 117));

                tvLineSales.setBackgroundResource(R.color.starRed);
                tvLineDefault.setBackgroundResource(R.color.transparent);
                tvLineNew.setBackgroundResource(R.color.transparent);
                tvLinePrice.setBackgroundResource(R.color.transparent);
                tvLineClass.setBackgroundResource(R.color.transparent);

                ivUp.setBackgroundResource(R.mipmap.ic_sort_up_off);
                ivDown.setBackgroundResource(R.mipmap.ic_sort_down_off);

                type = 0;


                break;

            case R.id.tv_xiaobu_third_brand_price:

                if (type == 0) {

                    replace(new BrandPriceDownFragment());
                    tvPrice.setTextColor(Color.argb(255, 206, 16, 79));
                    tvDefault.setTextColor(Color.argb(255, 117, 117, 117));
                    tvSales.setTextColor(Color.argb(255, 117, 117, 117));
                    tvNew.setTextColor(Color.argb(255, 117, 117, 117));
                    tvClass.setTextColor(Color.argb(255, 117, 117, 117));

                    tvLinePrice.setBackgroundResource(R.color.starRed);
                    tvLineDefault.setBackgroundResource(R.color.transparent);
                    tvLineSales.setBackgroundResource(R.color.transparent);
                    tvLineNew.setBackgroundResource(R.color.transparent);
                    tvLineClass.setBackgroundResource(R.color.transparent);

                    ivUp.setBackgroundResource(R.mipmap.ic_sort_up_on);
                    ivDown.setBackgroundResource(R.mipmap.ic_sort_down_off);

                    type = 1;
                } else if (type == 1) {
                    replace(new BrandPriceUpFragment());
                    tvPrice.setTextColor(Color.argb(255, 206, 16, 79));
                    tvDefault.setTextColor(Color.argb(255, 117, 117, 117));
                    tvSales.setTextColor(Color.argb(255, 117, 117, 117));
                    tvNew.setTextColor(Color.argb(255, 117, 117, 117));
                    tvClass.setTextColor(Color.argb(255, 117, 117, 117));

                    tvLinePrice.setBackgroundResource(R.color.starRed);
                    tvLineDefault.setBackgroundResource(R.color.transparent);
                    tvLineSales.setBackgroundResource(R.color.transparent);
                    tvLineNew.setBackgroundResource(R.color.transparent);
                    tvLineClass.setBackgroundResource(R.color.transparent);

                    ivUp.setBackgroundResource(R.mipmap.ic_sort_up_off);
                    ivDown.setBackgroundResource(R.mipmap.ic_sort_down_on);

                    type = 0;
                }
                break;
            case R.id.tv_xiaobu_third_brand_class:

                tvClass.setTextColor(Color.argb(255, 206, 16, 79));
                tvDefault.setTextColor(Color.argb(255, 117, 117, 117));
                tvSales.setTextColor(Color.argb(255, 117, 117, 117));
                tvPrice.setTextColor(Color.argb(255, 117, 117, 117));
                tvNew.setTextColor(Color.argb(255, 117, 117, 117));

                ivUp.setBackgroundResource(R.mipmap.ic_sort_up_off);
                ivDown.setBackgroundResource(R.mipmap.ic_sort_down_off);

                tvLineClass.setBackgroundResource(R.color.starRed);
                tvLineDefault.setBackgroundResource(R.color.transparent);
                tvLineSales.setBackgroundResource(R.color.transparent);
                tvLinePrice.setBackgroundResource(R.color.transparent);
                tvLineNew.setBackgroundResource(R.color.transparent);

                type = 0;

                // popWindow
                mPopupWindow = new PopupWindow();
                mPopupWindow.setWidth(ViewGroup.LayoutParams.MATCH_PARENT);
                mPopupWindow.setHeight(ViewGroup.LayoutParams.WRAP_CONTENT);
                mPopupWindow.setTouchable(true);
                mPopupWindow.setOutsideTouchable(true);
                mPopupWindow.setFocusable(true);
                mPopupWindow.setBackgroundDrawable(new BitmapDrawable());

                View viewPop = LayoutInflater.from(getBaseContext()).inflate(R.layout.view_xiaobu_pop, null);
                mPopupWindow.setContentView(viewPop);

                mPopupWindow.showAsDropDown(tvClass);

                tvTops = (TextView) viewPop.findViewById(R.id.tv_xiaobu_third_brand_pop_tops);
                tvSkirt = (TextView) viewPop.findViewById(R.id.tv_xiaobu_third_brand_pop_skirt);
                tvPants = (TextView) viewPop.findViewById(R.id.tv_xiaobu_third_brand_pop_pants);
                tvOthers = (TextView) viewPop.findViewById(R.id.tv_xiaobu_third_brand_pop_others);

                tvTops.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        replace(new BrandPopTopsFragment());
                        if (mPopupWindow.isShowing()) {
                            mPopupWindow.dismiss();
                        }
                    }
                });
                tvSkirt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        replace(new BrandPopSkirtFragment());
                        if (mPopupWindow.isShowing()) {
                            mPopupWindow.dismiss();
                        }
                    }
                });
                tvPants.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        replace(new BrandPopPantsFragment());
                        if (mPopupWindow.isShowing()) {
                            mPopupWindow.dismiss();
                        }

                    }
                });
                tvOthers.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        replace(new BrandPopOthersFragment());
                        if (mPopupWindow.isShowing()) {
                            mPopupWindow.dismiss();
                        }

                    }
                });


                break;
        }
    }

}
