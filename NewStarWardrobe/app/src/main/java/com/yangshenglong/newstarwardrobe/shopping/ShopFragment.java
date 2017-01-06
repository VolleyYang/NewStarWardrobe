package com.yangshenglong.newstarwardrobe.shopping;

import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.yangshenglong.newstarwardrobe.R;
import com.yangshenglong.newstarwardrobe.base.BaseFragment;
import com.yangshenglong.newstarwardrobe.shopping.adapter.ShopTabAdapter;
import com.yangshenglong.newstarwardrobe.shopping.fragment.AllFragment;
import com.yangshenglong.newstarwardrobe.shopping.fragment.BeautyFragment;
import com.yangshenglong.newstarwardrobe.shopping.fragment.ChinaFragment;
import com.yangshenglong.newstarwardrobe.shopping.fragment.OverSeasFragment;

import java.util.ArrayList;

/**
 * Created by VolleyYang on 16/12/20.
 */

public class ShopFragment extends BaseFragment {

    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private ArrayList<Fragment> data;


    @Override
    public int setLayout() {
        return R.layout.fragment_shop;
    }

    @Override
    public void initView(View view) {

        mTabLayout = (TabLayout) view.findViewById(R.id.tab_shop);
        mViewPager = (ViewPager) view.findViewById(R.id.vp_shop);

    }

    @Override
    public void initData() {

        data = new ArrayList<>();

        data.add(new AllFragment());//全部
        data.add(new ChinaFragment());//中国馆
        data.add(new OverSeasFragment());//海外馆
        data.add(new BeautyFragment());//美妆馆

        ShopTabAdapter adapter = new ShopTabAdapter(getChildFragmentManager(), data);
        mViewPager.setAdapter(adapter);
        mTabLayout.setupWithViewPager(mViewPager);
        mTabLayout.setTabTextColors(Color.argb(255, 50, 30, 30), Color.argb(255, 255, 45, 71));


    }
}
