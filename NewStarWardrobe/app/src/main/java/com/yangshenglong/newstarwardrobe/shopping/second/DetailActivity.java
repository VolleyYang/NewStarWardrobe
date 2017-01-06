package com.yangshenglong.newstarwardrobe.shopping.second;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.VolleyError;
import com.bumptech.glide.Glide;
import com.yangshenglong.newstarwardrobe.MainActivity;
import com.yangshenglong.newstarwardrobe.R;
import com.yangshenglong.newstarwardrobe.base.BaseActivity;
import com.yangshenglong.newstarwardrobe.shopping.bean.AllDataNext;
import com.yangshenglong.newstarwardrobe.shopping.custom.MyViewPager;
import com.yangshenglong.newstarwardrobe.shopping.third.brand.BrandActivity;
import com.yangshenglong.newstarwardrobe.volley.NetHelper;
import com.yangshenglong.newstarwardrobe.volley.NetListener;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by xiaoBu on 16/12/22.
 * 二级界面--商品详情
 * 内容量及其庞大
 * 有一个PopUpWindow界面
 * 有少量Bug暂未解决
 * 坑死我了!!!
 */

public class DetailActivity extends BaseActivity implements View.OnClickListener {

    private MyViewPager mViewPager;
    private ArrayList<Fragment> data;
    private LinearLayout mLinearLayoutBrand;
    private ImageView ivBack;
    private TextView tvBuyNow, tvBuyCar;

    private PopupWindow mPopupWindow;
    private HashMap<String, String> map;
    private TextView tvPopSize, tvPopColor, tvPopPrice, tvPopConfirm;
    private EditText etNum;
    private ImageView ivReduce, ivAdd;
    private CheckBox cbPopSize, cbPopColor;
    private ImageView ivThumbnail;
    private TextView tvPopShowColor;
    private TextView tvPopShowContent;
    private AllDataNext dataR;//坐等被赋值

    int iNum = 1;

    @Override
    public int setLayout() {
        return R.layout.activity_xiaobu_second_shopping;
    }

    @Override
    public void initView() {
        mViewPager = (MyViewPager) findViewById(R.id.vp_xiaobu_second_detail);
        mLinearLayoutBrand = (LinearLayout) findViewById(R.id.ll_xiaobu_next_bottom_brand);
        ivBack = (ImageView) findViewById(R.id.iv_xiaobu_second_detail_back);
        tvBuyNow = (TextView) findViewById(R.id.tv_xiaobu_next_buy_now);
        tvBuyCar = (TextView) findViewById(R.id.tv_xiaobu_next_buy_car);
        dataR = new AllDataNext();
        data = new ArrayList<>();
    }

    @Override
    public void initData() {

        // popUpWindow解析相关内容
        loadingDataPop();//解析前的准备
        isResolvePop();//解析

        isAdd();//添加Vp的Fragment
        isBack();//返回
        isBrandClick();//品牌点击跳转

    }

