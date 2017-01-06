package com.yangshenglong.newstarwardrobe.shopping.third.brand.fragment;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.yangshenglong.newstarwardrobe.R;
import com.yangshenglong.newstarwardrobe.base.BaseFragment;
import com.yangshenglong.newstarwardrobe.okhttp.NetTool;
import com.yangshenglong.newstarwardrobe.okhttp.onHttpCallback;
import com.yangshenglong.newstarwardrobe.shopping.third.brand.BrandAdapterContent;
import com.yangshenglong.newstarwardrobe.shopping.third.brand.BrandDataContent;

/**
 * Created by xiaoBu on 16/12/28.
 */

public class BrandPopOthersFragment extends BaseFragment {

    private RecyclerView mRecyclerView;

    @Override
    public int setLayout() {
        return R.layout.fragment_xiaobu_third_brand_content;
    }

    @Override
    public void initView(View view) {

        mRecyclerView = (RecyclerView) view.findViewById(R.id.rv_xiaobu_third_brand_content);
    }

    @Override
    public void initData() {

        isResolve();
    }

    private void isResolve() {

        String url = "http://api-v2.mall.hichao.com/business-shop/list?flag=&method=%2Fbusiness-shop%2Flist&data=eyJjaWQiOiIxNzEiLCJidXNpbmVzc19pZCI6IjIzMDIiLCJzb3J0IjoiNiIsImdhIjoiaHR0cDovL2FwaS12Mi5tYWxsLmhpY2hhby5jb20iLCJ0eXBlIjoiMiIsImZsYWciOiIifQ%3D%3D&sign=7b54235240cfc6fe5e784f72000fb368&ga=http%3A%2F%2Fapi-v2.mall.hichao.com&source=mxyc_adr&sort=6&type=2&business_id=2302&version=7.1.0&cid=171";

        NetTool.getInstance().startRequest(url, BrandDataContent.class, new onHttpCallback<BrandDataContent>() {
            @Override
            public void onSuccess(BrandDataContent response) {

                BrandAdapterContent adapter = new BrandAdapterContent(getContext());
                adapter.setData(response);
                mRecyclerView.setAdapter(adapter);
                GridLayoutManager manager = new GridLayoutManager(getContext(), 2);
                mRecyclerView.setLayoutManager(manager);
            }

            @Override
            public void onError(Throwable e) {

            }
        });
    }
}
