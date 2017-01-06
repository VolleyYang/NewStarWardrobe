package com.yangshenglong.newstarwardrobe.mine;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by CST on 17/1/4.
 */

public class OrdersAdapter extends FragmentPagerAdapter{
    private ArrayList<Fragment> data;
    private String[] title = {"全部","待付款","待发货","待收货","待评价"};

    public OrdersAdapter(FragmentManager fm, ArrayList<Fragment> data) {
        super(fm);
        this.data = data;
    }

    public OrdersAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return data.get(position);
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }
}
