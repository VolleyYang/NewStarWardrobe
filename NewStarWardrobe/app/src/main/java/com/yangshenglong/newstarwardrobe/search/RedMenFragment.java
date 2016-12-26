package com.yangshenglong.newstarwardrobe.search;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.yangshenglong.newstarwardrobe.R;
import com.yangshenglong.newstarwardrobe.base.BaseFragment;
import com.yangshenglong.newstarwardrobe.okhttp.NetTool;
import com.yangshenglong.newstarwardrobe.okhttp.onHttpCallback;

import java.util.ArrayList;

/**
 * Created by CST on 16/12/23.
 */

public class RedMenFragment extends BaseFragment{
    private ArrayList<RedMenHeadBean> headData;
    private ArrayList<RedMenPostsBean> postsData;
    private ArrayList<RedMenLikeBean> likeData;
    private RecyclerView mRecyclerView;
    private ImageView iv;
    private TextView tvTitle,tvFollow;
    private String headUrl,postsUrl,likeUrl,str;

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public int setLayout() {
        return R.layout.fragment_red_men;
    }

    @Override
    public void initView(View view) {
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler_view_fragment_red_men);
        iv = (ImageView) view.findViewById(R.id.iv_fragment_red_men_close);
        tvTitle = (TextView) view.findViewById(R.id.tv_fragment_red_men_name);
        tvFollow = (TextView) view.findViewById(R.id.tv_fragment_red_men_follow);

    }

    @Override
    public void initData() {

    }
    private ArrayList<RedMenHeadBean> headOk (String headUrl){
        headData = new ArrayList<>();
        NetTool.getInstance().startRequest(headUrl, RedMenHeadBean.class, new onHttpCallback<RedMenHeadBean>() {
            @Override
            public void onSuccess(RedMenHeadBean response) {
                headData.add(response);
            }

            @Override
            public void onError(Throwable e) {

            }
        });
        return  headData;
    }
    private ArrayList<RedMenPostsBean> postsOk (String postsUrl){
        postsData = new ArrayList<>();
        NetTool.getInstance().startRequest(postsUrl, RedMenPostsBean.class, new onHttpCallback<RedMenPostsBean>() {
            @Override
            public void onSuccess(RedMenPostsBean response) {
                postsData.add(response);
            }

            @Override
            public void onError(Throwable e) {

            }
        });

        return postsData;
    }
    private ArrayList<RedMenLikeBean> likeOk (String likeUrl) {
        likeData = new ArrayList<>();
        NetTool.getInstance().startRequest(likeUrl, RedMenLikeBean.class, new onHttpCallback<RedMenLikeBean>() {
            @Override
            public void onSuccess(RedMenLikeBean response) {
                likeData.add(response);
            }

            @Override
            public void onError(Throwable e) {

            }
        });
        return likeData;
    }
}
