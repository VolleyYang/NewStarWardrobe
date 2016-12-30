package com.yangshenglong.newstarwardrobe.mine.login;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.yangshenglong.newstarwardrobe.R;
import com.yangshenglong.newstarwardrobe.base.BaseActivity;
import com.yangshenglong.newstarwardrobe.database.DBTool;
import com.yangshenglong.newstarwardrobe.database.LoginData;

import org.greenrobot.eventbus.EventBus;

/**
 * Created by CST on 16/12/28.
 */

public class LoginActivity extends BaseActivity implements View.OnClickListener {
    private ImageView ivClose,ivAccount,ivPassword;
    private TextView tvRegiser,tvForget;
    private LinearLayout llTaobao,llQq,llWeibo,llWechat;
    private EditText etAccount,etPassword;
    private Button btnLogin;
    private boolean isAccount = false,isPassword = false;
    private EventBus mEventBus;
    @Override
    public int setLayout() {
        return R.layout.activity_login;
    }

    @Override
    public void initView() {
        ivClose = (ImageView) findViewById(R.id.iv_activity_login_close);
        etAccount = (EditText) findViewById(R.id.et_activity_login_account);
        ivAccount = (ImageView) findViewById(R.id.iv_activity_login_account);
        etPassword = (EditText) findViewById(R.id.et_activity_login_password);
        ivPassword = (ImageView) findViewById(R.id.iv_activity_login_password);
        btnLogin = (Button) findViewById(R.id.btn_activity_login);
        tvRegiser = (TextView) findViewById(R.id.tv_activity_login_regiser);
        tvForget = (TextView) findViewById(R.id.tv_activity_login_forget);
        llTaobao = (LinearLayout) findViewById(R.id.ll_activity_login_taobao);
        llQq = (LinearLayout) findViewById(R.id.ll_activity_login_qq);
        llWeibo = (LinearLayout) findViewById(R.id.ll_activity_login_weibo);
        llWechat = (LinearLayout) findViewById(R.id.ll_activity_login_wechat);
        mEventBus = EventBus.getDefault();
    }

    @Override
    public void initData() {
        ivClose.setOnClickListener(this);
        ivAccount.setOnClickListener(this);
        ivPassword.setOnClickListener(this);
        btnLogin.setOnClickListener(this);
        tvRegiser.setOnClickListener(this);
        tvForget.setOnClickListener(this);
        llTaobao.setOnClickListener(this);
        llQq.setOnClickListener(this);
        llWeibo.setOnClickListener(this);
        llWechat.setOnClickListener(this);

        Intent intent = getIntent();
        etAccount.setText(intent.getStringExtra("account"));
        etPassword.setText(intent.getStringExtra("password"));
        if (etAccount.getText().length()==11&&etPassword.getText().length()>5){
            btnLogin.setBackgroundColor(Color.rgb(0xce,0x10,0x4f));
            btnLogin.setClickable(true);
        }else {
            btnLogin.setBackgroundColor(Color.rgb(0xd7,0xd7,0xd7));
            btnLogin.setClickable(false);
        }

        etAccount.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length()>0){
                    ivAccount.setVisibility(View.VISIBLE);
                }else {
                    ivAccount.setVisibility(View.INVISIBLE);
                }
                if (s.length() == 11){
                    isAccount = true;
                }else {
                    isAccount = false;
                }
                if (isAccount&&isPassword){
                    btnLogin.setBackgroundColor(Color.rgb(0xce,0x10,0x4f));
                    btnLogin.setClickable(true);
                }else {
                    btnLogin.setBackgroundColor(Color.rgb(0xd7,0xd7,0xd7));
                    btnLogin.setClickable(false);
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
                if (s.length()>0){
                    ivPassword.setVisibility(View.VISIBLE);
                }else {
                    ivPassword.setVisibility(View.INVISIBLE);
                }
                if (s.length()>5){
                    isPassword = true;
                }else {
                    isPassword = false;
                }
                if (isAccount&&isPassword){
                    btnLogin.setBackgroundColor(Color.rgb(0xce,0x10,0x4f));
                    btnLogin.setClickable(true);
                }else {
                    btnLogin.setBackgroundColor(Color.rgb(0xd7,0xd7,0xd7));
                    btnLogin.setClickable(false);
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
            case R.id.iv_activity_login_close:
                finish();
                break;
            case R.id.iv_activity_login_account:
                etAccount.setText("");
                break;
            case R.id.iv_activity_login_password:
                etPassword.setText("");
                break;
            case R.id.btn_activity_login:
                String account = etAccount.getText().toString();
                String password = etPassword.getText().toString();
                boolean isSaveAccount = DBTool.getInstance().isSaveLogin("accountNum",account);
                boolean isSavePassword = DBTool.getInstance().isSaveLogin("password",password);
                if (!isSaveAccount){
                    Toast.makeText(this, "用户名不存在", Toast.LENGTH_SHORT).show();
                }else if (!isSavePassword){
                    Toast.makeText(this, "密码错误", Toast.LENGTH_SHORT).show();
                }else {
                    LoginData data = new LoginData(account,password);
                    mEventBus.post(data);
                    SharedPreferences.Editor editor = getSharedPreferences("login",MODE_PRIVATE).edit();
                    editor.putBoolean("isLogin",true);
                    editor.commit();
                    editor.putString("title",data.getAccountNum());
                    editor.commit();
                    finish();
                }
                break;
            case R.id.tv_activity_login_regiser:
                Intent intent = new Intent(this,RegisteredActivity.class);
                startActivity(intent);
                break;
            case R.id.tv_activity_login_forget:
                break;
            case R.id.ll_activity_login_taobao:
                break;
            case R.id.ll_activity_login_qq:
                break;
            case R.id.ll_activity_login_weibo:
                break;
            case R.id.ll_activity_login_wechat:
                break;
        }
    }
}
