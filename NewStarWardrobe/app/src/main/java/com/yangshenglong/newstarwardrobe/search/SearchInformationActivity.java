package com.yangshenglong.newstarwardrobe.search;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.yangshenglong.newstarwardrobe.R;
import com.yangshenglong.newstarwardrobe.base.BaseActivity;
import com.yangshenglong.newstarwardrobe.search.posts.PostsFragment;
import com.yangshenglong.newstarwardrobe.search.redmen.RedMenSearchFragment;

import java.util.ArrayList;

import static com.yangshenglong.newstarwardrobe.staticclass.StaticUrl.HAVE_MORE_SEARCH_INFORMATION;
import static com.yangshenglong.newstarwardrobe.staticclass.StaticUrl.NOT_HAVE_MORE_SEARCH_INFORMATION;
import static com.yangshenglong.newstarwardrobe.staticclass.StaticUrl.toUtf8;

/**
 * Created by CST on 16/12/22.
 */

public class SearchInformationActivity extends BaseActivity implements View.OnClickListener, SearchInformationClick {

    private ImageView ivClose;
    private TextView tvInformationOne, tvInformationTwo, tvInformationThree;
    private LinearLayout llInformationOne, llInformationTwo, llInformationThree;
    private RecyclerView rvInformation;
    private SearchInformationAdapter mAdapter;
    private HaveMoreInformationBR mHaveMoreInformationBR;
    private NotHaveMoreInformationBR mNotHaveMoreInformationBR;
    private int type = 1;  // 1代表商品 2代表帖子 3代表红人

    @Override
    public int setLayout() {
        return R.layout.activity_search_information;
    }

    @Override
    public void initView() {
        ivClose = (ImageView) findViewById(R.id.iv_activity_search_information);
        tvInformationOne = (TextView) findViewById(R.id.tv_activity_search_information_one);
        tvInformationTwo = (TextView) findViewById(R.id.tv_activity_search_information_two);
        tvInformationThree = (TextView) findViewById(R.id.tv_activity_search_information_three);
        llInformationOne = (LinearLayout) findViewById(R.id.ll_activity_search_information_one);
        llInformationTwo = (LinearLayout) findViewById(R.id.ll_activity_search_information_two);
        llInformationThree = (LinearLayout) findViewById(R.id.ll_activity_search_information_three);
        rvInformation = (RecyclerView) findViewById(R.id.recycler_view_activity_search_information);
    }

    @Override
    public void initData() {
        llInformationOne.setVisibility(View.VISIBLE);
        tvInformationOne.setText(getIntent().getStringExtra("key"));
        type = getIntent().getIntExtra("type", 1);
        ivClose.setOnClickListener(this);
        llInformationOne.setOnClickListener(this);
        llInformationTwo.setOnClickListener(this);
        llInformationThree.setOnClickListener(this);
        replace(getIntent().getStringExtra("url"));


        mHaveMoreInformationBR = new HaveMoreInformationBR();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(HAVE_MORE_SEARCH_INFORMATION);
        registerReceiver(mHaveMoreInformationBR, intentFilter);

        mNotHaveMoreInformationBR = new NotHaveMoreInformationBR();
        IntentFilter intentFilter1 = new IntentFilter();
        intentFilter1.addAction(NOT_HAVE_MORE_SEARCH_INFORMATION);
        registerReceiver(mNotHaveMoreInformationBR, intentFilter1);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_activity_search_information:
                finish();
                break;
            case R.id.ll_activity_search_information_one:
                if (tvInformationTwo.getText().length() > 1) {
                    tvInformationOne.setText(tvInformationTwo.getText());
                    if (tvInformationThree.getText().length() > 1) {
                        tvInformationTwo.setText(tvInformationThree.getText());
                    } else {
                        tvInformationTwo.setText("");
                        llInformationTwo.setVisibility(View.GONE);
                    }
                    tvInformationThree.setText("");
                    llInformationThree.setVisibility(View.GONE);
                    String url = tvInformationOne.getText().toString() + tvInformationTwo.getText().toString() + tvInformationThree.getText().toString();
                    replace(toUtf8(url));
                } else {
                    finish();
                }
                break;
            case R.id.ll_activity_search_information_two:
                if (tvInformationThree.getText().length() > 1) {
                    tvInformationTwo.setText(tvInformationThree.getText());
                    tvInformationThree.setText("");
                    llInformationThree.setVisibility(View.GONE);
                    String url = tvInformationOne.getText().toString() + tvInformationTwo.getText().toString() + tvInformationThree.getText().toString();
                    replace(toUtf8(url));
                } else {
                    tvInformationTwo.setText("");
                    llInformationTwo.setVisibility(View.GONE);
                    String url = tvInformationOne.getText().toString() + tvInformationTwo.getText().toString() + tvInformationThree.getText().toString();
                    replace(toUtf8(url));
                }

                break;
            case R.id.ll_activity_search_information_three:
                tvInformationThree.setText("");
                llInformationThree.setVisibility(View.GONE);
                String url = tvInformationOne.getText().toString() + tvInformationTwo.getText().toString() + tvInformationThree.getText().toString();
                replace(toUtf8(url));
                break;
        }
    }

    @Override
    public void getSearchInformation(String str) {
        if (tvInformationTwo.getText().length() < 1) {
            llInformationTwo.setVisibility(View.VISIBLE);
            tvInformationTwo.setText(str);
            String url = tvInformationOne.getText().toString() + tvInformationTwo.getText().toString();
            replace(toUtf8(url));
        } else if (tvInformationThree.getText().length() < 1) {
            llInformationThree.setVisibility(View.VISIBLE);
            tvInformationThree.setText(str);
            String url = tvInformationOne.getText().toString() + tvInformationTwo.getText().toString() + tvInformationThree.getText().toString();
            replace(toUtf8(url));
        }
    }

    class HaveMoreInformationBR extends BroadcastReceiver {

        @Override
        public void onReceive(Context context, Intent intent) {
            if (intent.getStringArrayListExtra("data") != null) {
                rvInformation.setVisibility(View.VISIBLE);
                ArrayList<String> myData = intent.getStringArrayListExtra("data");
                mAdapter = new SearchInformationAdapter(SearchInformationActivity.this);
                mAdapter.setData(myData);
                mAdapter.setClick(SearchInformationActivity.this);
                rvInformation.setAdapter(mAdapter);
                rvInformation.setLayoutManager(new LinearLayoutManager(SearchInformationActivity.this
                        , LinearLayoutManager.HORIZONTAL, false));
            }
        }
    }

    class NotHaveMoreInformationBR extends BroadcastReceiver {

        @Override
        public void onReceive(Context context, Intent intent) {
            rvInformation.setVisibility(View.GONE);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(mHaveMoreInformationBR);
        unregisterReceiver(mNotHaveMoreInformationBR);
    }

    private void replace(String str) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        switch (type) {
            case 1:
                SearchFragment fragment = new SearchFragment();
                fragment.setStr(str);
                transaction.replace(R.id.frame_layout_activity_search_information, fragment);
                break;
            case 2:
                PostsFragment fragment1 = new PostsFragment();
                fragment1.setStr(str);
                transaction.replace(R.id.frame_layout_activity_search_information, fragment1);
                break;
            case 3:
                RedMenSearchFragment fragment2 = new RedMenSearchFragment();
                fragment2.setStr(str);
                transaction.replace(R.id.frame_layout_activity_search_information, fragment2);
                break;
        }
        transaction.commit();

    }
}
