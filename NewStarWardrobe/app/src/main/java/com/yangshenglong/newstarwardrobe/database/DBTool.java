package com.yangshenglong.newstarwardrobe.database;

import android.content.Context;

import com.litesuits.orm.LiteOrm;
import com.litesuits.orm.db.assit.QueryBuilder;
import com.yangshenglong.newstarwardrobe.MyApp;

import java.util.ArrayList;

/**
 * Created by CST on 16/12/28.
 */

public class DBTool {
    private LiteOrm mLiteOrm;
    private Context mContext;
    private static DBTool ourInstance = new DBTool();

    public static DBTool getInstance(){
        return ourInstance;
    }

    public DBTool(){
        mContext = MyApp.getContext();
        mLiteOrm = getLiteOrm();
    }

    private LiteOrm getLiteOrm(){
        if (mLiteOrm == null){
            synchronized (DBTool.class){
                if (mLiteOrm == null){
                    mLiteOrm = LiteOrm.newCascadeInstance(mContext,"MyFile.db");
                }
            }
        }
        return mLiteOrm;
    }

    // 删除整个表
    public  <T> void deleteAll(Class<T> mClass){
        mLiteOrm.deleteAll(mClass);
    }

    // 搜索历史的方法  其他表的方法可参照

    public void insertSearch (SearchData data){
        mLiteOrm.save(data);
    }

    // 查一个条件的方法 columns 要查的字段名  object 具体的内容
    public ArrayList<SearchData> querySearch(String columns, String object){
        String where = columns+" = ?";
        QueryBuilder<SearchData> queryBuilder = new QueryBuilder<>(SearchData.class)
                .columns(new String[]{columns})
                .where(where,new Object[]{object});
        return mLiteOrm.query(queryBuilder);
    }

    // 查重的方法
    public boolean isSave (String columns,String object) {
        String where = columns+" = ?";
        QueryBuilder<SearchData> queryBuilder = new QueryBuilder<>(SearchData.class)
                .columns(new String[]{columns})
                .where(where,new Object[]{object});
        if (mLiteOrm.query(queryBuilder).size()>0){
            return true;
        }else {
            return false;
        }
    }
}
