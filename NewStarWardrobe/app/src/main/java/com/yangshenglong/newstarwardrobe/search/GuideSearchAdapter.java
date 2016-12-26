package com.yangshenglong.newstarwardrobe.search;

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
 * Created by CST on 16/12/22.
 */

public class GuideSearchAdapter extends RecyclerView.Adapter<GuideSearchAdapter.GuideSearchHolder>{
    private ArrayList<GuideSearchBean> data;
    private Context mContext;
    private int type =1;

    public void setType(int type) {
        this.type = type;
    }

    public GuideSearchAdapter(Context context) {
        mContext = context;
    }

    public void setData(ArrayList<GuideSearchBean> data) {
        this.data = data;
        notifyDataSetChanged();
    }

    @Override
    public GuideSearchHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        GuideSearchHolder holder = null;
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_guide_search,parent,false);
        holder = new GuideSearchHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(GuideSearchHolder holder, int position) {
        holder.tvTitle.setText(data.get(0).getData().getItems().get(position).getText());
        holder.tvText.setText(data.get(0).getData().getItems().get(position).getDescription());
        holder.tvFollow.setText(data.get(0).getData().getItems().get(position).getFollow()+"人关注");
        Glide.with(mContext).load(data.get(0).getData().getItems().get(position).getPicUrl()).into(holder.mImageView);
        holder.mLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (type){
                    case 1:
                        break;
                    case 2:
                        break;

                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.get(0).getData().getItems().size();
    }

    class GuideSearchHolder extends RecyclerView.ViewHolder{
        private LinearLayout mLinearLayout;
        private TextView tvTitle,tvText,tvFollow;
        private ImageView mImageView;
        public GuideSearchHolder(View itemView) {
            super(itemView);
            mLinearLayout = (LinearLayout) itemView.findViewById(R.id.ll_item_guide_search);
            tvTitle = (TextView) itemView.findViewById(R.id.tv_item_guide_search_title);
            tvText = (TextView) itemView.findViewById(R.id.tv_item_guide_search_text);
            tvFollow = (TextView) itemView.findViewById(R.id.tv_item_guide_search_follow);
            mImageView = (ImageView) itemView.findViewById(R.id.iv_item_guide_search);
        }
    }
}
