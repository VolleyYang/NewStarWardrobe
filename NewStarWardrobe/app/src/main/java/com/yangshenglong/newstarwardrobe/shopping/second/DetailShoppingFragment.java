package com.yangshenglong.newstarwardrobe.shopping.second;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.android.volley.VolleyError;
import com.bumptech.glide.Glide;
import com.yangshenglong.newstarwardrobe.R;
import com.yangshenglong.newstarwardrobe.base.BaseFragment;
import com.yangshenglong.newstarwardrobe.shopping.bean.AllDataNext;
import com.yangshenglong.newstarwardrobe.shopping.third.brand.BrandActivity;
import com.yangshenglong.newstarwardrobe.volley.NetHelper;
import com.yangshenglong.newstarwardrobe.volley.NetListener;

import java.util.HashMap;

/**
 * Created by xiaoBu on 2016/12/25.
 */

public class DetailShoppingFragment extends BaseFragment {

    private HashMap<String, String> map;

    private ViewPager mViewPager;//模特展示图片
    private TextView tvShopPrice;//售价
    private TextView tvMarketPrice;//市场价
    private TextView tvGoodsName;//名称
    private TextView tvExplainTitle;//包邮 七天退换
    private TextView tvCommentCount;//评价数量
    private TextView tvDescribe, tvDescribeGrade;//描述,评分
    private TextView tvService, tvServiceGrade;//服务,评分
    private TextView tvLogistics, tvLogisticsGrade;//物流,评分
    private TextView tvBusiness;//公司名
    private ImageView ivBusiness;//公司商标

    private LinearLayout mLinearLayoutBrand;//用于点击跳转

    private AllDataNext data;

    @Override
    public int setLayout() {
        return R.layout.fragment_xiaobu_second_detail_shopping;
    }

    @Override
    public void initView(View view) {

        mViewPager = (ViewPager) view.findViewById(R.id.vp_xiaobu_shopping_next_goods_img);
        tvShopPrice = (TextView) view.findViewById(R.id.tv_xiaobu_shopping_next_shop_price);
        tvMarketPrice = (TextView) view.findViewById(R.id.tv_xiaobu_shopping_next_market_price);
        tvGoodsName = (TextView) view.findViewById(R.id.tv_xiaobu_shopping_next_goods_name);
        tvExplainTitle = (TextView) view.findViewById(R.id.tv_xiaobu_shopping_next_explain_title);
        tvCommentCount = (TextView) view.findViewById(R.id.tv_xiaobu_shopping_next_comment_count);

        tvDescribe = (TextView) view.findViewById(R.id.tv_xiaobu_shopping_next_describe);
        tvDescribeGrade = (TextView) view.findViewById(R.id.tv_xiaobu_shopping_next_describe_grade);
        tvService = (TextView) view.findViewById(R.id.tv_xiaobu_shopping_next_service);
        tvServiceGrade = (TextView) view.findViewById(R.id.tv_xiaobu_shopping_next_service_grade);
        tvLogistics = (TextView) view.findViewById(R.id.tv_xiaobu_shopping_next_logistics);
        tvLogisticsGrade = (TextView) view.findViewById(R.id.tv_xiaobu_shopping_next_logistics_grade);

        tvBusiness = (TextView) view.findViewById(R.id.tv_xiaobu_shopping_next_business_name);
        ivBusiness = (ImageView) view.findViewById(R.id.iv_xiaobu_shopping_next_business_image);

        mLinearLayoutBrand = (LinearLayout) view.findViewById(R.id.ll_xiaobu_shopping_next_business);

    }

    @Override
    public void initData() {

        loadingData();//解析post接口的准备工作
        isResolve();//解析
        isClick();//点击跳转到店铺界面

    }

    private void isClick() {

        mLinearLayoutBrand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), BrandActivity.class);
                startActivity(intent);
            }
        });
    }

    private void loadingData() {

        map = new HashMap<>();

        // method=%2Fgoods
        // &data=eyJnb29kc19pZCI6IjEyNTkxNzciLCJnYSI6Imh0dHA6Ly9hcGktdjIubWFsbC5oaWNoYW8uY29tIiwic291cmNlX2lkIjoiMjYxMTk4OCJ9
        // &sign=515090d598694fba28a8a0f9c8d8e4cc
        // &goods_id=1259177
        // &ga=http%3A%2F%2Fapi-v2.mall.hichao.com
        // &source=mxyc_adr
        // &source_id=2611988
        // &version=7.1.0

        map.put("method", "%2Fgoods");//一样
        map.put("data", "eyJnb29kc19pZCI6IjEyNTkxNzciLCJnYSI6Imh0dHA6Ly9hcGktdjIubWFsbC5oaWNoYW8uY29tIiwic291cmNlX2lkIjoiMjYxMTk4OCJ9");//不一样 不可获取
        map.put("sign", "515090d598694fba28a8a0f9c8d8e4cc");//不一样 不可获取
        map.put("goods_id", "1259177");//不一样 可获取
        map.put("ga", "http%3A%2F%2Fapi-v2.mall.hichao.com");//一样 不可获取
        map.put("source", "mxyc_adr");//一样 可获取但并不是这一条
        map.put("source_id", "2611988");//不一样 可获取
        map.put("version", "7.1.0");//一样 不可获取

    }

    private void isResolve() {

        String url = "http://api-v2.mall.hichao.com/goods";
        NetHelper.getInstance().MyRequest(url, AllDataNext.class, new NetListener<AllDataNext>() {
            @Override
            public void successListener(AllDataNext response) {

                tvShopPrice.setText("¥" + response.getResponse().getData().getShop_price());
                tvMarketPrice.setText(response.getResponse().getData().getMarket_price());
                tvGoodsName.setText(response.getResponse().getData().getGoods_name());
                tvExplainTitle.setText(response.getResponse().getData().getExplain_title());
                tvCommentCount.setText("(" + response.getResponse().getData().getCommentInfo().getCount() + ")");

                tvDescribe.setText(response.getResponse().getData().getBscoreInfo().getScore().get(0).getName());
                tvDescribeGrade.setText(response.getResponse().getData().getBscoreInfo().getScore().get(0).getValue());
                tvService.setText(response.getResponse().getData().getBscoreInfo().getScore().get(1).getName());
                tvServiceGrade.setText(response.getResponse().getData().getBscoreInfo().getScore().get(1).getValue());
                tvLogistics.setText(response.getResponse().getData().getBscoreInfo().getScore().get(2).getName());
                tvLogisticsGrade.setText(response.getResponse().getData().getBscoreInfo().getScore().get(2).getValue());

                tvBusiness.setText(response.getResponse().getData().getBusiness_name());
                Glide.with(getContext()).load(response.getResponse().getData().getBusiness_image()).into(ivBusiness);

                // 这个界面内部唯一用到适配器的地方
                DetailShoppingModelAdapter adapter = new DetailShoppingModelAdapter(getContext());
                adapter.setData(response);
                mViewPager.setAdapter(adapter);

            }

            @Override
            public void errorListener(VolleyError error) {

            }
        }, map);
    }
}
