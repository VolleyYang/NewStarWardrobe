package com.yangshenglong.newstarwardrobe.fashion.secondpage.recommend;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.WebView;

import com.github.jdsjlzx.interfaces.OnRefreshListener;
import com.github.jdsjlzx.recyclerview.LRecyclerView;
import com.github.jdsjlzx.recyclerview.LRecyclerViewAdapter;
import com.yangshenglong.newstarwardrobe.R;
import com.yangshenglong.newstarwardrobe.base.BaseActivity;
import com.yangshenglong.newstarwardrobe.okhttp.NetTool;
import com.yangshenglong.newstarwardrobe.okhttp.onHttpCallback;

public class RvPageAty extends BaseActivity {

    private LRecyclerView lRecyclerView;
    private LRecyclerViewAdapter lRecyclerViewAdapter;
    private RvPageAdapter  adapter;

    private String webUrl;
    private String webId;

    private WebView webView;
    private View view;
    private String getWeb;
    private String checkUrl;

    @Override
    public int setLayout() {
        return R.layout.activity_rv_page_aty;
    }

    @Override
    public void initView() {
        lRecyclerView = (LRecyclerView) findViewById(R.id.recommend_rv_page);

        view = LayoutInflater.from(getBaseContext()).inflate(R.layout.item_rv_page_aty,null);

        webView = (WebView)view.findViewById(R.id.rv_page_aty_web);
    }

    @Override
    public void initData() {
        Intent intent = getIntent();
        webId = intent.getStringExtra("rvWeb");




        webUrl = "http://api-v2.mall.hichao.com/forum/post-new?ga=%2Fforum%2Fpost-new&id="+ webId;
        checkUrl = "http://api-v2.mall.hichao.com/forum/post-new/recommend-thread?thread_id="+webId+"&ga=%2Fforum%2Fpost-new%2Frecommend-thread&tags=55%2C526";


        //初始化适配器
        adapter = new RvPageAdapter(getBaseContext());
        lRecyclerViewAdapter = new LRecyclerViewAdapter(adapter);




        GridLayoutManager manager = new GridLayoutManager(getBaseContext(),2);
        lRecyclerView.setLayoutManager(manager);

        //下拉刷新
        lRecyclerView.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh() {
                lRecyclerView.refreshComplete();
                lRecyclerViewAdapter.notifyDataSetChanged();
            }
        });






        //网络解析
        getInternet();

        //WebView  网络解析
        webInternet();


        //加头布局
        lRecyclerViewAdapter.addHeaderView(view);
        webView.getSettings().setJavaScriptEnabled(true);

        webView.loadUrl(getWeb);
    }

    //WebView  网络解析
    private void webInternet() {
        NetTool.getInstance().startRequest(webUrl, RvPageWebBean.class, new onHttpCallback<RvPageWebBean>() {
            @Override
            public void onSuccess(RvPageWebBean response) {
                getWeb = response.getResponse().getData().getShareAction().getShare().getDetailUrl();
            }

            @Override
            public void onError(Throwable e) {

            }
        });

    }

    //网络解析
    private void getInternet() {
        NetTool.getInstance().startRequest(checkUrl, RvPageBean.class, new onHttpCallback<RvPageBean>() {
            @Override
            public void onSuccess(RvPageBean response) {
                adapter.setData(response);


                //绑定适配器
                lRecyclerView.setAdapter(lRecyclerViewAdapter);



            }

            @Override
            public void onError(Throwable e) {

            }
        });
    }
}
