package com.yangshenglong.newstarwardrobe.fashion.secondpage.recommend;

import android.support.v7.widget.GridLayoutManager;
import android.view.View;

import com.github.jdsjlzx.interfaces.OnRefreshListener;
import com.github.jdsjlzx.recyclerview.LRecyclerView;
import com.github.jdsjlzx.recyclerview.LRecyclerViewAdapter;
import com.yangshenglong.newstarwardrobe.R;
import com.yangshenglong.newstarwardrobe.base.BaseFragment;
import com.yangshenglong.newstarwardrobe.okhttp.NetTool;
import com.yangshenglong.newstarwardrobe.okhttp.onHttpCallback;

/**
 * Created by VolleyYang on 16/12/23.
 */

public class GvPageNewestFragment extends BaseFragment {
    private LRecyclerView lRecyclerView;
    private LRecyclerViewAdapter lRecyclerViewAdapter;
    private GvPageRvAdapter rvAdapter;
    private String id;
    private String url;

    @Override
    public int setLayout() {
        return R.layout.fragment_gv_page_newest;
    }

    @Override
    public void initView(View view) {
        lRecyclerView = (LRecyclerView) view.findViewById(R.id.gv_page_new_rv);
    }

    @Override
    public void initData() {
        id = GvPageAty.sendId();
        url = "http://api-v2.mall.hichao.com/forum/tag/get-new?flag=&tag_id="+ id + "&recommend=0&ga=%2Fforum%2Ftag%2Fget-new";

        //初始化适配器
        rvAdapter = new GvPageRvAdapter(getContext());
        lRecyclerViewAdapter = new LRecyclerViewAdapter(rvAdapter);
        GridLayoutManager manager = new GridLayoutManager(getContext(),2);
        lRecyclerView.setLayoutManager(manager);

        //解析网络数据
        getInternet();
    }

    private void getInternet() {
        NetTool.getInstance().startRequest(url, GvPageBean.class, new onHttpCallback<GvPageBean>() {
            @Override
            public void onSuccess(GvPageBean response) {
                rvAdapter.setData(response);
                lRecyclerView.setAdapter(lRecyclerViewAdapter);
                //下拉刷新
                lRecyclerView.setOnRefreshListener(new OnRefreshListener() {
                    @Override
                    public void onRefresh() {
                        lRecyclerView.refreshComplete();
                        lRecyclerViewAdapter.notifyDataSetChanged();
                    }
                });
            }

            @Override
            public void onError(Throwable e) {

            }
        });
    }
}
