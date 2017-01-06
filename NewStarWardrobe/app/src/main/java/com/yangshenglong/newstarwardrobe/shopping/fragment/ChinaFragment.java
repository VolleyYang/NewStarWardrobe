package com.yangshenglong.newstarwardrobe.shopping.fragment;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.yangshenglong.newstarwardrobe.R;
import com.yangshenglong.newstarwardrobe.base.BaseFragment;
import com.yangshenglong.newstarwardrobe.okhttp.NetTool;
import com.yangshenglong.newstarwardrobe.okhttp.onHttpCallback;
import com.yangshenglong.newstarwardrobe.shopping.adapter.ChinaAdapter;
import com.yangshenglong.newstarwardrobe.shopping.bean.ChinaDataBrand;
import com.yangshenglong.newstarwardrobe.shopping.bean.ChinaDataContent;
import com.yangshenglong.newstarwardrobe.shopping.bean.ChinaDataTitle;

/**
 * Created by xiaoBu on 16/12/20.
 * 中国馆
 */

public class ChinaFragment extends BaseFragment {

    private RecyclerView mRecyclerView;
    private ChinaAdapter mAdapter;

    @Override
    public int setLayout() {
        return R.layout.fragment_xiaobu_china;
    }

    @Override
    public void initView(View view) {

        mRecyclerView = (RecyclerView) view.findViewById(R.id.rv_xiaobu_china);
    }

    @Override
    public void initData() {
        mAdapter = new ChinaAdapter(getContext());

        isResolveTitle();
        isResolveBrand();
        isResolveContent();

    }

    /**
     * 正文解析
     */
    private void isResolveContent() {

        String url = "http://api-v2.mall.hichao.com/region/recommend-goods?flag=&ga=%2Fregion%2Frecommend-goods&id=3";
        NetTool.getInstance().startRequest(url, ChinaDataContent.class, new onHttpCallback<ChinaDataContent>() {
            @Override
            public void onSuccess(ChinaDataContent response) {

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
     * 品牌解析
     */
    private void isResolveBrand() {

        String url = "http://api-v2.mall.hichao.com/region/detail/brands/prefecture-promotion?ga=%2Fregion%2Fdetail%2Fbrands%2Fprefecture-promotion&id=3";
        NetTool.getInstance().startRequest(url, ChinaDataBrand.class, new onHttpCallback<ChinaDataBrand>() {
            @Override
            public void onSuccess(ChinaDataBrand response) {

                mAdapter.setDataBrand(response);
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

        String url = "http://api-v2.mall.hichao.com/region/detail/banner/get-prefecture-banner?ga=%2Fregion%2Fdetail%2Fbanner%2Fget-prefecture-banner&id=3";
        NetTool.getInstance().startRequest(url, ChinaDataTitle.class, new onHttpCallback<ChinaDataTitle>() {
            @Override
            public void onSuccess(ChinaDataTitle response) {

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
