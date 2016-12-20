package com.yangshenglong.newstarwardrobe.fashion.levelpage.recommend;

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

        //网络解析
        getInternet();
    }

    private void getInternet() {
        NetTool.getInstance().startRequest(StaticUrl.RECOMMEND, RecommendBean.class, new onHttpCallback<RecommendBean>() {
            @Override
            public void onSuccess(RecommendBean response) {

            }

            @Override
            public void onError(Throwable e) {

            }
        });
    }
}
