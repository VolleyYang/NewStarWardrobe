package com.example.dllo.okhttp;

import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.zhy.http.okhttp.OkHttpUtils;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnGet,btnPost;
    private String getUrl = "http://api-v2.mall.hichao.com/forum/banner?ga=%2Fforum%2Fbanner";
    private OkHttpClient mOkHttpClient;
    private String postUrl = "http://h5api.myoho.net/index.php?r=Apiemag/magList&startTime=0&lastTime=1479784306&magCount=3&magType=5&width=1080&height=1776&ppi=480&num=3";
    private String key = "parameters";
    private String value = "{“platform”:\"4\",\"locale\":\"zh-Hans\",\"app\":\"efashion\",\"language\":\"zh-Hans\",\"udid\":\"00000000000000063aa461b71c4cfcf\",\"curVersion\":\"5.0.4\",\"authInfo\":{\"udid\":\"00000000000000063aa461b71c4cfcf\"}}";
    private TextView tv;
    private Handler mHandler = new Handler(Looper.getMainLooper());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnGet = (Button) findViewById(R.id.btn_get);
        btnPost = (Button) findViewById(R.id.btn_post);
        tv = (TextView) findViewById(R.id.tv);
        btnGet.setOnClickListener(this);
        btnPost.setOnClickListener(this);
        //mOkHttpClient = new OkHttpClient();
        mOkHttpClient = new OkHttpClient().newBuilder()
                .connectTimeout(5, TimeUnit.SECONDS)
                .readTimeout(10,TimeUnit.SECONDS)
                .writeTimeout(10,TimeUnit.SECONDS)
                .cache(new Cache(Environment.getExternalStorageDirectory(),10*1024*1024)).build();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_get:
                //get();
                OkHttpUtils.get().url(getUrl).build().execute(new GenericsCallback<Bean>(new JsonGenericsSerializator()) {
                    @Override
                    public void onError(Call call, Exception e, int id) {

                    }

                    @Override
                    public void onResponse(Bean response, int id) {

                    }

                });
                Toast.makeText(this, "sd", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_post:
                post();
                break;
        }
    }

    private void post() {
        FormBody formBody = new FormBody.Builder().add(key,value).build();
        Request request = new Request.Builder().url(postUrl).post(formBody).build();
        mOkHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                Log.d("MainActivity", response.body().string());
            }
        });
    }

    private void get() {

        Request request = new Request.Builder().url(getUrl).build();
        mOkHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Log.d("MainActivity", "###");
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                Gson gson = new Gson();
                String result = response.body().string();
                final Bean bean = gson.fromJson(result,Bean.class);
                mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        tv.setText(bean.getData().getItems().get(0).getComponent().getTitle());
                    }
                });
            }
        });
    }
}
