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

public class RedMenPostsAdapter extends RecyclerView.Adapter<RedMenPostsAdapter.RedMenPostsHolder> {
    private ArrayList<RedMenPostsBean> data;
    private Context mContext;

    public RedMenPostsAdapter(Context context) {
        mContext = context;
    }

    public void setData(ArrayList<RedMenPostsBean> data) {
        this.data = data;
        notifyDataSetChanged();
    }

    @Override
    public RedMenPostsHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_fragment_red_men_posts, parent, false);
        RedMenPostsHolder holder = new RedMenPostsHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(RedMenPostsHolder holder, int position) {
        holder.tv.setText(data.get(0).getResponse().getData().getItems().get(position).getComponent().getContent());
        Glide.with(mContext).load(data.get(0).getResponse().getData().getItems().get(position).getComponent().getPics()).into(holder.iv);
    }

    @Override
    public int getItemCount() {
        return data.get(0).getResponse().getData().getItems().size();
    }

    class RedMenPostsHolder extends RecyclerView.ViewHolder {
        private ImageView iv;
        private TextView tv;

        public RedMenPostsHolder(View itemView) {
            super(itemView);
            iv = (ImageView) itemView.findViewById(R.id.iv_item_fragment_red_men_posts);
            tv = (TextView) itemView.findViewById(R.id.tv_item_fragment_red_men_posts);
        }
    }
}
