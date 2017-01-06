package com.yangshenglong.newstarwardrobe.shopping.third.brand;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.yangshenglong.newstarwardrobe.R;

/**
 * Created by xiaoBu on 16/12/27.
 */

public class BrandAdapterContent extends RecyclerView.Adapter<BrandAdapterContent.NormalViewHolder> {

    private Context mContext;
    private BrandDataContent data;

    public BrandAdapterContent(Context context) {
        mContext = context;
    }

    public void setData(BrandDataContent data) {
        this.data = data;
        notifyDataSetChanged();
    }

    //private GiftClick mGiftClick;//声明接口对象

    // 接口对象set方法
//    public void setGiftClick(GiftClick giftClick) {
//        mGiftClick = giftClick;
//    }

    @Override
    public NormalViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(mContext).inflate(R.layout.item_xiaobu_third_brand_content, parent, false);

        NormalViewHolder holder = new NormalViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(NormalViewHolder holder, final int position) {


        holder.tvDescription.setText(data.getResponse().getData().getItems().get(position).getComponent().getDescription());
        holder.tvPrice.setText(data.getResponse().getData().getItems().get(position).getComponent().getPrice());
        holder.tvOriginPrice.setText(data.getResponse().getData().getItems().get(position).getComponent().getOrigin_price());

        Glide.with(mContext).load(data.getResponse().getData().getItems().get(position).getComponent().getPicUrl()).into(holder.ivPicurl);

        /* 设置监听 */
//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mGiftClick.myGiftListener(position);
//            }
//        });


    }

    @Override
    public int getItemCount() {
        return data != null ? data.getResponse().getData().getItems().size() : 0;
    }

    /**
     * 缓存类
     */
    class NormalViewHolder extends RecyclerView.ViewHolder {

        private TextView tvDescription, tvPrice, tvOriginPrice;
        private ImageView ivPicurl;

        NormalViewHolder(View itemView) {
            super(itemView);

            tvDescription = (TextView) itemView.findViewById(R.id.tv_xiaobu_third_brand_description);
            tvPrice = (TextView) itemView.findViewById(R.id.tv_xiaobu_third_brand_price);
            tvOriginPrice = (TextView) itemView.findViewById(R.id.tv_xiaobu_third_brand_origin_price);
            ivPicurl = (ImageView) itemView.findViewById(R.id.iv_xiaobu_third_brand_picurl);
        }
    }
}
