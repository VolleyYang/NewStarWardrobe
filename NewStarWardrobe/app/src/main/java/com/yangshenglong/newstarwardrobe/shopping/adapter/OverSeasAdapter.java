package com.yangshenglong.newstarwardrobe.shopping.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.yangshenglong.newstarwardrobe.R;
import com.yangshenglong.newstarwardrobe.shopping.bean.OverSeasDataContent;
import com.yangshenglong.newstarwardrobe.shopping.bean.OverSeasDataTitle;
import com.yangshenglong.newstarwardrobe.shopping.second.DetailActivity;

/**
 * Created by xiaoBu on 16/12/22.
 */

public class OverSeasAdapter extends RecyclerView.Adapter {

    private Context mContext;
    private OverSeasDataTitle dataTitle;
    private OverSeasDataContent dataContent;

    public OverSeasAdapter(Context context) {
        mContext = context;
    }

    // 题头
    public void setDataTitle(OverSeasDataTitle dataTitle) {
        this.dataTitle = dataTitle;
        notifyDataSetChanged();
    }

    // 正文
    public void setDataContent(OverSeasDataContent dataContent) {
        this.dataContent = dataContent;
        notifyDataSetChanged();
    }

    // 定义不同行布局
    private static final int TYPE_TITLE = 0;
    private static final int TYPE_BRAND = 1;
    private static final int TYPE_EVERY = 2;
    private static final int TYPE_CONTENT = 3;

    @Override
    public int getItemViewType(int position) {
        /* 由于接口原因 行布局3不添加 */
        if (position == 0) {
            return TYPE_TITLE;
        } else {
            return TYPE_CONTENT;
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        RecyclerView.ViewHolder holder = null;

        switch (viewType) {

            case TYPE_TITLE:

                View viewTitle = LayoutInflater.from(mContext).inflate(R.layout.item_xiaobu_china_title, parent, false);

                holder = new TitleViewHolder(viewTitle);

                break;


            case TYPE_CONTENT:

                View viewContent = LayoutInflater.from(mContext).inflate(R.layout.item_xiaobu_all_down, parent, false);

                holder = new ContentViewHolder(viewContent);

                break;
        }

        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        int type = getItemViewType(position);

        TitleViewHolder holderTitle = null;
        ContentViewHolder holderContent = null;


        switch (type) {

            case TYPE_TITLE:

                holderTitle = (TitleViewHolder) holder;

                Glide.with(mContext).load(dataTitle.getData().getItems().get(position).getComponent().getPicUrl()).into(holderTitle.ivTitle);

                break;

            case TYPE_CONTENT:

                holderContent = (ContentViewHolder) holder;

                final OverSeasAdapterContent adapter = new OverSeasAdapterContent(mContext);

                adapter.setData(dataContent);

                adapter.setClick(new MyClick() {
                    @Override
                    public void myListener(int pos) {
                        Intent intent = new Intent(mContext, DetailActivity.class);
                        mContext.startActivity(intent);
                    }
                });

                holderContent.rvDown.setAdapter(adapter);

                final GridLayoutManager manager = new GridLayoutManager(mContext, 2);

                manager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
                    @Override
                    public int getSpanSize(int position) {
                        return adapter.isAdView(position) ? manager.getSpanCount() : 1;
                    }
                });
                holderContent.rvDown.setLayoutManager(manager);


                break;
        }

    }

    @Override
    public int getItemCount() {
        return dataTitle != null && dataContent != null ? 2 : 0;
    }

    /**
     * 行布局1
     * 题头缓存类
     */
    class TitleViewHolder extends RecyclerView.ViewHolder {
        private ImageView ivTitle;

        public TitleViewHolder(View itemView) {
            super(itemView);
            ivTitle = (ImageView) itemView.findViewById(R.id.iv_xiaobu_china_title);
        }
    }

    /**
     * 行布局2
     * 品牌缓存类
     */
    class BrandViewHolder extends RecyclerView.ViewHolder {

        private ImageView ivBrandOne, ivBrandTwo, ivBrandThree;
        private TextView tvBrandTitle;

        public BrandViewHolder(View itemView) {
            super(itemView);
            ivBrandOne = (ImageView) itemView.findViewById(R.id.iv_xiaobu_china_brand_one);
            ivBrandTwo = (ImageView) itemView.findViewById(R.id.iv_xiaobu_china_brand_two);
            ivBrandThree = (ImageView) itemView.findViewById(R.id.iv_xiaobu_china_brand_three);
            tvBrandTitle = (TextView) itemView.findViewById(R.id.tv_xiaobu_china_brand_title);
        }
    }

    /**
     * 行布局3 (无数据)
     * 每日抢手货缓存类
     */
    class EveryDayViewHolder extends RecyclerView.ViewHolder {
        public EveryDayViewHolder(View itemView) {
            super(itemView);
        }
    }

    /**
     * 行布局4
     * 正文内容缓存类
     */
    class ContentViewHolder extends RecyclerView.ViewHolder {

        private RecyclerView rvDown;

        public ContentViewHolder(View itemView) {
            super(itemView);

            rvDown = (RecyclerView) itemView.findViewById(R.id.rv_xiaobu_all_down);

        }
    }
}
