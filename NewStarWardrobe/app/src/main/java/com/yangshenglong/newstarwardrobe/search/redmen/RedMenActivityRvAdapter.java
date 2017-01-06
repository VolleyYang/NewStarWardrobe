package com.yangshenglong.newstarwardrobe.search.redmen;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.yangshenglong.newstarwardrobe.R;
import com.yangshenglong.newstarwardrobe.staticclass.GlideCircleTransform;

import java.util.ArrayList;

/**
 * Created by CST on 16/12/24.
 */

public class RedMenActivityRvAdapter extends RecyclerView.Adapter<RedMenActivityRvAdapter.RedMenHeadHolder>  {
    private ArrayList<RedMenHeadBean> headData;
    private ArrayList<RedMenPostsBean> postsData;
    private ArrayList<RedMenLikeBean> likeData;
    private Context mContext;

    public RedMenActivityRvAdapter(Context context) {
        mContext = context;
    }

    public void setHeadData(ArrayList<RedMenHeadBean> headData) {
        this.headData = headData;
    }

    public void setPostsData(ArrayList<RedMenPostsBean> postsData) {
        this.postsData = postsData;
    }

    public void setLikeData(ArrayList<RedMenLikeBean> likeData) {
        this.likeData = likeData;
    }

    @Override
    public RedMenHeadHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_fragment_red_men_head,parent,false);
        RedMenHeadHolder headHolder = new RedMenHeadHolder(view);
        return headHolder;
    }

    @Override
    public void onBindViewHolder(final RedMenHeadHolder holder, int position) {
        holder.tvFollow.setText(headData.get(0).getData().getUserFollowNum()+"关注");
        holder.tvFans.setText(headData.get(0).getData().getUserFansNum()+"粉丝");
        Glide.with(mContext)
                .load(headData.get(0).getData().getUserAvatar())
                .transform(new GlideCircleTransform(mContext)).into(holder.ivPic);
        holder.tvPosts.setTextColor(Color.rgb(0xce, 0x10, 0x4f));
        holder.tvLike.setTextColor(Color.rgb(0x6d, 0x6d, 0x6d));
        holder.ivPosts.setVisibility(View.VISIBLE);
        holder.ivLike.setVisibility(View.INVISIBLE);
        holder.mRecyclerView.destroyDrawingCache();
        RedMenPostsAdapter adapter = new RedMenPostsAdapter(mContext);
        adapter.setData(postsData);
        holder.mRecyclerView.setAdapter(adapter);
        holder.mRecyclerView.setLayoutManager(new GridLayoutManager(mContext,2));
        holder.llPosts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.tvPosts.setTextColor(Color.rgb(0xce, 0x10, 0x4f));
                holder.tvLike.setTextColor(Color.rgb(0x6d, 0x6d, 0x6d));
                holder.ivPosts.setVisibility(View.VISIBLE);
                holder.ivLike.setVisibility(View.INVISIBLE);
                RedMenPostsAdapter adapter = new RedMenPostsAdapter(mContext);
                adapter.setData(postsData);
                holder.mRecyclerView.setAdapter(adapter);
                holder.mRecyclerView.setLayoutManager(new GridLayoutManager(mContext,2));
            }
        });
        holder.llLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.tvLike.setTextColor(Color.rgb(0xce, 0x10, 0x4f));
                holder.tvPosts.setTextColor(Color.rgb(0x6d, 0x6d, 0x6d));
                holder.ivPosts.setVisibility(View.INVISIBLE);
                holder.ivLike.setVisibility(View.VISIBLE);
                RedMenLikeAdapter adapter = new RedMenLikeAdapter(mContext);
                adapter.setData(likeData);
                holder.mRecyclerView.setAdapter(adapter);
                holder.mRecyclerView.setLayoutManager(new GridLayoutManager(mContext,2));
            }
        });
    }

    @Override
    public int getItemCount() {
        return 1;
    }


    class RedMenHeadHolder extends RecyclerView.ViewHolder{
        private TextView tvFollow,tvFans,tvPosts,tvLike;
        private ImageView ivPic,ivPosts,ivLike;
        private LinearLayout llPosts,llLike;
        private RecyclerView mRecyclerView;
        public RedMenHeadHolder(View itemView) {
            super(itemView);
            tvFollow = (TextView) itemView.findViewById(R.id.tv_item_fragment_red_men_follow);
            tvFans = (TextView) itemView.findViewById(R.id.tv_item_fragment_red_men_fans);
            tvPosts = (TextView) itemView.findViewById(R.id.tv_item_fragment_red_men_posts);
            tvLike = (TextView) itemView.findViewById(R.id.tv_item_fragment_red_men_like);
            ivPic = (ImageView) itemView.findViewById(R.id.iv_item_fragment_red_men);
            ivPosts = (ImageView) itemView.findViewById(R.id.iv_item_fragment_red_men_posts);
            ivLike = (ImageView) itemView.findViewById(R.id.iv_item_fragment_red_men_like);
            llPosts = (LinearLayout) itemView.findViewById(R.id.ll_item_fragment_red_men_posts);
            llLike = (LinearLayout) itemView.findViewById(R.id.ll_item_fragment_red_men_like);
            mRecyclerView = (RecyclerView) itemView.findViewById(R.id.recycler_view_item_fragment_red_men);
        }
    }
}
