package com.yangshenglong.newstarwardrobe;

import android.app.Application;
import android.content.Context;

/**
 * Created by CST on 16/12/28.
 */

public class MyApp extends Application{
    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
    }
    public static Context getContext(){
        return mContext;
    }
}
