package com.yangshenglong.newstarwardrobe.shopping.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.yangshenglong.newstarwardrobe.R;
import com.yangshenglong.newstarwardrobe.shopping.bean.OverSeasDataContent;

/**
 * Created by xiaoBu on 16/12/22.
 */

public class OverSeasAdapterContent extends RecyclerView.Adapter {

    private Context mContext;
    private OverSeasDataContent data;

    private MyClick mClick;

    // 定义不同行布局
    private static final int TYPE_ADVERTISE = 0;
    private static final int TYPE_NORMAL = 1;

    public OverSeasAdapterContent(Context context) {
        mContext = context;
    }

    public void setData(OverSeasDataContent data) {
        this.data = data;
        notifyDataSetChanged();
    }

    public void setClick(MyClick click) {
        mClick = click;
    }

    /**
     * 不同行布局究竟返回什么样的数据
     *
     * @param position
     * @return
     */
    @Override
    public int getItemViewType(int position) {

        if (data.getResponse().getData().getItems().get(position).getComponent().getComponentType().equals("cell")) {
            return TYPE_ADVERTISE;
        } else {
            return TYPE_NORMAL;
        }

    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        RecyclerView.ViewHolder holder = null;

        switch (viewType) {

            // 广告位(需要占用两个item)
            case TYPE_ADVERTISE:

                View viewAdvertistment = LayoutInflater.from(mContext).inflate(R.layout.item_xiaobu_all_advertise, parent, false);

                holder = new AdViewHolder(viewAdvertistment);

                break;

            // 正常的内容界面
            case TYPE_NORMAL:

                View viewNormal = LayoutInflater.from(mContext).inflate(R.layout.item_xiaobu_all_content, parent, false);

                holder = new MyViewHolder(viewNormal);

                break;
        }
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {

        int type = getItemViewType(position);//判断不同的行布局返回什么样的数据

        switch (type) {

            case TYPE_ADVERTISE:

                AdViewHolder holderAd = (AdViewHolder) holder;

                Glide.with(mContext).load(data.getResponse().getData().getItems().get(position).getComponent().getPicUrl()).into(holderAd.ivAdvertisement);
                break;

            case TYPE_NORMAL:

                MyViewHolder holderMy = (MyViewHolder) holder;//定义我们自己的缓存类对象,然后强转holder

                holderMy.tvPrice.setText("¥" + data.getResponse().getData().getItems().get(position).getComponent().getPrice());
                holderMy.tvCountry.setText(data.getResponse().getData().getItems().get(position).getComponent().getCountry());
                holderMy.tvDescription.setText(data.getResponse().getData().getItems().get(position).getComponent().getDescription());
                holderMy.tvOriginPrice.setText("¥" + data.getResponse().getData().getItems().get(position).getComponent().getOrigin_price());

                Glide.with(mContext).load(data.getResponse().getData().getItems().get(position).getComponent().getPicUrl()).into(holderMy.ivPicurl);
                Glide.with(mContext).load(data.getResponse().getData().getItems().get(position).getComponent().getNationalFlag()).into(holderMy.ivFlag);

                holder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mClick.myListener(position);
                    }
                });

                break;
        }
    }

    @Override
    public int getItemCount() {
        return data != null ? data.getResponse().getData().getItems().size() : 0;

    }

    // 判断当前item是否是广告位
    public boolean isAdView(int position) {

        if (data.getResponse().getData().getItems().get(position).getComponent().getComponentType().equals("cell")) {

            return true;
        } else {

            return false;
        }
    }

    private class AdViewHolder extends RecyclerView.ViewHolder {

        private ImageView ivAdvertisement;

        private AdViewHolder(View itemView) {
            super(itemView);

            ivAdvertisement = (ImageView) itemView.findViewById(R.id.iv_xiaobu_all_item_advertisement);
        }
    }

    private class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView tvPrice, tvOriginPrice, tvCountry, tvDescription;
        private ImageView ivFlag, ivPicurl;

        private MyViewHolder(View itemView) {
            super(itemView);

            tvPrice = (TextView) itemView.findViewById(R.id.tv_xiaobu_all_item_price);
            tvCountry = (TextView) itemView.findViewById(R.id.tv_xiaobu_all_item_country);
            tvDescription = (TextView) itemView.findViewById(R.id.tv_xiaobu_all_item_description);
            tvOriginPrice = (TextView) itemView.findViewById(R.id.tv_xiaobu_all_item_origin_price);

            ivPicurl = (ImageView) itemView.findViewById(R.id.iv_xiaobu_all_item_picurl);
            ivFlag = (ImageView) itemView.findViewById(R.id.iv_xiaobu_all_item_national_flag);


        }
    }
}
