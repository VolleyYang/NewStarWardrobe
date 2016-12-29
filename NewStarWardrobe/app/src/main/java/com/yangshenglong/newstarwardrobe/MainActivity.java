package com.yangshenglong.newstarwardrobe;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.yangshenglong.newstarwardrobe.base.BaseActivity;
import com.yangshenglong.newstarwardrobe.classify.ClassifyFragment;
import com.yangshenglong.newstarwardrobe.fashion.FashionFragment;
import com.yangshenglong.newstarwardrobe.message.MessageFragment;
import com.yangshenglong.newstarwardrobe.mine.MineFragment;
import com.yangshenglong.newstarwardrobe.shopping.ShopFragment;

public class MainActivity extends BaseActivity implements View.OnClickListener {
    private TextView tvShop, tvClassify, tvFashion, tvMessage, tvMine;
    private ImageView ivShop, ivClassify, ivFashion, ivMessage, ivMine;
    private LinearLayout llShop, llClassify, llFashion, llMessage, llMine;

    @Override
    public int setLayout() {
        return R.layout.activity_main;
    }

    @Override
    public void initView() {
        tvShop = (TextView) findViewById(R.id.tv_shop);
        tvClassify = (TextView) findViewById(R.id.tv_classify);
        tvFashion = (TextView) findViewById(R.id.tv_fashion);
        tvMessage = (TextView) findViewById(R.id.tv_message);
        tvMine = (TextView) findViewById(R.id.tv_mine);
        ivShop = (ImageView) findViewById(R.id.iv_shop);
        ivClassify = (ImageView) findViewById(R.id.iv_classify);
        ivFashion = (ImageView) findViewById(R.id.iv_fashion);
        ivMessage = (ImageView) findViewById(R.id.iv_message);
        ivMine = (ImageView) findViewById(R.id.iv_mine);
        llShop = (LinearLayout) findViewById(R.id.ll_shop);
        llClassify = (LinearLayout) findViewById(R.id.ll_classify);
        llFashion = (LinearLayout) findViewById(R.id.ll_fashion);
        llMessage = (LinearLayout) findViewById(R.id.ll_message);
        llMine = (LinearLayout) findViewById(R.id.ll_mine);
    }


