package com.yangshenglong.newstarwardrobe.fashion.secondpage.recommend;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;

import com.yangshenglong.newstarwardrobe.R;
import com.yangshenglong.newstarwardrobe.base.BaseActivity;
import com.yangshenglong.newstarwardrobe.okhttp.NetTool;
import com.yangshenglong.newstarwardrobe.okhttp.onHttpCallback;

public class BannerPageAty extends BaseActivity {

    private Intent intent;
    private String webId;
    private String webUrl;
    private WebView webView;
    private String web;

    @Override
    public int setLayout() {
        return R.layout.activity_banner_page_aty;
    }

    @Override
    public void initView() {
        webView = (WebView) findViewById(R.id.banner_web);
    }

    @Override
    public void initData() {
        intent = getIntent();
        webId = intent.getStringExtra("webId");
        webUrl = "http://api-v2.mall.hichao.com/forum/post-new?ga=%2Fforum%2Fpost-new&id=" + webId;

        getInternet();

        webView.loadUrl(web);
    }

    private void getInternet() {
        NetTool.getInstance().startRequest(webUrl, BannerPageBean.class, new onHttpCallback<BannerPageBean>() {
            @Override
            public void onSuccess(BannerPageBean response) {
                web = response.getResponse().getData().getShareAction().getShare().getDetailUrl();
            }

            @Override
            public void onError(Throwable e) {

            }
        });
    }
}
