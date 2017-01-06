package com.yangshenglong.newstarwardrobe.shopping.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by xiaoBu on 16/12/20.
 */

public class ShopTabAdapter extends FragmentPagerAdapter {

    private ArrayList<Fragment> data;
    private String[] title = {"全部", "中国馆", "海外馆", "美妆馆"};

    public ShopTabAdapter(FragmentManager fm, ArrayList<Fragment> data) {
        super(fm);
        this.data = data;
    }

    @Override
    public Fragment getItem(int position) {
        return data != null ? data.get(position) : null;
    }

    @Override
    public int getCount() {
        return data != null ? data.size() : 0;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }
}
