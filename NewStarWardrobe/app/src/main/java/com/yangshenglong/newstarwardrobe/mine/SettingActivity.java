package com.yangshenglong.newstarwardrobe.mine;

import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.yangshenglong.newstarwardrobe.R;
import com.yangshenglong.newstarwardrobe.base.BaseActivity;
import com.yangshenglong.newstarwardrobe.mine.login.LoginActivity;

/**
 * Created by CST on 17/1/3.
 */

public class SettingActivity extends BaseActivity implements View.OnClickListener {
    private ImageView ivClose;
    private TextView tvLogin;
    private boolean isLogin = false;
    private SharedPreferences sp;

    @Override
    public int setLayout() {
        return R.layout.activity_setting;
    }

    @Override
    public void initView() {
        ivClose = (ImageView) findViewById(R.id.iv_activity_setting_close);
        tvLogin = (TextView) findViewById(R.id.tv_activity_setting_login);
    }

    @Override
    public void initData() {
        ivClose.setOnClickListener(this);
        sp = getSharedPreferences("login",MODE_PRIVATE);
        isLogin = sp.getBoolean("isLogin",false);

        if (isLogin){
            tvLogin.setText("退出");
        }else {
            tvLogin.setText("登录");
        }
        tvLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isLogin){
                    SharedPreferences.Editor editor = getSharedPreferences("login",MODE_PRIVATE).edit();
                    editor.putBoolean("isLogin",false);
                    editor.putString("title","我的");
                    editor.commit();
                    finish();
                }else {
                    Intent intent = new Intent(SettingActivity.this, LoginActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.iv_activity_setting_close:
                finish();
                break;
        }
    }
}
