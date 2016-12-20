package com.yangshenglong.newstarwardrobe.fashion;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.RadioButton;

import com.yangshenglong.newstarwardrobe.R;
import com.yangshenglong.newstarwardrobe.base.BaseFragment;
import com.yangshenglong.newstarwardrobe.fashion.levelpage.attention.AttentionFragment;
import com.yangshenglong.newstarwardrobe.fashion.levelpage.newest.NewestFragment;
import com.yangshenglong.newstarwardrobe.fashion.levelpage.recommend.RecommendFragment;

/**
 * Created by VolleyYang on 16/12/20.
 */

public class FashionFragment extends BaseFragment implements View.OnClickListener {

    private RadioButton  rbtAttention,rbtRecommend,rbtNewest;
    @Override
    public int setLayout() {
        return R.layout.fragment_fashion;
    }

    @Override
    public void initView(View view) {
        rbtAttention = (RadioButton) view.findViewById(R.id.rbt_attention);
        rbtRecommend = (RadioButton) view.findViewById(R.id.rbt_recommend);
        rbtNewest = (RadioButton) view.findViewById(R.id.rbt_newest);
    }

    public void replace(Fragment fragment){
        FragmentManager manager = getChildFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.fashion_fl,fragment);
        transaction.commit();
    }
    @Override
    public void initData() {
        rbtAttention.setOnClickListener(this);
        rbtRecommend.setOnClickListener(this);
        rbtNewest.setOnClickListener(this);

        replace(new RecommendFragment());
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.rbt_attention:
                replace(new AttentionFragment());
                break;
            case R.id.rbt_recommend:
                replace(new RecommendFragment());
                break;
            case R.id.rbt_newest:
                replace(new NewestFragment());
                break;
        }
    }
}
