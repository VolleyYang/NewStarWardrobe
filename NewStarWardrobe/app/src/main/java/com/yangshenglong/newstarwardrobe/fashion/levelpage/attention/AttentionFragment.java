package com.yangshenglong.newstarwardrobe.fashion.levelpage.attention;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

import com.yangshenglong.newstarwardrobe.R;
import com.yangshenglong.newstarwardrobe.base.BaseFragment;
import com.yangshenglong.newstarwardrobe.fashion.secondpage.attention.DrActivity;

/**
 * Created by VolleyYang on 16/12/20.
 */

public class AttentionFragment extends BaseFragment implements View.OnClickListener {
    private Button  btnDr;
    private Intent intent;

    @Override
    public int setLayout() {
        return R.layout.fragment_attentioin;
    }

    @Override
    public void initView(View view) {
        btnDr = (Button) view.findViewById(R.id.btn_dr);

    }

    @Override
    public void initData() {
        //点击事件
        btnDr.setOnClickListener(this);
    }


    //大Button的 点击事件
    @Override
    public void onClick(View v) {
        intent = new Intent(getContext(), DrActivity.class);
        startActivity(intent);
    }
}
