package com.yangshenglong.newstarwardrobe.shopping.fragment;

import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.yangshenglong.newstarwardrobe.R;
import com.yangshenglong.newstarwardrobe.base.BaseFragment;
import com.yangshenglong.newstarwardrobe.okhttp.NetTool;
import com.yangshenglong.newstarwardrobe.okhttp.onHttpCallback;
import com.yangshenglong.newstarwardrobe.shopping.adapter.AllAdapter;
import com.yangshenglong.newstarwardrobe.shopping.bean.AllDataContent;

/**
 * Created by xiaoBu on 16/12/20.
 */

public class AllFragment extends BaseFragment {

    private RecyclerView mRecyclerView;
    private SwipeRefreshLayout mSwipeRefreshLayout;
    private AllAdapter mAdapter;

    @Override
    public int setLayout() {
        return R.layout.fragment_xiaobu_all;
    }

    @Override
    public void initView(View view) {

        mRecyclerView = (RecyclerView) view.findViewById(R.id.rv_xiaobu_all);
        mSwipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.srl_xiaobu_all);

    }

    @Override
    public void initData() {

        isResolve();//解析
        isRefresh();//下拉刷新
    }

    private void isRefresh() {

        mSwipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                Toast.makeText(getContext(), "正在刷新", Toast.LENGTH_SHORT).show();
                mSwipeRefreshLayout.setRefreshing(true);
                mAdapter.notifyDataSetChanged();

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        Toast.makeText(getContext(), "刷新完成", Toast.LENGTH_SHORT).show();
                        mSwipeRefreshLayout.setRefreshing(false);
                    }
                }, 2500);

            }

        });

        // 设置四种颜色轮播
        mSwipeRefreshLayout.setColorSchemeResources(android.R.color.holo_blue_bright, android.R.color.holo_green_light,
                android.R.color.holo_orange_light, android.R.color.holo_red_light);

        // 设置初始时的大小
        mSwipeRefreshLayout.setSize(SwipeRefreshLayout.DEFAULT);

    }

    private void isResolve() {

        String url = "http://api-v2.mall.hichao.com/sku/list/bind-banner?flag=&ga=%2Fsku%2Flist%2Fbind-banner";

        NetTool.getInstance().startRequest(url, AllDataContent.class, new onHttpCallback<AllDataContent>() {
            @Override
            public void onSuccess(AllDataContent response) {

                mAdapter = new AllAdapter(getContext());
                mAdapter.setData(response);

                mRecyclerView.setAdapter(mAdapter);
                mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

            }

            @Override
            public void onError(Throwable e) {

                Toast.makeText(getContext(), "错误", Toast.LENGTH_SHORT).show();
            }
        });

    }

}
