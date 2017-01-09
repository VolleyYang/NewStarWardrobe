package com.yangshenglong.newstarwardrobe.search.redmen;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.yangshenglong.newstarwardrobe.R;

import java.util.ArrayList;

/**
 * Created by CST on 16/12/24.
 */

public class RedMenSearchAdapter extends RecyclerView.Adapter<RedMenSearchAdapter.RedMenSearchHolder> {
    private ArrayList<RedMenSearchBean> data;
    private Context mContext;

    public RedMenSearchAdapter(Context context) {
        mContext = context;
    }

    public void setData(ArrayList<RedMenSearchBean> data) {
        this.data = data;
        notifyDataSetChanged();
    }

    @Override
    public RedMenSearchHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_red_guide_search, parent, false);
        RedMenSearchHolder holder = new RedMenSearchHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(RedMenSearchHolder holder, final int position) {
        holder.tvName.setText(data.get(0).getData().getItems().get(position).getComponent().getUserName());
        holder.tvType.setText(data.get(0).getData().getItems().get(position).getComponent().getUserTypeName());
        Glide.with(mContext).load(data.get(0).getData().getItems().get(position).getComponent().getUserAvatar()).into(holder.iv);
        holder.ll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = data.get(0).getData().getItems().get(position).getComponent().getAction().getId();
                Intent intent = new Intent(mContext, RedMenActivity.class);
                intent.putExtra("id", id);
                intent.putExtra("title", data.get(0).getData().getItems().get(position).getComponent().getUserName());
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return data != null && data.get(0).getData() != null
                && data.get(0).getData().getItems() != null
                ? data.get(0).getData().getItems().size() : 0;
    }

    class RedMenSearchHolder extends RecyclerView.ViewHolder {
        private LinearLayout ll;
        private ImageView iv;
        private TextView tvName, tvType;

        public RedMenSearchHolder(View itemView) {
            super(itemView);
            ll = (LinearLayout) itemView.findViewById(R.id.ll_item_red_guide_search);
            iv = (ImageView) itemView.findViewById(R.id.iv_item_red_guide_search);
            tvName = (TextView) itemView.findViewById(R.id.tv_item_red_guide_search_name);
            tvType = (TextView) itemView.findViewById(R.id.tv_item_red_guide_search_type);
        }
    }
}
