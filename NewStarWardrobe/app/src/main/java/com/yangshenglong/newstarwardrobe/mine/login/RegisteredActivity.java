package com.yangshenglong.newstarwardrobe.mine.login;

import android.content.Intent;
import android.graphics.Color;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.yangshenglong.newstarwardrobe.R;
import com.yangshenglong.newstarwardrobe.base.BaseActivity;
import com.yangshenglong.newstarwardrobe.database.DBTool;
import com.yangshenglong.newstarwardrobe.database.LoginData;

/**
 * Created by CST on 16/12/29.
 */

public class RegisteredActivity extends BaseActivity implements View.OnClickListener {
    private ImageView ivColse;
    private TextView tvYanzheng;
    private EditText etPhoneNum,etYanzheng,etPassword;
    private Button btnRegister;
    private boolean isPhoneNum = false, isPassword = false;
    @Override
    public int setLayout() {
        return R.layout.activity_register;
    }

    @Override
    public void initView() {
        ivColse = (ImageView) findViewById(R.id.iv_activity_register_close);
        tvYanzheng = (TextView) findViewById(R.id.tv_activity_register_yanzheng);
        etPhoneNum = (EditText) findViewById(R.id.et_activity_register_phone_num);
        etYanzheng = (EditText) findViewById(R.id.et_activity_register_yanzheng);
        etPassword = (EditText) findViewById(R.id.et_activity_register_password);
        btnRegister = (Button) findViewById(R.id.btn_activity_register);
    }

    @Override
    public void initData() {
        ivColse.setOnClickListener(this);
        tvYanzheng.setOnClickListener(this);
        btnRegister.setOnClickListener(this);
        btnRegister.setClickable(false);
        btnRegister.setBackgroundColor(Color.rgb(0xd7,0xd7,0xd7));
        etPhoneNum.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() == 11){
                    isPhoneNum = true;
                }else {
                    isPhoneNum = false;
                }
                if (isPhoneNum&&isPassword){
                    btnRegister.setBackgroundColor(Color.rgb(0xce,0x10,0x4f));
                    btnRegister.setClickable(true);
                }else {
                    btnRegister.setBackgroundColor(Color.rgb(0xd7,0xd7,0xd7));
                    btnRegister.setClickable(false);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        etPassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length()>5){
                    isPassword = true;
                }else {
                    isPassword = false;
                }
                if (isPhoneNum&&isPassword){
                    btnRegister.setBackgroundColor(Color.rgb(0xce,0x10,0x4f));
                    btnRegister.setClickable(true);
                }else {
                    btnRegister.setBackgroundColor(Color.rgb(0xd7,0xd7,0xd7));
                    btnRegister.setClickable(false);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.iv_activity_register_close:
                finish();
                break;
            case R.id.tv_activity_register_yanzheng:
                Toast.makeText(this, "已发送验证码", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_activity_register:
                String phoneNum = etPhoneNum.getText().toString();
                String password = etPassword.getText().toString();
                if (etYanzheng.getText().toString().equals("112233")){
                    if (!DBTool.getInstance().isSaveLogin("accountNum",phoneNum)) {
                        LoginData loginData = new LoginData(phoneNum, password);
                        DBTool.getInstance().insertLogin(loginData);
                        Intent intent = new Intent(this, LoginActivity.class);
                        intent.putExtra("account", phoneNum);
                        intent.putExtra("password", password);
                        Toast.makeText(this, "注册成功 即将跳转到登录界面", Toast.LENGTH_SHORT).show();
                        startActivity(intent);
                        finish();
                    }else {
                        Toast.makeText(this, "账号已存在", Toast.LENGTH_SHORT).show();
                    }
                }else {
                    Toast.makeText(this, "验证码不正确", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}
