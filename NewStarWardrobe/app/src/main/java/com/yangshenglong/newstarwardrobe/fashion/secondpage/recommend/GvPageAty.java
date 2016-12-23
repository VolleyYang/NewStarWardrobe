package com.yangshenglong.newstarwardrobe.fashion.secondpage.recommend;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

import com.yangshenglong.newstarwardrobe.R;
import com.yangshenglong.newstarwardrobe.base.BaseActivity;
import com.yangshenglong.newstarwardrobe.okhttp.NetTool;
import com.yangshenglong.newstarwardrobe.okhttp.onHttpCallback;

public class GvPageAty extends BaseActivity implements View.OnClickListener {

    private Intent intent;
    private static String id;
    private String pageId;

    private TextView  gvTitle;
    private RadioButton  rbtChoice,rbtNewest;

    @Override
    public int setLayout() {
        return R.layout.activity_gv_page_aty;
    }

    @Override
    public void initView() {
        gvTitle = (TextView) findViewById(R.id.gv_title);
        rbtChoice = (RadioButton) findViewById(R.id.gv_rbt_choice);
        rbtNewest = (RadioButton) findViewById(R.id.gv_rbt_newest);
    }

    @Override
    public void initData() {

        replace(new GvPageChoiceFragment());

        intent = getIntent();
        id = intent.getStringExtra("gvId");

        pageId = " http://api-v2.mall.hichao.com/forum/tag/get-new?flag=&tag_id="+ id + "&recommend=1&ga=%2Fforum%2Ftag%2Fget-new";

        getInternet();

        rbtChoice.setOnClickListener(this);
        rbtNewest.setOnClickListener(this);
    }

    public static final String sendId(){
        return id;
    }
    //解析
    private void getInternet() {
        NetTool.getInstance().startRequest(pageId, GvPageBean.class, new onHttpCallback<GvPageBean>() {
            @Override
            public void onSuccess(GvPageBean response) {
                gvTitle.setText(response.getResponse().getData().getTagHead().getTitle());
            }

            @Override
            public void onError(Throwable e) {

            }
        });
    }

    //RadioButton
    public void replace(Fragment fragment){
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.gv_replace,fragment);
        transaction.commit();
    }

    //RadioButton
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.gv_rbt_choice:
                replace(new GvPageChoiceFragment());
                break;
            case R.id.gv_rbt_newest:
                replace(new GvPageNewestFragment());
                break;
        }
    }
}