    /**
     * 返回
     */
    private void isBack() {

        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    /**
     * 上下两个Fragment
     */
    private void isAdd() {

        data.add(new DetailShoppingFragment());
        data.add(new DetailExplainFragment());

        DetailShoppingAdapter adapter = new DetailShoppingAdapter(getSupportFragmentManager(), data);
        mViewPager.setAdapter(adapter);

    }

    /**
     * 品牌
     */
    private void isBrandClick() {
        mLinearLayoutBrand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), BrandActivity.class);
                startActivity(intent);
            }
        });

    }

    /**
     * 点击弹出popWindow界面
     */
    private void isBuyNow() {

        /* 立即购买 */
        tvBuyNow.setOnClickListener(this);
        /* 加入购物车 */
        tvBuyCar.setOnClickListener(this);

    }


    /**
     * CheckBoxColor的选中状态
     */
    private void isCheckColorTrue() {

        int roundRadius = 3;//圆角半径

        GradientDrawable gd = new GradientDrawable();//创建drawable

        cbPopColor.setTextColor(Color.argb(255, 255, 255, 255));//白色字体
        cbPopColor.setBackgroundColor(Color.argb(255, 206, 16, 79));//朱红色背景

        gd.setCornerRadius(roundRadius);//加入圆角

    }

    /**
     * CheckBoxSize的选中状态
     */
    private void isCheckSizeTrue() {

        int roundRadius = 3;//圆角半径

        GradientDrawable gd = new GradientDrawable();//创建drawable

        cbPopSize.setTextColor(Color.argb(255, 255, 255, 255));//白色字体
        cbPopSize.setBackgroundColor(Color.argb(255, 206, 16, 79));//朱红色背景

        gd.setCornerRadius(roundRadius);//加入圆角

    }

    /**
     * CheckBoxColor的非选中状态
     */
    private void isCheckColorFalse() {

        int strokeWidth = 2; //边框宽度
        int roundRadius = 3; //圆角半径
        int strokeColor = Color.parseColor("#CE104F");//边框颜色

        GradientDrawable gd = new GradientDrawable();//创建drawable

        cbPopColor.setTextColor(Color.argb(255, 206, 16, 79));//朱红色字体
        cbPopColor.setBackgroundColor(Color.argb(255, 255, 255, 255));//白色背景

        gd.setCornerRadius(roundRadius);
        gd.setStroke(strokeWidth, strokeColor);
        cbPopColor.setBackgroundDrawable(gd);

    }

    /**
     * CheckBoxSize的非选中状态
     */
    private void isCheckSizeFalse() {

        int strokeWidth = 2; // 边框宽度
        int roundRadius = 3; // 圆角半径
        int strokeColor = Color.parseColor("#CE104F");//边框颜色

        GradientDrawable gd = new GradientDrawable();//创建drawable

        cbPopSize.setTextColor(Color.argb(255, 206, 16, 79));//朱红色字体
        cbPopSize.setBackgroundColor(Color.argb(255, 255, 255, 255));//白色背景

        gd.setCornerRadius(roundRadius);
        gd.setStroke(strokeWidth, strokeColor);
        cbPopSize.setBackgroundDrawable(gd);

    }

    /**
     * 解析post接口的准备工作
     */
    private void loadingDataPop() {

        map = new HashMap<>();
        map.put("method", "%2Fgoods");
        map.put("data", "eyJnb29kc19pZCI6IjEyNTkxNzciLCJnYSI6Imh0dHA6Ly9hcGktdjIubWFsbC5oaWNoYW8uY29tIiwic291cmNlX2lkIjoiMjYxMTk4OCJ9");//不一样 不可获取
        map.put("sign", "515090d598694fba28a8a0f9c8d8e4cc");
        map.put("goods_id", "1259177");
        map.put("ga", "http%3A%2F%2Fapi-v2.mall.hichao.com");
        map.put("source", "mxyc_adr");
        map.put("source_id", "2611988");
        map.put("version", "7.1.0");

    }

    /**
     * 解析
     */
    private void isResolvePop() {

        String url = "http://api-v2.mall.hichao.com/goods";
        NetHelper.getInstance().MyRequest(url, AllDataNext.class, new NetListener<AllDataNext>() {
            @Override
            public void successListener(AllDataNext response) {

                dataR = response;//赋值
                isBuyNow();//立即购买
            }

            @Override
            public void errorListener(VolleyError error) {

            }
        }, map);

    }

    /**
     * 立即购买 加入购物车
     * 点击事件
     *
     * @param v
     */
    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            // 点击加入购物车
            case R.id.tv_xiaobu_next_buy_car:

                isMyPop(dataR);
                break;

            // 点击立即购买
            case R.id.tv_xiaobu_next_buy_now:

                isMyPop(dataR);
                break;
        }

    }

    /**
     * PopUpWindow界面
     */
    private void isMyPop(final AllDataNext dataRe) {

        /* PopUpWindow */
        mPopupWindow = new PopupWindow();
        mPopupWindow.setWidth(ViewGroup.LayoutParams.MATCH_PARENT);
        mPopupWindow.setHeight(ViewGroup.LayoutParams.WRAP_CONTENT);
        mPopupWindow.setTouchable(true);
        mPopupWindow.setOutsideTouchable(true);

        if (!mPopupWindow.isShowing()) {
            iNum = 1;
        }

        mPopupWindow.setFocusable(true);
        mPopupWindow.setBackgroundDrawable(new BitmapDrawable());

        View viewPop = LayoutInflater.from(getBaseContext()).inflate(R.layout.view_xiaobu_pop_buy, null);
        mPopupWindow.setContentView(viewPop);

        tvPopSize = (TextView) viewPop.findViewById(R.id.tv_xiaobu_shopping_next_pop_size);
        tvPopColor = (TextView) viewPop.findViewById(R.id.tv_xiaobu_shopping_next_pop_color);
        tvPopPrice = (TextView) viewPop.findViewById(R.id.tv_xiaobu_shopping_next_pop_price);
        ivThumbnail = (ImageView) viewPop.findViewById(R.id.iv_xiaobu_shopping_next_pop_img);
        cbPopSize = (CheckBox) viewPop.findViewById(R.id.cb_xiaobu_shopping_next_pop_size);
        cbPopColor = (CheckBox) viewPop.findViewById(R.id.cb_xiaobu_shopping_next_pop_color);
        tvPopShowColor = (TextView) viewPop.findViewById(R.id.tv_xiaobu_shopping_next_pop_show_color);
        tvPopShowContent = (TextView) viewPop.findViewById(R.id.tv_xiaobu_shopping_next_pop_show_size);
        tvPopConfirm = (TextView) viewPop.findViewById(R.id.tv_xiaobu_shopping_next_pop_confirm);
        etNum = (EditText) viewPop.findViewById(R.id.et_xiaobu_shopping_next_pop_num);
        ivReduce = (ImageView) viewPop.findViewById(R.id.iv_xiaobu_shopping_next_pop_num_reduce);
        ivAdd = (ImageView) viewPop.findViewById(R.id.iv_xiaobu_shopping_next_pop_num_add);

        ivReduce.setTag("-");
        ivAdd.setTag("+");
        etNum.setText("1");

        // 动画
        mPopupWindow.setAnimationStyle(R.style.mypopwindow_anim_style);
        mPopupWindow.showAtLocation(DetailActivity.this.findViewById(R.id.ll_xiaobu_second), Gravity.BOTTOM, 0, 0);

        tvPopPrice.setText("¥" + dataRe.getResponse().getData().getShop_price());
        tvPopColor.setText(dataRe.getResponse().getData().getSpe().get(0).getName());
        cbPopColor.setText(dataRe.getResponse().getData().getSpe().get(0).getValues().get(0).getLabel());
        tvPopSize.setText(dataRe.getResponse().getData().getSpe().get(1).getName());
        cbPopSize.setText(dataRe.getResponse().getData().getSpe().get(1).getValues().get(0).getLabel());
        Glide.with(getBaseContext()).load(dataRe.getResponse().getData().getSpe().get(0).getValues().get(0).getImg_url()).into(ivThumbnail);

        isCheckColorTrue();//cbColor选中状态
        isCheckSizeTrue();//cbSize选中状态

        cbPopSize.setChecked(true);
        cbPopColor.setChecked(true);

        final String popColorCheck = dataRe.getResponse().getData().getSpe().get(0).getValues().get(0).getLabel();
        final String popSizeCheck = dataRe.getResponse().getData().getSpe().get(1).getValues().get(0).getLabel();
        final String popColorText = dataRe.getResponse().getData().getSpe().get(0).getName();
        final String popSizeText = dataRe.getResponse().getData().getSpe().get(1).getName();

        tvPopShowColor.setText("已选择 " + popColorCheck);
        tvPopShowContent.setText("已选择 " + popSizeCheck);

        // 颜色
        cbPopColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbPopColor.isChecked()) {

                    isCheckColorTrue();//cbColor选中状态
                    cbPopColor.setChecked(true);
                    tvPopShowColor.setText("已选择 " + popColorCheck);
                    tvPopConfirm.setBackgroundColor(Color.argb(255, 206, 46, 79));


                } else if (!cbPopColor.isChecked()) {

                    isCheckColorFalse();//cbColor非选中状态
                    cbPopColor.setChecked(false);
                    tvPopShowColor.setText("请选择 " + popColorText);
                    tvPopConfirm.setBackgroundColor(Color.argb(255, 155, 155, 155));
                    tvPopConfirm.setFocusable(false);

                }
            }
        });

        // 尺码
        cbPopSize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbPopSize.isChecked()) {

                    isCheckSizeTrue();//cbSize选中状态
                    cbPopSize.setChecked(true);
                    tvPopShowContent.setText("已选择 " + popSizeCheck);
                    tvPopConfirm.setBackgroundColor(Color.argb(255, 206, 46, 79));

                } else if (!cbPopSize.isChecked()) {

                    isCheckSizeFalse();//cbSize非选中状态
                    cbPopSize.setChecked(false);
                    tvPopShowContent.setText("请选择 " + popSizeText);
                    tvPopConfirm.setBackgroundColor(Color.argb(255, 155, 155, 155));
                    tvPopConfirm.setFocusable(false);

                }
            }
        });

        // 判断各Cb的状态 在TvShow内显示不同的信息
