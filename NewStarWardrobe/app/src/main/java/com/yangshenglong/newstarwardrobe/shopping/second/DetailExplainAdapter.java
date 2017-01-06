package com.yangshenglong.newstarwardrobe.shopping.second;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by xiaoBu on 16/12/26.
 */

public class DetailExplainAdapter extends FragmentPagerAdapter {

    private ArrayList<Fragment> data;
    private String[] title = {"详情", "售后"};

    public DetailExplainAdapter(FragmentManager fm, ArrayList<Fragment> data) {
        super(fm);
        this.data = data;
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
