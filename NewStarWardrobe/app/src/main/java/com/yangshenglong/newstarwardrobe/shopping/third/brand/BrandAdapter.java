package com.yangshenglong.newstarwardrobe.shopping.third.brand;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yangshenglong.newstarwardrobe.R;

/**
 * Created by xiaoBu on 16/12/27.
 */

public class BrandAdapter extends RecyclerView.Adapter {

    private Context mContext;
    private BrandDataTitle data;

    // 定义不同行布局
    private static final int TYPE_UP = 0;
    private static final int TYPE_DOWN = 1;

    public BrandAdapter(Context context) {
        mContext = context;
    }

    public void setData(BrandDataTitle data) {
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

                View viewUp = LayoutInflater.from(mContext).inflate(R.layout.item_xiaobu_third_brand_title, parent, false);

                holder = new HeadViewHolder(viewUp);

                break;

            case TYPE_DOWN:

                View viewDown = LayoutInflater.from(mContext).inflate(R.layout.item_xiaobu_third_brand_content, parent, false);

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

//                BrandAdapterContent adapter = new BrandAdapterContent(mContext);//初始化适配器
//                adapter.setDataContent(data);//发送数据到二级适配器
//                holderDown.rvDown.setAdapter(adapter);//绑定适配器
//
//                final GridLayoutManager manager = new GridLayoutManager(mContext, 2);
//
//                holderDown.rvDown.setLayoutManager(manager);

                break;
        }

    }

    @Override
    public int getItemCount() {
        return 2;
    }

    /**
     *
     */
    class HeadViewHolder extends RecyclerView.ViewHolder {


        public HeadViewHolder(View itemView) {
            super(itemView);

        }
    }

    /**
     *
     */
    class BottomViewHolder extends RecyclerView.ViewHolder {


        public BottomViewHolder(View itemView) {
            super(itemView);

        }
    }
}
