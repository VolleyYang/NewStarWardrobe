package com.yangshenglong.newstarwardrobe.fashion.levelpage.recommend;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.yangshenglong.newstarwardrobe.R;

/**
 * Created by VolleyYang on 16/12/20.
 */

public class RecommendRvAdapter extends RecyclerView.Adapter {

    private RecommendBean  data;
    private Context context;
    private View view;


    public RecommendRvAdapter(Context context) {
        this.context = context;
    }

    public void setData(RecommendBean data) {
        this.data = data;
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0){
            return 0;
        }else if (position == 1){
            return 1;
        }
        return 2;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder  holder = null;
        switch (viewType){
            case 0:
                view = LayoutInflater.from(context).inflate(R.layout.item_recommend_top,parent,false);
                holder = new OneViewHolder(view);
                break;
            case 1:
                view = LayoutInflater.from(context).inflate(R.layout.item_recommend_blow,parent,false);
                holder = new TwoViewHolder(view);
                break;
        }
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        int item  = getItemViewType(position);
        switch (item){
            case 0:
                if (position!= 0 && data!= null){
                    OneViewHolder oneViewHolder = (OneViewHolder) holder;
                    Glide.with(context).load(data.getResponse().getData().getItems().get(position).getComponent().getPicUrl()).into(oneViewHolder.topImg);
                }
                break;
            case 1:
                break;
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }


    class OneViewHolder extends RecyclerView.ViewHolder{
        private ImageView  topImg;
        public OneViewHolder(View itemView) {
            super(itemView);
            topImg = (ImageView) itemView.findViewById(R.id.recommend_top_iv);
        }
    }

    class TwoViewHolder extends RecyclerView.ViewHolder{
        private RecyclerView  recyclerView;
        public TwoViewHolder(View itemView) {
            super(itemView);
            recyclerView = (RecyclerView) itemView.findViewById(R.id.recommend_blow_rv);
        }
    }

}
