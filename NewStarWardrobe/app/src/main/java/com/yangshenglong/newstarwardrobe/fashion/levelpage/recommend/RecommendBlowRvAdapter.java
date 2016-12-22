package com.yangshenglong.newstarwardrobe.fashion.levelpage.recommend;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.github.jdsjlzx.recyclerview.LRecyclerView;
import com.yangshenglong.newstarwardrobe.R;

/**
 * Created by VolleyYang on 16/12/20.
 */

public class RecommendBlowRvAdapter extends RecyclerView.Adapter<RecommendBlowRvAdapter.BlowViewHolder> {
    private Context context;
    private RecommendBean data;
    private View view;

    private RecyclerView recyclerView;
    public RecommendBlowRvAdapter(Context context) {
        this.context = context;
    }

    public void setData(RecommendBean data) {
        this.data = data;
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        this.recyclerView = recyclerView;
    }

    @Override
    public BlowViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        view = LayoutInflater.from(context).inflate(R.layout.item_recommend_blow_rv, parent, false);
        BlowViewHolder holder = new BlowViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(BlowViewHolder holder, int position) {
//        if (position==0){
//            return;
//        }

            RecommendBean.ResponseBean.DataBean.ItemsBean.ComponentBean getDatas = data.getResponse().getData().getItems().get(position+1).getComponent();

            holder.tvContent.setText(getDatas.getContent());
            holder.tvName.setText(getDatas.getUser().getUsername());
            holder.tvCount.setText(getDatas.getCollect_count());
            Glide.with(context).load(getDatas.getUser().getUserAvatar()).into(holder.ivAuthor);
            Glide.with(context).load(getDatas.getPics()).into(holder.ivPic);

    }

    @Override
    public int getItemCount() {
        return data != null ? data.getResponse().getData().getItems().size() - 1 : 0;
    }

    class BlowViewHolder extends RecyclerView.ViewHolder {
        private ImageView ivPic, ivAuthor;
        private TextView tvContent, tvName, tvCount;

        private RelativeLayout  relativeLayout;
        public BlowViewHolder(View itemView) {
            super(itemView);
            relativeLayout = (RelativeLayout) itemView.findViewById(R.id.nmb);
            ivPic = (ImageView) itemView.findViewById(R.id.blow_rv_iv_pic);
            ivAuthor = (ImageView) itemView.findViewById(R.id.blow_rv_iv_userAuthor);
            tvContent = (TextView) itemView.findViewById(R.id.blow_rv_tv_content);
            tvCount = (TextView) itemView.findViewById(R.id.recommend_blow_tv_count);
            tvName = (TextView) itemView.findViewById(R.id.blow_rv_tv_userName);
        }
    }
}
