package com.yangshenglong.newstarwardrobe.shopping.fragment;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.yangshenglong.newstarwardrobe.R;
import com.yangshenglong.newstarwardrobe.base.BaseFragment;
import com.yangshenglong.newstarwardrobe.okhttp.NetTool;
import com.yangshenglong.newstarwardrobe.okhttp.onHttpCallback;
import com.yangshenglong.newstarwardrobe.shopping.adapter.BeautyAdapter;
import com.yangshenglong.newstarwardrobe.shopping.bean.BeautyDataBrand;
import com.yangshenglong.newstarwardrobe.shopping.bean.BeautyDataContent;
import com.yangshenglong.newstarwardrobe.shopping.bean.BeautyDataTitle;

/**
 * Created by xiaoBu on 16/12/20.
 */

public class BeautyFragment extends BaseFragment {

    private RecyclerView mRecyclerView;
    private BeautyAdapter mAdapter;

    @Override
    public int setLayout() {
        return R.layout.fragment_xiaobu_beautiful;
    }

    @Override
    public void initView(View view) {

        mRecyclerView = (RecyclerView) view.findViewById(R.id.rv_xiaobu_beauty);

    }

    @Override
    public void initData() {

        mAdapter = new BeautyAdapter(getContext());

        isResolveTitle();
        isResolveBrand();
        isResolveContent();

    }

    /**
     * 正文解析
     */
    private void isResolveContent() {

        String url = "http://api-v2.mall.hichao.com/region/recommend-goods?flag=&ga=%2Fregion%2Frecommend-goods&id=5";
        NetTool.getInstance().startRequest(url, BeautyDataContent.class, new onHttpCallback<BeautyDataContent>() {
            @Override
            public void onSuccess(BeautyDataContent response) {

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

        String url = "http://api-v2.mall.hichao.com/region/detail/brands/prefecture-promotion?ga=%2Fregion%2Fdetail%2Fbrands%2Fprefecture-promotion&id=5";
        NetTool.getInstance().startRequest(url, BeautyDataBrand.class, new onHttpCallback<BeautyDataBrand>() {
            @Override
            public void onSuccess(BeautyDataBrand response) {

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

        String url = "http://api-v2.mall.hichao.com/region/detail/banner/get-prefecture-banner?ga=%2Fregion%2Fdetail%2Fbanner%2Fget-prefecture-banner&id=5";
        NetTool.getInstance().startRequest(url, BeautyDataTitle.class, new onHttpCallback<BeautyDataTitle>() {
            @Override
            public void onSuccess(BeautyDataTitle response) {

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
