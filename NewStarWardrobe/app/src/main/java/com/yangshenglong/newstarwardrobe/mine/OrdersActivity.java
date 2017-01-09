package com.yangshenglong.newstarwardrobe.mine;

import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;

import com.yangshenglong.newstarwardrobe.R;
import com.yangshenglong.newstarwardrobe.base.BaseActivity;

import java.util.ArrayList;

/**
 * Created by CST on 17/1/4.
 */

public class OrdersActivity extends BaseActivity implements View.OnClickListener {
    private ImageView ivClose;
    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private ArrayList<Fragment> data;
    private int type = 0;
    @Override
    public int setLayout() {
        return R.layout.activity_orders;
    }

    @Override
    public void initView() {
        ivClose = (ImageView) findViewById(R.id.iv_activity_orders_close);
        mTabLayout = (TabLayout) findViewById(R.id.tab_layout_activity_orders);
        mViewPager = (ViewPager) findViewById(R.id.view_pager_activity_orders);
    }

    @Override
    public void initData() {
        ivClose.setOnClickListener(this);
        type = getIntent().getIntExtra("type",0);
        data = new ArrayList<>();
        data.add(OrdersFragment.newInstance(""));
        data.add(OrdersFragment.newInstance("待付款"));
        data.add(OrdersFragment.newInstance("待发货"));
        data.add(OrdersFragment.newInstance("待收货"));
        data.add(OrdersFragment.newInstance("带评价"));
        OrdersAdapter adapter = new OrdersAdapter(getSupportFragmentManager(),data);
        mViewPager.setAdapter(adapter);
        mTabLayout.setupWithViewPager(mViewPager);
        mTabLayout.setTabTextColors(Color.BLACK,Color.rgb(0xce, 0x10, 0x4f));
        mTabLayout.setSelectedTabIndicatorColor(Color.rgb(0xce, 0x10, 0x4f));
        switch (type){
            case 0:
                mTabLayout.getTabAt(0).select();
                break;
            case 1:
                mTabLayout.getTabAt(1).select();
                break;
            case 2:
                mTabLayout.getTabAt(2).select();
                break;
            case 3:
                mTabLayout.getTabAt(3).select();
                break;
            case 4:
                mTabLayout.getTabAt(4).select();
                break;
        }

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.iv_activity_orders_close:
                finish();
                break;
        }
    }
}
