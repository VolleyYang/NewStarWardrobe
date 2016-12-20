package com.yangshenglong.newstarwardrobe.classify;

import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.yangshenglong.newstarwardrobe.R;
import com.yangshenglong.newstarwardrobe.base.BaseActivity;

/**
 * Created by CST on 16/12/20.
 */

public class ClassifyGridItemActivity extends BaseActivity implements View.OnClickListener {
    private ImageView ivBack,ivDefault,ivNew,ivSales,ivPrice,ivPriceUp,ivPriceDown;
    private LinearLayout llPrice;
    private TextView tvTitle,tvDefault,tvNew,tvSales,tvPrice;
    private String title;

    @Override
    public int setLayout() {
        return R.layout.activity_item_grid_classify;
    }

    @Override
    public void initView() {
        ivBack = (ImageView) findViewById(R.id.iv_activity_item_grid_classify_colse);
        ivDefault = (ImageView) findViewById(R.id.iv_activity_item_grid_classify_default);
        ivNew = (ImageView) findViewById(R.id.iv_activity_item_grid_classify_new);
        ivSales = (ImageView) findViewById(R.id.iv_activity_item_grid_classify_sales);
        ivPrice = (ImageView) findViewById(R.id.iv_activity_item_grid_classify_price);
        ivPriceUp = (ImageView) findViewById(R.id.iv_activity_item_grid_classify_price_up);
        ivPriceDown = (ImageView) findViewById(R.id.iv_activity_item_grid_classify_price_down);
        llPrice = (LinearLayout) findViewById(R.id.ll_activity_item_grid_classify_price);
        tvTitle = (TextView) findViewById(R.id.tv_activity_item_grid_classify_title);
        tvDefault = (TextView) findViewById(R.id.tv_activity_item_grid_classify_default);
        tvNew = (TextView) findViewById(R.id.tv_activity_item_grid_classify_new);
        tvSales = (TextView) findViewById(R.id.tv_activity_item_grid_classify_sales);
        tvPrice = (TextView) findViewById(R.id.tv_activity_item_grid_classify_price);
    }

    

    @Override
    public void initData() {
        tvTitle.setText(getIntent().getStringExtra("key"));
        ivBack.setOnClickListener(this);
        tvDefault.setOnClickListener(this);
        tvNew.setOnClickListener(this);
        tvSales.setOnClickListener(this);
        llPrice.setOnClickListener(this);
        tvDefault.setTextColor(Color.rgb(0xce,0x10,0x4f));
        ivDefault.setVisibility(View.VISIBLE);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.iv_activity_item_grid_classify_colse:
                finish();
            break;
            case R.id.tv_activity_item_grid_classify_default:
                tvDefault.setTextColor(Color.rgb(0xce,0x10,0x4f));
                ivDefault.setVisibility(View.VISIBLE);
                tvNew.setTextColor(Color.rgb(0x6d,0x6d,0x6d));
                ivNew.setVisibility(View.INVISIBLE);
                tvSales.setTextColor(Color.rgb(0x6d,0x6d,0x6d));
                ivSales.setVisibility(View.INVISIBLE);
                tvPrice.setTextColor(Color.rgb(0x6d,0x6d,0x6d));
                ivPrice.setVisibility(View.INVISIBLE);
            break;
            case R.id.tv_activity_item_grid_classify_new:
                tvNew.setTextColor(Color.rgb(0xce,0x10,0x4f));
                ivNew.setVisibility(View.VISIBLE);
                tvDefault.setTextColor(Color.rgb(0x6d,0x6d,0x6d));
                ivDefault.setVisibility(View.INVISIBLE);
                tvSales.setTextColor(Color.rgb(0x6d,0x6d,0x6d));
                ivSales.setVisibility(View.INVISIBLE);
                tvPrice.setTextColor(Color.rgb(0x6d,0x6d,0x6d));
                ivPrice.setVisibility(View.INVISIBLE);
            break;
            case R.id.tv_activity_item_grid_classify_sales:
                tvSales.setTextColor(Color.rgb(0xce,0x10,0x4f));
                ivSales.setVisibility(View.VISIBLE);
                tvDefault.setTextColor(Color.rgb(0x6d,0x6d,0x6d));
                ivDefault.setVisibility(View.INVISIBLE);
                tvNew.setTextColor(Color.rgb(0x6d,0x6d,0x6d));
                ivNew.setVisibility(View.INVISIBLE);
                tvPrice.setTextColor(Color.rgb(0x6d,0x6d,0x6d));
                ivPrice.setVisibility(View.INVISIBLE);
            break;
            case R.id.ll_activity_item_grid_classify_price:
                tvPrice.setTextColor(Color.rgb(0xce,0x10,0x4f));
                ivPrice.setVisibility(View.VISIBLE);
                tvDefault.setTextColor(Color.rgb(0x6d,0x6d,0x6d));
                ivDefault.setVisibility(View.INVISIBLE);
                tvNew.setTextColor(Color.rgb(0x6d,0x6d,0x6d));
                ivNew.setVisibility(View.INVISIBLE);
                tvSales.setTextColor(Color.rgb(0x6d,0x6d,0x6d));
                ivSales.setVisibility(View.INVISIBLE);
            break;
        }
    }
}
