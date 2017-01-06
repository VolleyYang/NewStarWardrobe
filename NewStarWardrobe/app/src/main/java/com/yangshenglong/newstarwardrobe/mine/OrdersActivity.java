package com.yangshenglong.newstarwardrobe.mine;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.widget.ImageView;

import com.yangshenglong.newstarwardrobe.R;
import com.yangshenglong.newstarwardrobe.base.BaseActivity;

/**
 * Created by CST on 17/1/4.
 */

public class OrdersActivity extends BaseActivity{
    private ImageView ivClose;
    private TabLayout mTabLayout;
    private ViewPager mViewPager;
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

    }
}
