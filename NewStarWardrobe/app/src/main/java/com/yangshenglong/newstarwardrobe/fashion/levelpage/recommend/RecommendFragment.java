package com.yangshenglong.newstarwardrobe.fashion.levelpage.recommend;

import android.support.v7.widget.LinearLayoutManager;
import android.view.View;

import com.github.jdsjlzx.recyclerview.LRecyclerView;
import com.github.jdsjlzx.recyclerview.LRecyclerViewAdapter;
import com.yangshenglong.newstarwardrobe.R;
import com.yangshenglong.newstarwardrobe.base.BaseFragment;
import com.yangshenglong.newstarwardrobe.okhttp.NetTool;
import com.yangshenglong.newstarwardrobe.okhttp.onHttpCallback;
import com.yangshenglong.newstarwardrobe.staticclass.StaticUrl;

/**
 * Created by VolleyYang on 16/12/20.
 */

public class RecommendFragment extends BaseFragment {

    private LRecyclerView  lRecyclerView;
    private LRecyclerViewAdapter  lRecyclerViewAdapter;
    private RecommendRvAdapter rvAdapter;

    @Override
    public int setLayout() {
        return R.layout.fragment_recommend;
    }

    @Override
    public void initView(View view) {
        lRecyclerView = (LRecyclerView) view.findViewById(R.id.recommend_rv);
    }

    @Override
    public void initData() {

        rvAdapter = new RecommendRvAdapter(getContext());
        lRecyclerViewAdapter = new LRecyclerViewAdapter(rvAdapter);
        //网络解析
        getInternet();
    }

    private void getInternet() {
        NetTool.getInstance().startRequest(StaticUrl.RECOMMEND, RecommendBean.class, new onHttpCallback<RecommendBean>() {
            @Override
            public void onSuccess(RecommendBean response) {
                rvAdapter.setData(response);
                lRecyclerView.setAdapter(rvAdapter);
                LinearLayoutManager manager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
                lRecyclerView.setLayoutManager(manager);
            }

            @Override
            public void onError(Throwable e) {

            }
        });
    }
}
