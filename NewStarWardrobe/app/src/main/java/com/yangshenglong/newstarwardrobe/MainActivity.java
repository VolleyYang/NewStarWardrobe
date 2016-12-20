package com.yangshenglong.newstarwardrobe;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

import com.yangshenglong.newstarwardrobe.base.BaseActivity;
import com.yangshenglong.newstarwardrobe.classify.ClassifyFragment;
import com.yangshenglong.newstarwardrobe.fashion.FashionFragment;
import com.yangshenglong.newstarwardrobe.message.MessageFragment;
import com.yangshenglong.newstarwardrobe.mine.MineFragment;
import com.yangshenglong.newstarwardrobe.shopping.ShopFragment;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    private RadioButton  rbtShop,rbtClassify,rbtFashion,rbtMessage,rbtMine;

    @Override
    public int setLayout() {
        return R.layout.activity_main;
    }

    @Override
    public void initView() {

        rbtClassify = (RadioButton) findViewById(R.id.rbt_classify);
        rbtFashion = (RadioButton) findViewById(R.id.rbt_fashion);
        rbtMessage = (RadioButton) findViewById(R.id.rbt_message);
        rbtMine = (RadioButton) findViewById(R.id.rbt_mine);
        rbtShop = (RadioButton) findViewById(R.id.rbt_shop);
    }


    public void replace(Fragment fragment){
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.fl,fragment);
        transaction.commit();
    }
    @Override
    public void initData() {

        rbtShop.setOnClickListener(this);
        rbtMine.setOnClickListener(this);
        rbtClassify.setOnClickListener(this);
        rbtMessage.setOnClickListener(this);
        rbtFashion.setOnClickListener(this);
        replace(new ShopFragment());

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.rbt_shop:
                replace(new ShopFragment());
                break;
            case R.id.rbt_classify:
                replace(new ClassifyFragment());
                break;
            case R.id.rbt_fashion:
                replace(new FashionFragment());
                break;
            case R.id.rbt_message:
                replace(new MessageFragment());
                break;
            case R.id.rbt_mine:
                replace(new MineFragment());
                break;
        }
    }
}
