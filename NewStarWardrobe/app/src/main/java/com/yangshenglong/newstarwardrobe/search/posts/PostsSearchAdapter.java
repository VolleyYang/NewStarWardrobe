package com.yangshenglong.newstarwardrobe.search.posts;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
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
 * Created by CST on 16/12/23.
 */

public class PostsSearchAdapter extends RecyclerView.Adapter<PostsSearchAdapter.PostsSearchHolder>{
    private ArrayList<PostsSearchBean> data;
    private Context mContext;
    private static final float theWidth = 100f;

    public PostsSearchAdapter(Context context) {
        mContext = context;
    }

    public void setData(ArrayList<PostsSearchBean> data) {
        this.data = data;
        notifyDataSetChanged();
    }

    @Override
    public PostsSearchHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        PostsSearchHolder holder = null;
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_fragment_posts_rv,parent,false);
        holder = new PostsSearchHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(PostsSearchHolder holder, int position) {
        holder.tvText.setText(data.get(0).getData().getItems().get(position).getComponent().getDescription());
        holder.tvV.setText(data.get(0).getData().getItems().get(position).getComponent().getV());
        holder.tvCount.setText(data.get(0).getData().getItems().get(position).getComponent().getCommentCount());
        ViewGroup.LayoutParams params = holder.mImageView.getLayoutParams();
        float myWidth = Integer.parseInt(data.get(0).getData().getItems().get(position).getWidth());
        float newHeight = Integer.parseInt(data.get(0).getData().getItems().get(position).getHeight());
        float newWidth = theWidth/myWidth;
        float myHeight = (newHeight)*(newWidth);
        params.height = (int) (myHeight*5.5);
        holder.mImageView.setLayoutParams(params);
        Log.d("PostsSearchAdapter", "ccccccc"+data.get(0).getData().getItems().get(position).getWidth());
        if (Integer.parseInt(data.get(0).getData().getItems().get(position).getWidth()) ==100) {
            holder.mImageView.setImageResource(R.mipmap.ic_launcher);
        }else {
            Glide.with(mContext).load(data.get(0).getData().getItems().get(position).getComponent().getPicUrl()).into(holder.mImageView);
        }
    }

    @Override
    public int getItemCount() {
        return data!=null?data.get(0).getData().getItems().size():0;
    }

    class PostsSearchHolder extends RecyclerView.ViewHolder{
        private ImageView mImageView;
        private TextView tvText,tvV,tvCount;
        private LinearLayout mLinearLayout;
        public PostsSearchHolder(View itemView) {
            super(itemView);
            mImageView = (ImageView) itemView.findViewById(R.id.iv_item_fragment_posts_big);
            tvText = (TextView) itemView.findViewById(R.id.tv_item_fragment_posts_text);
            tvV = (TextView) itemView.findViewById(R.id.tv_item_fragment_posts_v);
            tvCount = (TextView) itemView.findViewById(R.id.tv_item_fragment_posts_count);
            mLinearLayout = (LinearLayout) itemView.findViewById(R.id.ll_item_fragment_posts);
        }
    }
}
