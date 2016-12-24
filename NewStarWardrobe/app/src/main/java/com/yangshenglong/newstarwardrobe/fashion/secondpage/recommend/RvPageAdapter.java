package com.yangshenglong.newstarwardrobe.fashion.secondpage.recommend;

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
 * Created by VolleyYang on 16/12/24.
 */

public class RvPageAdapter extends RecyclerView.Adapter<RvPageAdapter.RvPageViewHolder>{
    private Context context;
    private RvPageBean  data;
    private RvPageBean.ResponseBean.DataBean.ItemsBean.ComponentBean getDatas;

    public RvPageAdapter(Context context) {
        this.context = context;
    }

    public void setData(RvPageBean data) {
        this.data = data;
    }

    @Override
    public RvPageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_recommend_page_rv,parent,false);
        RvPageViewHolder holder = new RvPageViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(RvPageViewHolder holder, int position) {
        getDatas = data.getResponse().getData().getItems().get(position ).getComponent();
        Glide.with(context).load(getDatas.getUser().getUserAvatar()).into(holder.ivAuthor);
        Glide.with(context).load(getDatas.getPics()).into(holder.ivPic);
        holder.tvContent.setText(getDatas.getContent());
        holder.tvAuthor.setText(getDatas.getUser().getUsername());
        holder.tvCount.setText(getDatas.getCollect_count());
    }

    @Override
    public int getItemCount() {
        return data!= null ? data.getResponse().getData().getItems().size(): 0;
    }

    class RvPageViewHolder extends RecyclerView.ViewHolder{
        private ImageView  ivAuthor,ivPic;
        private TextView   tvContent,tvAuthor,tvCount;
        public RvPageViewHolder(View itemView) {
            super(itemView);
            ivAuthor = (ImageView) itemView.findViewById(R.id.rv_page_iv_userAuthor);
            ivPic = (ImageView) itemView.findViewById(R.id.rv_page_iv_pic);
            tvAuthor = (TextView) itemView.findViewById(R.id.rv_page_tv_userName);
            tvContent = (TextView) itemView.findViewById(R.id.rv_page_tv_content);
            tvCount = (TextView) itemView.findViewById(R.id.rv_page_tv_count);
        }
    }
}
