package com.yangshenglong.newstarwardrobe.search;

import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.yangshenglong.newstarwardrobe.R;
import com.yangshenglong.newstarwardrobe.base.BaseActivity;
import com.yangshenglong.newstarwardrobe.okhttp.NetTool;
import com.yangshenglong.newstarwardrobe.okhttp.onHttpCallback;

import java.util.ArrayList;

import static com.yangshenglong.newstarwardrobe.staticclass.StaticUrl.RED_MEN_HEAD_LEFT;
import static com.yangshenglong.newstarwardrobe.staticclass.StaticUrl.RED_MEN_HEAD_RIGHT;
import static com.yangshenglong.newstarwardrobe.staticclass.StaticUrl.RED_MEN_LIKE_LEFT;
import static com.yangshenglong.newstarwardrobe.staticclass.StaticUrl.RED_MEN_LIKE_RIGHT;
import static com.yangshenglong.newstarwardrobe.staticclass.StaticUrl.RED_MEN_POSTS_LEFT;
import static com.yangshenglong.newstarwardrobe.staticclass.StaticUrl.RED_MEN_POSTS_RIGHT;

/**
 * Created by CST on 16/12/23.
 */

public class RedMenActivity extends BaseActivity{
    private ArrayList<RedMenHeadBean> headData;
    private ArrayList<RedMenPostsBean> postsData;
    private ArrayList<RedMenLikeBean> likeData;
    private RecyclerView mRecyclerView;
    private ImageView iv;
    private TextView tvTitle,tvFollow;
    private String headUrl,postsUrl,likeUrl,str;
    private int id;
    private RedMenActivityRvAdapter mAdapter;


    @Override
    public int setLayout() {
        return R.layout.activity_red_men;
    }

    @Override
    public void initView() {
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view_activity_red_men);
        iv = (ImageView) findViewById(R.id.iv_activity_red_men_close);
        tvTitle = (TextView) findViewById(R.id.tv_activity_red_men_name);
        tvFollow = (TextView) findViewById(R.id.tv_activity_red_men_follow);
    }

    

    @Override
    public void initData() {
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        Intent intent = getIntent();
        id = intent.getIntExtra("id",0);
        str = intent.getStringExtra("title");
        mAdapter =  new RedMenActivityRvAdapter(this);
        if (id!=0){
            headUrl = RED_MEN_HEAD_LEFT+id+RED_MEN_HEAD_RIGHT;
            postsUrl = RED_MEN_POSTS_LEFT +id+ RED_MEN_POSTS_RIGHT;
            likeUrl =RED_MEN_LIKE_LEFT + id + RED_MEN_LIKE_RIGHT;
            headOk(headUrl);
        }

    }
    private ArrayList<RedMenHeadBean> headOk (String headUrl){
        headData = new ArrayList<>();
        NetTool.getInstance().startRequest(headUrl, RedMenHeadBean.class, new onHttpCallback<RedMenHeadBean>() {
            @Override
            public void onSuccess(RedMenHeadBean response) {
                headData.add(response);
                mAdapter.setHeadData(headData);
                postsOk(postsUrl);
            }

            @Override
            public void onError(Throwable e) {

            }
        });
        return headData;
    }
    private ArrayList<RedMenPostsBean> postsOk (String postsUrl){
        postsData = new ArrayList<>();
        NetTool.getInstance().startRequest(postsUrl, RedMenPostsBean.class, new onHttpCallback<RedMenPostsBean>() {
            @Override
            public void onSuccess(RedMenPostsBean response) {
                postsData.add(response);
                mAdapter.setPostsData(postsData);
                likeOk(likeUrl);
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
                mAdapter.setLikeData(likeData);
                mRecyclerView.setAdapter(mAdapter);
                mRecyclerView.setLayoutManager(new LinearLayoutManager(RedMenActivity.this));
            }

            @Override
            public void onError(Throwable e) {

            }
        });
        return likeData;
    }
}
