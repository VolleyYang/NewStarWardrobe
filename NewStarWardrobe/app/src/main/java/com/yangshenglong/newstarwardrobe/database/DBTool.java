package com.yangshenglong.newstarwardrobe.database;

import android.content.Context;

import com.litesuits.orm.LiteOrm;
import com.litesuits.orm.db.assit.QueryBuilder;
import com.litesuits.orm.db.assit.WhereBuilder;
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


    //-----------------------------------------------------//
    // 搜索历史的方法  其他表的方法可参照

    // 增
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

    // 查整个表的方法
    public ArrayList<SearchData> queryAllSearch(){
        return mLiteOrm.query(SearchData.class);
    }

    // 查重的方法
    public boolean isSaveSearch(String columns, String object) {
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

    //-----------------------------------------------------//

    // 用户信息表的方法

    // 增

    public void insertLogin (LoginData data) {
        mLiteOrm.save(data);
    }

    // 查一个条件的方法 columns 要查的字段名  object 具体的内容
    public ArrayList<LoginData> queryLogin(String columns, String object){
        String where = columns+" = ?";
        QueryBuilder<LoginData> queryBuilder = new QueryBuilder<>(LoginData.class)
                .columns(new String[]{columns})
                .where(where,new Object[]{object});
        return mLiteOrm.query(queryBuilder);
    }
    // 查整个表的方法
    public ArrayList<LoginData> queryAllLogin (){
        return mLiteOrm.query(LoginData.class);
    }

    // 查重的方法
    public boolean isSaveLogin(String columns, String object) {
        String where = columns+" = ?";
        QueryBuilder<LoginData> queryBuilder = new QueryBuilder<>(LoginData.class)
                .columns(new String[]{columns})
                .where(where,new Object[]{object});
        if (mLiteOrm.query(queryBuilder).size()>0){
            return true;
        }else {
            return false;
        }
    }
    // 删除一个条件的

    public void deleteLogin(String columns, String object){
        String where = columns+" = ?";
        mLiteOrm.delete(new WhereBuilder(LoginData.class).where(where,new Object[]{object}));
    }

}
