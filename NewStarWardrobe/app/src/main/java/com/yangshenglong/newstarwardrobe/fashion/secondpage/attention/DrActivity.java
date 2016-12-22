package com.yangshenglong.newstarwardrobe.fashion.secondpage.attention;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import com.github.jdsjlzx.interfaces.OnRefreshListener;
import com.github.jdsjlzx.recyclerview.LRecyclerView;
import com.github.jdsjlzx.recyclerview.LRecyclerViewAdapter;
import com.yangshenglong.newstarwardrobe.R;
import com.yangshenglong.newstarwardrobe.base.BaseActivity;
import com.yangshenglong.newstarwardrobe.okhttp.NetTool;
import com.yangshenglong.newstarwardrobe.okhttp.onHttpCallback;
import com.yangshenglong.newstarwardrobe.staticclass.StaticUrl;

public class DrActivity extends BaseActivity {

    private LRecyclerView lRecyclerView;
    private DrRvAdapter rvAdapter;
    private LRecyclerViewAdapter lRecyclerViewAdapter;
    private LinearLayoutManager manager;

    @Override
    public int setLayout() {
        return R.layout.activity_dr;
    }

    @Override
    public void initView() {

        lRecyclerView = (LRecyclerView) findViewById(R.id.dr_rv);
    }

    @Override
    public void initData() {

        //初始化适配器
        rvAdapter = new DrRvAdapter(this);
        lRecyclerViewAdapter = new LRecyclerViewAdapter(rvAdapter);
        manager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        lRecyclerView.setLayoutManager(manager);

        //解析
        getInternet();
    }

    private void getInternet() {
        NetTool.getInstance().startRequest(StaticUrl.WARDROBEDR, DrBean.class, new onHttpCallback<DrBean>() {
            @Override
            public void onSuccess(DrBean response) {
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
