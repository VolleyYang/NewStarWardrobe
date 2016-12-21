package com.yangshenglong.newstarwardrobe.fashion.levelpage.newest;

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
 * Created by VolleyYang on 16/12/21.
 */

public class NewestRvAdapter extends RecyclerView.Adapter<NewestRvAdapter.MyViewHolder> {
    private Context  context;
    private NewestBean  data;
    private NewestBean.ResponseBean.DataBean.ItemsBean.ComponentBean getData;

    public NewestRvAdapter(Context context) {
        this.context = context;
    }

    public void setData(NewestBean data) {
        this.data = data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_newest,parent,false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        getData = data.getResponse().getData().getItems().get(position).getComponent();
        holder.newContent.setText(getData.getContent());
        holder.newName.setText(getData.getUser().getUsername());
        holder.newCount.setText(getData.getCollect_count());
        Glide.with(context).load(getData.getUser().getUserAvatar()).into(holder.newAuthor);
        Glide.with(context).load(getData.getPics()).into(holder.newIv);
    }

    @Override
    public int getItemCount() {
        return data!= null? data.getResponse().getData().getItems().size() : 0;
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        private ImageView  newIv,newAuthor;
        private TextView   newContent,newName,newCount;
        public MyViewHolder(View itemView) {
            super(itemView);
            newIv = (ImageView) itemView.findViewById(R.id.new_iv_pic);
            newAuthor = (ImageView) itemView.findViewById(R.id.new_iv_userAuthor);
            newContent = (TextView) itemView.findViewById(R.id.new_tv_content);
            newName = (TextView) itemView.findViewById(R.id.new_tv_userName);
            newCount = (TextView) itemView.findViewById(R.id.new_tv_count);
        }
    }
}
