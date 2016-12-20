package com.yangshenglong.newstarwardrobe.classify;

import android.view.View;

import com.yangshenglong.newstarwardrobe.R;
import com.yangshenglong.newstarwardrobe.base.BaseFragment;

/**
 * Created by VolleyYang on 16/12/20.
 */

public class ClassifyFragment extends BaseFragment {

    private String url = "http://api-v2.mall.hichao.com/category/list?ga=%2Fcategory%2Flist";
    @Override
    public int setLayout() {
        return R.layout.fragment_classify;
    }

    @Override
    public void initView(View view) {

    }

    @Override
    public void initData() {

    }
}
