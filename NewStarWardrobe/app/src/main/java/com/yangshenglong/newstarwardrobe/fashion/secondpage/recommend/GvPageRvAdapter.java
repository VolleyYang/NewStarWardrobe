package com.yangshenglong.newstarwardrobe.fashion.secondpage.recommend;

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
 * Created by VolleyYang on 16/12/23.
 */

public class GvPageRvAdapter extends RecyclerView.Adapter<GvPageRvAdapter.GvPageViewHolder> {
    private Context  context;
    private GvPageBean  data;
    private GvPageBean.ResponseBean.DataBean.ItemsBean.ComponentBean getData;

    public GvPageRvAdapter(Context context) {
        this.context = context;
    }

    public void setData(GvPageBean data) {
        this.data = data;
    }

    @Override
    public GvPageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_gv_page_rv,parent,false);
        GvPageViewHolder  holder = new GvPageViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(GvPageViewHolder holder, int position) {
        getData = data.getResponse().getData().getItems().get(position).getComponent();
        holder.gvPageCount.setText(getData.getCollect_count());
        holder.gvPageName.setText(getData.getUser().getUsername());
        holder.gvPageContent.setText(getData.getContent());
        Glide.with(context).load(getData.getUser().getUserAvatar()).into(holder.gvPageIvAuthor);
        Glide.with(context).load(getData.getPics()).into(holder.gvPagePic);
    }

    @Override
    public int getItemCount() {
        return data!= null? data.getResponse().getData().getItems().size(): 0;
    }

    class GvPageViewHolder extends RecyclerView.ViewHolder{
        private ImageView gvPageIvAuthor,gvPagePic;
        private TextView gvPageContent,gvPageName,gvPageCount;
        public GvPageViewHolder(View itemView) {
            super(itemView);
            gvPageIvAuthor = (ImageView) itemView.findViewById(R.id.gv_page_iv_userAuthor);
            gvPagePic = (ImageView) itemView.findViewById(R.id.gv_page_iv_pic);
            gvPageContent = (TextView) itemView.findViewById(R.id.gv_page_tv_content);
            gvPageName = (TextView) itemView.findViewById(R.id.gv_page_tv_userName);
            gvPageCount = (TextView) itemView.findViewById(R.id.gv_page_tv_count);
        }
    }
}
