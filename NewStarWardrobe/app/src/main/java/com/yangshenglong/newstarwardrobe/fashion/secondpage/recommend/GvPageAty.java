package com.yangshenglong.newstarwardrobe.fashion.secondpage.recommend;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.yangshenglong.newstarwardrobe.R;
import com.yangshenglong.newstarwardrobe.base.BaseActivity;
import com.yangshenglong.newstarwardrobe.okhttp.NetTool;
import com.yangshenglong.newstarwardrobe.okhttp.onHttpCallback;

public class GvPageAty extends BaseActivity {

    private Intent intent;
    private String id;
    private String pageId;

    @Override
    public int setLayout() {
        return R.layout.activity_gv_page_aty;
    }

    @Override
    public void initView() {

    }

    @Override
    public void initData() {
        intent = getIntent();
        id = intent.getStringExtra("gvId");

        pageId = " http://api-v2.mall.hichao.com/forum/tag/get-new?flag=&tag_id="+ id + "526&recommend=1&ga=%2Fforum%2Ftag%2Fget-new";

        getInternet();
    }

    private void getInternet() {
        NetTool.getInstance().startRequest(pageId, GvPageBean.class, new onHttpCallback<GvPageBean>() {
            @Override
            public void onSuccess(GvPageBean response) {

            }

            @Override
            public void onError(Throwable e) {

            }
        });
    }
}
