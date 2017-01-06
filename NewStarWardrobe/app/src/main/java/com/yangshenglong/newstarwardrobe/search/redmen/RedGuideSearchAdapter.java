package com.yangshenglong.newstarwardrobe.search.redmen;

import android.content.Context;
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

public class RedGuideSearchAdapter extends RecyclerView.Adapter<RedGuideSearchAdapter.RedGuideSearchHolder> {
    private ArrayList<RedGuideSearchBean> data;
    private Context mContext;

    public RedGuideSearchAdapter(Context context) {
        mContext = context;
    }

    public void setData(ArrayList<RedGuideSearchBean> data) {
        this.data = data;
        notifyDataSetChanged();
    }

    @Override
    public RedGuideSearchHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RedGuideSearchHolder holder = null;
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_red_guide_search, parent, false);
        holder = new RedGuideSearchHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(RedGuideSearchHolder holder, int position) {
        holder.tvName.setText(data.get(0).getData().getItems().get(position).getText());
        holder.tvType.setText(data.get(0).getData().getItems().get(position).getDescription());
        Glide.with(mContext).load(data.get(0).getData().getItems().get(position).getPicUrl()).into(holder.iv);
        holder.ll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return data.get(0).getData().getItems().size();
    }

    class RedGuideSearchHolder extends RecyclerView.ViewHolder {
        private LinearLayout ll;
        private ImageView iv;
        private TextView tvName, tvType;

        public RedGuideSearchHolder(View itemView) {
            super(itemView);
            ll = (LinearLayout) itemView.findViewById(R.id.ll_item_red_guide_search);
            iv = (ImageView) itemView.findViewById(R.id.iv_item_red_guide_search);
            tvName = (TextView) itemView.findViewById(R.id.tv_item_red_guide_search_name);
            tvType = (TextView) itemView.findViewById(R.id.tv_item_red_guide_search_type);
        }
    }
}
