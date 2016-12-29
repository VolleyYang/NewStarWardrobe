package com.yangshenglong.newstarwardrobe.search.redmen;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.yangshenglong.newstarwardrobe.R;

import java.util.ArrayList;

/**
 * Created by CST on 16/12/24.
 */

public class RedMenLikeAdapter extends RecyclerView.Adapter<RedMenLikeAdapter.RedMenLikeHolder>{
    private ArrayList<RedMenLikeBean> data;
    private Context mContext;

    public RedMenLikeAdapter(Context context) {
        mContext = context;
    }

    public void setData(ArrayList<RedMenLikeBean> data) {
        this.data = data;
        notifyDataSetChanged();
    }

    @Override
    public RedMenLikeHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RedMenLikeHolder holder = null;
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_fragment_red_men_like,parent,false);
        holder = new RedMenLikeHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(RedMenLikeHolder holder, int position) {
        holder.tvTitle.setText(data.get(0).getResponse().getData().getItems().get(position).getComponent().getContent());
        holder.tvName.setText(data.get(0).getResponse().getData().getItems().get(position).getComponent().getUser().getUsername());
        holder.tvLike.setText(data.get(0).getResponse().getData().getItems().get(position).getComponent().getCollect_count());
        Glide.with(mContext).load(data.get(0).getResponse().getData().getItems().get(position).getComponent().getPics()).into(holder.ivBig);
        Glide.with(mContext).load(data.get(0).getResponse().getData().getItems().get(position).getComponent().getUser().getUserAvatar()).into(holder.ivPic);
        holder.ivLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return data.get(0).getResponse().getData().getItems().size();
    }

    class RedMenLikeHolder extends RecyclerView.ViewHolder{
        private ImageView ivBig,ivPic,ivLike;
        private TextView tvTitle,tvName,tvLike;
        public RedMenLikeHolder(View itemView) {
            super(itemView);
            ivBig = (ImageView) itemView.findViewById(R.id.iv_item_fragment_red_men_like_big);
            ivPic = (ImageView) itemView.findViewById(R.id.iv_item_fragment_red_men_like_pic);
            ivLike = (ImageView) itemView.findViewById(R.id.iv_item_fragment_red_men_like_num);
            tvTitle = (TextView) itemView.findViewById(R.id.tv_item_fragment_red_men_like_title);
            tvName = (TextView) itemView.findViewById(R.id.tv_item_fragment_red_men_like_name);
            tvLike = (TextView) itemView.findViewById(R.id.tv_item_fragment_red_men_like_num);
        }
    }
}
