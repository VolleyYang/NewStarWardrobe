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
        mContext = MyApp.getmContext();
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

    // 增
    public void insert (Object object) {
        mLiteOrm.save(object);
    }

    // 查一个条件的方法 columns 要查的字段名  object 具体的内容
    public<T> ArrayList<T> query(Class<T> mClass,String columns, String object){
        String where = columns+" = ?";
        QueryBuilder<T> queryBuilder = new QueryBuilder<>(mClass)
                .columns(new String[]{columns})
                .where(where,new Object[]{object});
        return mLiteOrm.query(queryBuilder);
    }

    // 查整个表的方法
    public<T> ArrayList<T> queryAll (Class<T> mClass){
        return mLiteOrm.query(mClass);
    }


    // 查重的方法
    public<T> boolean isSave(Class<T> mClass,String columns, String object) {
        String where = columns+" = ?";
        QueryBuilder<T> queryBuilder = new QueryBuilder<>(mClass)
                .columns(new String[]{columns})
                .where(where,new Object[]{object});
        if (mLiteOrm.query(queryBuilder).size()>0){
            return true;
        }else {
            return false;
        }
    }
    // 删除一个条件的

    public<T> void delete(Class<T> mClass,String columns, String object){
        String where = columns+" = ?";
        mLiteOrm.delete(new WhereBuilder(mClass).where(where,new Object[]{object}));
    }

}
