package com.yangshenglong.newstarwardrobe.classify;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.yangshenglong.newstarwardrobe.R;
import com.yangshenglong.newstarwardrobe.base.BaseActivity;
import com.yangshenglong.newstarwardrobe.search.SearchFragment;

/**
 * Created by CST on 16/12/20.
 */

public class ClassifyGridItemActivity extends BaseActivity implements View.OnClickListener {
    private ImageView ivBack;
    private TextView tvTitle;
    private String str;

    @Override
    public int setLayout() {
        return R.layout.activity_item_grid_classify;
    }

    @Override
    public void initView() {
        ivBack = (ImageView) findViewById(R.id.iv_activity_item_grid_classify_colse);
        tvTitle = (TextView) findViewById(R.id.tv_activity_item_grid_classify_title);
    }


    @Override
    public void initData() {
        str = getIntent().getStringExtra("url");
        tvTitle.setText(getIntent().getStringExtra("key"));
        ivBack.setOnClickListener(this);
        SearchFragment fragment = new SearchFragment();
        fragment.setStr(str);
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.frame_layout_activity_item_grid_classify, fragment);
        transaction.commit();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_activity_item_grid_classify_colse:
                finish();
                break;
        }
    }

}
