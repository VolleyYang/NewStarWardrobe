package com.yangshenglong.newstarwardrobe.fashion.levelpage.recommend;

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
 * Created by VolleyYang on 16/12/20.
 */

public class RecommendBlowRvAdapter extends RecyclerView.Adapter<RecommendBlowRvAdapter.BlowViewHolder> {
    private Context context;
    private RecommendBean  data;

    public RecommendBlowRvAdapter(Context context) {
        this.context = context;
    }

    public void setData(RecommendBean data) {
        this.data = data;
    }

    @Override
    public BlowViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View  view = LayoutInflater.from(context).inflate(R.layout.item_recommend_blow_rv,parent,false);
        BlowViewHolder  holder = new BlowViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(BlowViewHolder holder, int position) {
        holder.tvContent.setText(data.getResponse().getData().getItems().get(position).getComponent().getContent());
        holder.tvName.setText(data.getResponse().getData().getItems().get(position).getComponent().getUser().getUsername());
        holder.tvCount.setText(data.getResponse().getData().getItems().get(position).getComponent().getCollect_count());
        Glide.with(context).load(data.getResponse().getData().getItems().get(position).getComponent().getPics()).into(holder.ivPic);
        Glide.with(context).load(data.getResponse().getData().getItems().get(position).getComponent().getUser().getUserAvatar()).into(holder.ivAuthor);
    }

    @Override
    public int getItemCount() {
        return data!=null?data.getResponse().getData().getItems().size() : 0;
    }

    class BlowViewHolder extends RecyclerView.ViewHolder{
        private ImageView  ivPic,ivAuthor;
        private TextView  tvContent,tvName,tvCount;
        public BlowViewHolder(View itemView) {
            super(itemView);
            ivPic = (ImageView) itemView.findViewById(R.id.blow_rv_iv_pic);
            ivAuthor = (ImageView) itemView.findViewById(R.id.blow_rv_iv_userAuthor);
            tvContent = (TextView) itemView.findViewById(R.id.blow_rv_tv_content);
            tvCount = (TextView) itemView.findViewById(R.id.recommend_blow_tv_count);
            tvName = (TextView) itemView.findViewById(R.id.blow_rv_tv_userName);
        }
    }
}
