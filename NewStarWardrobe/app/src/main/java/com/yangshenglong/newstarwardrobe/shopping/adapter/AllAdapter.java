package com.yangshenglong.newstarwardrobe.shopping.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.yangshenglong.newstarwardrobe.R;
import com.yangshenglong.newstarwardrobe.shopping.bean.AllDataContent;
import com.yangshenglong.newstarwardrobe.shopping.second.DetailActivity;

/**
 * Created by xiaoBu on 16/12/21.
 */

public class AllAdapter extends RecyclerView.Adapter {

    private Context mContext;
    private AllDataContent data;

    // 定义不同行布局
    private static final int TYPE_UP = 0;
    private static final int TYPE_DOWN = 1;

    public AllAdapter(Context context) {
        mContext = context;
    }

    public void setData(AllDataContent data) {
        this.data = data;
        notifyDataSetChanged();
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return TYPE_UP;
        } else {
            return TYPE_DOWN;
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        RecyclerView.ViewHolder holder = null;

        switch (viewType) {

            case TYPE_UP:

                View viewUp = LayoutInflater.from(mContext).inflate(R.layout.item_xiaobu_all_up, parent, false);

                holder = new HeadViewHolder(viewUp);

                break;

            case TYPE_DOWN:

                View viewDown = LayoutInflater.from(mContext).inflate(R.layout.item_xiaobu_all_down, parent, false);

                holder = new BottomViewHolder(viewDown);

                break;
        }
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        int type = getItemViewType(position);

        HeadViewHolder holderUp = null;
        BottomViewHolder holderDown = null;

        switch (type) {
            case TYPE_UP:

                break;

            case TYPE_DOWN:

                holderDown = (BottomViewHolder) holder;

                final AllAdapterContent adapter = new AllAdapterContent(mContext);//初始化适配器
                adapter.setData(data);//发送数据到二级适配器

                /* Rv点击事件 */
                adapter.setClick(new MyClick() {
                    @Override
                    public void myListener(int pos) {

                        Intent intent = new Intent(mContext, DetailActivity.class);
                        mContext.startActivity(intent);
                    }
                });

                holderDown.rvDown.setAdapter(adapter);//绑定适配器

                final GridLayoutManager manager = new GridLayoutManager(mContext, 2);

                manager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
                    @Override
                    public int getSpanSize(int position) {
                        return adapter.isAdView(position) ? manager.getSpanCount() : 1;
                    }
                });
                holderDown.rvDown.setLayoutManager(manager);

                break;
        }

    }

    @Override
    public int getItemCount() {
        return 2;
    }

    class HeadViewHolder extends RecyclerView.ViewHolder {

        private ImageView ivUp;

        public HeadViewHolder(View itemView) {
            super(itemView);

            ivUp = (ImageView) itemView.findViewById(R.id.iv_xiaobu_all_item_up);
        }
    }

    class BottomViewHolder extends RecyclerView.ViewHolder {

        private RecyclerView rvDown;

        public BottomViewHolder(View itemView) {
            super(itemView);

            rvDown = (RecyclerView) itemView.findViewById(R.id.rv_xiaobu_all_down);
        }
    }
}
