package com.yangshenglong.newstarwardrobe.mine;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import com.yangshenglong.newstarwardrobe.R;
import com.yangshenglong.newstarwardrobe.base.BaseFragment;

/**
 * Created by CST on 17/1/4.
 */

public class OrdersFragment extends BaseFragment{
    private TextView tv;
    private String name;
    @Override
    public int setLayout() {
        return R.layout.fragment_orders;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getArguments();
        if (bundle!=null){
            name = bundle.getString("name");
        }
    }

    @Override
    public void initView(View view) {
        tv = (TextView) view.findViewById(R.id.tv_fragment_orders);
    }

    @Override
    public void initData() {
        String str = "你还没有"+name+"订单哦!";
        tv.setText(str);
    }
    public static OrdersFragment newInstance(String name){
        Bundle args = new Bundle();
        args.putString("name",name);
        OrdersFragment fragment = new OrdersFragment();
        fragment.setArguments(args);
        return fragment;
    }
}
