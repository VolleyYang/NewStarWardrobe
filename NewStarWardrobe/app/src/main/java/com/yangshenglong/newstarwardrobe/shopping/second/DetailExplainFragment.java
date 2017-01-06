package com.yangshenglong.newstarwardrobe.shopping.second;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.yangshenglong.newstarwardrobe.R;
import com.yangshenglong.newstarwardrobe.base.BaseFragment;

import java.util.ArrayList;

/**
 * Created by xiaoBu on 2016/12/25.
 */

public class DetailExplainFragment extends BaseFragment {

    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private ArrayList<Fragment> data;

    @Override
    public int setLayout() {
        return R.layout.fragment_xiaobu_second_detail_explain;
    }

    @Override
    public void initView(View view) {

        mTabLayout = (TabLayout) view.findViewById(R.id.tab_xiaobu_second_detail_explain);
        mViewPager = (ViewPager) view.findViewById(R.id.vp_xiaobu_second_detail_explain);
    }

    @Override
    public void initData() {

        data = new ArrayList<>();

        data.add(new DetailExplainFragmentShow());
        data.add(new DetailExplainFragmentAftermarket());

        DetailExplainAdapter adapter = new DetailExplainAdapter(getChildFragmentManager(), data);
        mViewPager.setAdapter(adapter);
        mTabLayout.setupWithViewPager(mViewPager);

    }
}
