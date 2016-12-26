package com.yangshenglong.newstarwardrobe.search;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.yangshenglong.newstarwardrobe.R;
import com.yangshenglong.newstarwardrobe.base.BaseFragment;
import com.yangshenglong.newstarwardrobe.okhttp.NetTool;
import com.yangshenglong.newstarwardrobe.okhttp.onHttpCallback;

import java.util.ArrayList;

import static com.yangshenglong.newstarwardrobe.staticclass.StaticUrl.RED_SEARCH_URL_LEFT;
import static com.yangshenglong.newstarwardrobe.staticclass.StaticUrl.RED_SEARCH_URL_RIGHT;

/**
 * Created by CST on 16/12/24.
 */

public class RedMenSearchFragment extends BaseFragment{
    private ArrayList<RedMenSearchBean> data;
    private RecyclerView mRecyclerView;
    private String url,str;

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public int setLayout() {
        return R.layout.fragment_red_men_search;
    }

    @Override
    public void initView(View view) {
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler_view_fragment_red_men_search);
    }

    @Override
    public void initData() {
        url = RED_SEARCH_URL_LEFT+str+RED_SEARCH_URL_RIGHT;
        data = new ArrayList<>();
        NetTool.getInstance().startRequest(url, RedMenSearchBean.class, new onHttpCallback<RedMenSearchBean>() {
            @Override
            public void onSuccess(RedMenSearchBean response) {
                data.add(response);
                RedMenSearchAdapter adapter = new RedMenSearchAdapter(getActivity());
                adapter.setData(data);
                mRecyclerView.setAdapter(adapter);
                mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
            }

            @Override
            public void onError(Throwable e) {

            }
        });
    }
}
