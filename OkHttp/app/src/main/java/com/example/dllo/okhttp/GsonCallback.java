package com.example.dllo.okhttp;

import com.google.gson.Gson;
import com.zhy.http.okhttp.callback.Callback;

import okhttp3.Response;

/**
 * Created by CST on 16/12/20.
 */

public abstract class GsonCallback<T> extends Callback<T>{

    private Class<T> mClass;

    @Override
    public T parseNetworkResponse(Response response, int id) throws Exception {
        Gson gson = new Gson();
        String result = response.body().string();
        Class<T> bean = (Class<T>) gson.fromJson(result,mClass);
        return (T) bean;
    }
}