//                if (cbPopColor.isChecked() && cbPopSize.isChecked()) {
//
//                    tvPopShow.setText("已选择:" + popColorCheck + "," + popSizeCheck);
//                } else if (cbPopColor.isChecked() && !cbPopSize.isChecked()) {
//
//                    tvPopShow.setText("请选择:" + popSizeText);
//                } else if (!cbPopColor.isChecked() && cbPopSize.isChecked()) {
//
//                    tvPopShow.setText("请选择:" + popColorText);
//                } else if (!cbPopColor.isChecked() && cbPopSize.isChecked()) {
//
//                    tvPopShow.setText("请选择:" + popColorText + " " + popSizeText);
//                }

        ivAdd.setOnClickListener(new OnNumButtonClickListener());
        ivReduce.setOnClickListener(new OnNumButtonClickListener());

        // 数量选择监听
        etNum.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

//                        String numString = s.toString();
//                        if (numString == null || numString.equals("")) {
//                            iNum = 1;//默认显示为1
//                        } else {
//                            int numInt = Integer.parseInt(numString);
//                            if (numInt < 0) {
//                                Toast.makeText(getBaseContext(), "请输入一个大于0的数字", Toast.LENGTH_SHORT).show();
//                            } else {
//                                etNum.setSelection(etNum.getText().toString().length());//设置EditText光标位置 为文本末端
//                                iNum = numInt;
//
//                            }
//                        }

                String numString = etNum.getText().toString();

                if (numString.equals("0")) {
                    tvPopConfirm.setBackgroundColor(Color.argb(255, 155, 155, 155));
                    tvPopConfirm.setFocusable(false);
                } else {
                    tvPopConfirm.setBackgroundColor(Color.argb(255, 206, 46, 79));
                    tvPopConfirm.setFocusable(true);
                }

            }
        });
    }

    /**
     * 内部类OnButtonClickListener实现接口
     * 加减号的点击事件
     * 注意层级关系
     */
    class OnNumButtonClickListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {

            // 得到输入框里的数字
            String numString = etNum.getText().toString();
            // 进行判断为空或是没文字设置为1
            if (numString == null || numString.equals("")) {
                iNum = 1;

            } else {
                if (v.getTag().equals("+")) {
                    // 判断(大于0的才能往下减)
                    if (++iNum < 0)  //先加,再判断
                    {
                        iNum--;
                        Toast.makeText(getBaseContext(), "请输入一个大于0的数字", Toast.LENGTH_SHORT).show();
                    } else {
                        etNum.setText(String.valueOf(iNum));
                    }
                } else if (v.getTag().equals("-")) {
                    //判断（自减限制数不小于0）
                    if (--iNum < 0)  //先减，再判断
                    {
                        iNum++;
                        Toast.makeText(getBaseContext(), "不能小于0", Toast.LENGTH_SHORT).show();
                    } else {
                        etNum.setText(String.valueOf(iNum));
                    }
                }
            }
        }
    }

}