    @Override
    public void initData() {
        llShop.setOnClickListener(this);
        llClassify.setOnClickListener(this);
        llFashion.setOnClickListener(this);
        llMessage.setOnClickListener(this);
        llMine.setOnClickListener(this);
        ivShop.setImageResource(R.mipmap.bottom_home_icon_on);
        tvShop.setTextColor(Color.rgb(0xce,0x10,0x4f));
        ivClassify.setImageResource(R.mipmap.buttom_class);
        tvClassify.setTextColor(Color.rgb(0x74,0x74,0x74));
        ivFashion.setImageResource(R.mipmap.buttom_bbs);
        tvFashion.setTextColor(Color.rgb(0x74,0x74,0x74));
        ivMessage.setImageResource(R.mipmap.buttom_massage);
        tvMessage.setTextColor(Color.rgb(0x74,0x74,0x74));
        ivMine.setImageResource(R.mipmap.bottom_like_icon);
        tvMine.setTextColor(Color.rgb(0x74,0x74,0x74));
        replace(new ShopFragment());
        llShop.setClickable(false);
        llClassify.setClickable(true);
        llFashion.setClickable(true);
        llMessage.setClickable(true);
        llMine.setClickable(true);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ll_shop:
                ivShop.setImageResource(R.mipmap.bottom_home_icon_on);
                tvShop.setTextColor(Color.rgb(0xce,0x10,0x4f));
                ivClassify.setImageResource(R.mipmap.buttom_class);
                tvClassify.setTextColor(Color.rgb(0x74,0x74,0x74));
                ivFashion.setImageResource(R.mipmap.buttom_bbs);
                tvFashion.setTextColor(Color.rgb(0x74,0x74,0x74));
                ivMessage.setImageResource(R.mipmap.buttom_massage);
                tvMessage.setTextColor(Color.rgb(0x74,0x74,0x74));
                ivMine.setImageResource(R.mipmap.bottom_like_icon);
                tvMine.setTextColor(Color.rgb(0x74,0x74,0x74));
                llShop.setBackgroundColor(Color.rgb(0xee,0xee,0xee));
                llClassify.setBackgroundColor(Color.rgb(0xff,0xff,0xff));
                llFashion.setBackgroundColor(Color.rgb(0xff,0xff,0xff));
                llMessage.setBackgroundColor(Color.rgb(0xff,0xff,0xff));
                llMine.setBackgroundColor(Color.rgb(0xff,0xff,0xff));
                replace(new ShopFragment());
                llShop.setClickable(false);
                llClassify.setClickable(true);
                llFashion.setClickable(true);
                llMessage.setClickable(true);
                llMine.setClickable(true);
                break;
            case R.id.ll_classify:
                ivShop.setImageResource(R.mipmap.bottom_home_icon);
                tvShop.setTextColor(Color.rgb(0x74,0x74,0x74));
                ivClassify.setImageResource(R.mipmap.buttom_class_on);
                tvClassify.setTextColor(Color.rgb(0xce,0x10,0x4f));
                ivFashion.setImageResource(R.mipmap.buttom_bbs);
                tvFashion.setTextColor(Color.rgb(0x74,0x74,0x74));
                ivMessage.setImageResource(R.mipmap.buttom_massage);
                tvMessage.setTextColor(Color.rgb(0x74,0x74,0x74));
                ivMine.setImageResource(R.mipmap.bottom_like_icon);
                tvMine.setTextColor(Color.rgb(0x74,0x74,0x74));
                llShop.setBackgroundColor(Color.rgb(0xff,0xff,0xff));
                llClassify.setBackgroundColor(Color.rgb(0xee,0xee,0xee));
                llFashion.setBackgroundColor(Color.rgb(0xff,0xff,0xff));
                llMessage.setBackgroundColor(Color.rgb(0xff,0xff,0xff));
                llMine.setBackgroundColor(Color.rgb(0xff,0xff,0xff));
                replace(new ClassifyFragment());
                llShop.setClickable(true);
                llClassify.setClickable(false);
                llFashion.setClickable(true);
                llMessage.setClickable(true);
                llMine.setClickable(true);
                break;
            case R.id.ll_fashion:
                ivShop.setImageResource(R.mipmap.bottom_home_icon);
                tvShop.setTextColor(Color.rgb(0x74,0x74,0x74));
                ivClassify.setImageResource(R.mipmap.buttom_class);
                tvClassify.setTextColor(Color.rgb(0x74,0x74,0x74));
                ivFashion.setImageResource(R.mipmap.buttom_bbs_on);
                tvFashion.setTextColor(Color.rgb(0xce,0x10,0x4f));
                ivMessage.setImageResource(R.mipmap.buttom_massage);
                tvMessage.setTextColor(Color.rgb(0x74,0x74,0x74));
                ivMine.setImageResource(R.mipmap.bottom_like_icon);
                tvMine.setTextColor(Color.rgb(0x74,0x74,0x74));
                llShop.setBackgroundColor(Color.rgb(0xff,0xff,0xff));
                llClassify.setBackgroundColor(Color.rgb(0xff,0xff,0xff));
                llFashion.setBackgroundColor(Color.rgb(0xee,0xee,0xee));
                llMessage.setBackgroundColor(Color.rgb(0xff,0xff,0xff));
                llMine.setBackgroundColor(Color.rgb(0xff,0xff,0xff));
                replace(new FashionFragment());
                llShop.setClickable(true);
                llClassify.setClickable(true);
                llFashion.setClickable(false);
                llMessage.setClickable(true);
                llMine.setClickable(true);
                break;
            case R.id.ll_message:
                ivShop.setImageResource(R.mipmap.bottom_home_icon);
                tvShop.setTextColor(Color.rgb(0x74,0x74,0x74));
                ivClassify.setImageResource(R.mipmap.buttom_class);
                tvClassify.setTextColor(Color.rgb(0x74,0x74,0x74));
                ivFashion.setImageResource(R.mipmap.buttom_bbs);
                tvFashion.setTextColor(Color.rgb(0x74,0x74,0x74));
                ivMessage.setImageResource(R.mipmap.buttom_massage_on);
                tvMessage.setTextColor(Color.rgb(0xce,0x10,0x4f));
                ivMine.setImageResource(R.mipmap.bottom_like_icon);
                tvMine.setTextColor(Color.rgb(0x74,0x74,0x74));
                llShop.setBackgroundColor(Color.rgb(0xff,0xff,0xff));
                llClassify.setBackgroundColor(Color.rgb(0xff,0xff,0xff));
                llFashion.setBackgroundColor(Color.rgb(0xff,0xff,0xff));
                llMessage.setBackgroundColor(Color.rgb(0xee,0xee,0xee));
                llMine.setBackgroundColor(Color.rgb(0xff,0xff,0xff));
                replace(new MessageFragment());
                llShop.setClickable(true);
                llClassify.setClickable(true);
                llFashion.setClickable(true);
                llMessage.setClickable(false);
                llMine.setClickable(true);
                break;
            case R.id.ll_mine:
                ivShop.setImageResource(R.mipmap.bottom_home_icon);
                tvShop.setTextColor(Color.rgb(0x74,0x74,0x74));
                ivClassify.setImageResource(R.mipmap.buttom_class);
                tvClassify.setTextColor(Color.rgb(0x74,0x74,0x74));
                ivFashion.setImageResource(R.mipmap.buttom_bbs);
                tvFashion.setTextColor(Color.rgb(0x74,0x74,0x74));
                ivMessage.setImageResource(R.mipmap.buttom_massage);
                tvMessage.setTextColor(Color.rgb(0x74,0x74,0x74));
                ivMine.setImageResource(R.mipmap.bottom_like_icon_on);
                tvMine.setTextColor(Color.rgb(0xce,0x10,0x4f));
                llShop.setBackgroundColor(Color.rgb(0xff,0xff,0xff));
                llClassify.setBackgroundColor(Color.rgb(0xff,0xff,0xff));
                llFashion.setBackgroundColor(Color.rgb(0xff,0xff,0xff));
                llMessage.setBackgroundColor(Color.rgb(0xff,0xff,0xff));
                llMine.setBackgroundColor(Color.rgb(0xee,0xee,0xee));
                replace(new MineFragment());
                llShop.setClickable(true);
                llClassify.setClickable(true);
                llFashion.setClickable(true);
                llMessage.setClickable(true);
                llMine.setClickable(false);
                break;

        }
    }
    private void replace (Fragment fragment) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.frame_layout_main,fragment);
        transaction.commit();
    }
}
