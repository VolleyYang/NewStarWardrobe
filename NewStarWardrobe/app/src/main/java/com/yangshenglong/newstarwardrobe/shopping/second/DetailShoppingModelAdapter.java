package com.yangshenglong.newstarwardrobe.shopping.second;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.yangshenglong.newstarwardrobe.R;
import com.yangshenglong.newstarwardrobe.shopping.bean.AllDataNext;

import java.util.ArrayList;

/**
 * Created by xiaoBu on 2016/12/26.
 */

public class DetailShoppingModelAdapter extends PagerAdapter {

    private Context mContext;
    private AllDataNext data;

    public DetailShoppingModelAdapter(Context context) {
        mContext = context;
    }

    public void setData(AllDataNext data) {
        this.data = data;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return data != null ? data.getResponse().getData().getSideslipimages().size() : 0;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        View view = LayoutInflater.from(mContext).inflate(R.layout.view_xiaobu_lovely_girl, container, false);

        ImageView imageView = (ImageView) view.findViewById(R.id.iv_xiaobu_shopping_next_goods_img);

        Glide.with(mContext).load(data.getResponse().getData().getSideslipimages().get(position).getImg_url()).into(imageView);//展示图片

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        container.removeView((View) object);

    }
}
