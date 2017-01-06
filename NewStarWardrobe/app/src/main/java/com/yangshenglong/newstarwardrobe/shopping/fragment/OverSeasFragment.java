package com.yangshenglong.newstarwardrobe.shopping.fragment;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.yangshenglong.newstarwardrobe.R;
import com.yangshenglong.newstarwardrobe.base.BaseFragment;
import com.yangshenglong.newstarwardrobe.okhttp.NetTool;
import com.yangshenglong.newstarwardrobe.okhttp.onHttpCallback;
import com.yangshenglong.newstarwardrobe.shopping.adapter.OverSeasAdapter;
import com.yangshenglong.newstarwardrobe.shopping.bean.OverSeasDataContent;
import com.yangshenglong.newstarwardrobe.shopping.bean.OverSeasDataTitle;

/**
 * Created by xiaoBu on 16/12/20.
 */

public class OverSeasFragment extends BaseFragment {

    private RecyclerView mRecyclerView;
    private OverSeasAdapter mAdapter;

    @Override
    public int setLayout() {
        return R.layout.fragment_xiaobu_overseas;
    }

    @Override
    public void initView(View view) {

        mRecyclerView = (RecyclerView) view.findViewById(R.id.rv_xiaobu_overseas);
    }

    @Override
    public void initData() {

        mAdapter = new OverSeasAdapter(getContext());

        isResolveTitle();
        isResolveContent();
    }

    /**
     * 正文解析
     */
    private void isResolveContent() {

        String url = "http://api-v2.mall.hichao.com/region/recommend-goods?flag=&ga=%2Fregion%2Frecommend-goods&id=4";
        NetTool.getInstance().startRequest(url, OverSeasDataContent.class, new onHttpCallback<OverSeasDataContent>() {
            @Override
            public void onSuccess(OverSeasDataContent response) {

                mAdapter.setDataContent(response);
                mRecyclerView.setAdapter(mAdapter);
                mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

            }

            @Override
            public void onError(Throwable e) {

            }
        });
    }


    /**
     * 题头图片解析
     */
    private void isResolveTitle() {

        String url = "http://api-v2.mall.hichao.com/region/detail/banner/get-prefecture-banner?ga=%2Fregion%2Fdetail%2Fbanner%2Fget-prefecture-banner&id=4";
        NetTool.getInstance().startRequest(url, OverSeasDataTitle.class, new onHttpCallback<OverSeasDataTitle>() {
            @Override
            public void onSuccess(OverSeasDataTitle response) {

                mAdapter.setDataTitle(response);
                mRecyclerView.setAdapter(mAdapter);
                mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
            }

            @Override
            public void onError(Throwable e) {

            }
        });
    }
}
