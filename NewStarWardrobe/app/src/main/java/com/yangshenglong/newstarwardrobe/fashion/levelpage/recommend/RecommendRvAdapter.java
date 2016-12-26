package com.yangshenglong.newstarwardrobe.fashion.levelpage.recommend;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.yangshenglong.newstarwardrobe.R;
import com.yangshenglong.newstarwardrobe.fashion.secondpage.recommend.RvPageAty;

import java.util.Date;

/**
 * Created by VolleyYang on 16/12/20.
 */

public class RecommendRvAdapter extends RecyclerView.Adapter {

    private RecommendBean data;
    private Context context;
    private View view;
    private String rvWeb;
    private String flagId;



    public RecommendRvAdapter(Context context) {
        this.context = context;
    }

    public void setData(RecommendBean data) {
        this.data = data;
        notifyDataSetChanged();
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return 0;
        } else if (position == 1) {
            return 1;
        }
        return 2;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder holder = null;
        switch (viewType) {
            case 0:
                view = LayoutInflater.from(context).inflate(R.layout.item_recommend_top, parent, false);
                holder = new OneViewHolder(view);
                break;
            case 1:
                view = LayoutInflater.from(context).inflate(R.layout.item_recommend_blow, parent, false);
                holder = new TwoViewHolder(view);
                break;
        }
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {

        int item = getItemViewType(position);
        switch (item) {
            case 0:
                if (position == 0 && data != null) {
                    OneViewHolder oneViewHolder = (OneViewHolder) holder;
                    Glide.with(context).load(data.getResponse().getData().getItems().get(position).getComponent().getPicUrl()).into(oneViewHolder.topImg);
                }
                break;
            case 1:
                TwoViewHolder twoViewHolder = (TwoViewHolder) holder;
                RecommendBlowRvAdapter blowRvAdapter = new RecommendBlowRvAdapter(context);
                blowRvAdapter.setData(data);
                twoViewHolder.recyclerView.setAdapter(blowRvAdapter);
                GridLayoutManager manager = new GridLayoutManager(context, 2);
                twoViewHolder.recyclerView.setLayoutManager(manager);

                //接口回调
                blowRvAdapter.setOnClick(new ListRvOnClick() {
                    @Override
                    public void MyOnClick(int position) {

                        rvWeb = data.getResponse().getData().getItems().get(position).getComponent().getAction().getId();

                        flagId = data.getResponse().getData().getFlag();
                        Intent intent = new Intent(context, RvPageAty.class);
                        intent.putExtra("rvWeb", rvWeb);
                        context.startActivity(intent);
                    }
                });

                break;
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }


    class OneViewHolder extends RecyclerView.ViewHolder {
        private ImageView topImg;

        public OneViewHolder(View itemView) {
            super(itemView);
            topImg = (ImageView) itemView.findViewById(R.id.recommend_top_iv);
        }
    }

    class TwoViewHolder extends RecyclerView.ViewHolder {
        private RecyclerView recyclerView;

        public TwoViewHolder(View itemView) {
            super(itemView);
            recyclerView = (RecyclerView) itemView.findViewById(R.id.recommend_blow_rv);
        }
    }

}
