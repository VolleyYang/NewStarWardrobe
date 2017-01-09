package com.yangshenglong.newstarwardrobe.classify;

import android.content.Context;
import android.graphics.Paint;
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
 * Created by CST on 16/12/21.
 */

public class ClassifyGridItemActivityAdapter extends RecyclerView.Adapter<ClassifyGridItemActivityAdapter.ClassifyGridItemActivityHolder> {
    private ArrayList<SearchBean> data;
    private Context mContext;
    private static final float theWidth = 366f;

    public ClassifyGridItemActivityAdapter(Context context) {
        mContext = context;
    }

    public void setData(ArrayList<SearchBean> data) {
        this.data = data;
        notifyDataSetChanged();
    }

    @Override
    public ClassifyGridItemActivityHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_activity_item_grid_classify_rv, parent, false);
        return new ClassifyGridItemActivityHolder(view);
    }

    @Override
    public void onBindViewHolder(ClassifyGridItemActivityHolder holder, final int position) {
        holder.tvTitle.setText(data.get(0).getData().getItems().get(position).getComponent().getDescription());
        holder.tvPrice.setText(("¥" + data.get(0).getData().getItems().get(position).getComponent().getPrice()));
        holder.tvOriginPrice.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
        holder.tvOriginPrice.setText(("¥" + data.get(0).getData().getItems().get(position).getComponent().getOrigin_price()));
        holder.tvCountry.setText(data.get(0).getData().getItems().get(position).getComponent().getCountry());
        // 根据接口信息为图片设置不同的高度
        ViewGroup.LayoutParams params = holder.ivBig.getLayoutParams();
        final float myWidth = Integer.parseInt(data.get(0).getData().getItems().get(position).getWidth());
        int newHeight = Integer.parseInt(data.get(0).getData().getItems().get(position).getHeight());
        float newWidth = theWidth / myWidth;
        final float myHeight = (newHeight) * (newWidth);
        params.height = (int) (myHeight * 1.5);
        holder.ivBig.setLayoutParams(params);
        Glide.with(mContext).load(data.get(0).getData().getItems().get(position).getComponent().getPicUrl()).into(holder.ivBig);
        Glide.with(mContext).load(data.get(0).getData().getItems().get(position).getComponent().getNationalFlag()).into(holder.ivCountry);
        holder.mLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return data.get(0).getData().getItems().size();
    }

    class ClassifyGridItemActivityHolder extends RecyclerView.ViewHolder {
        private LinearLayout mLinearLayout;
        private TextView tvTitle, tvPrice, tvOriginPrice, tvCountry;
        private ImageView ivBig, ivCountry;

        public ClassifyGridItemActivityHolder(View itemView) {
            super(itemView);
            mLinearLayout = (LinearLayout) itemView.findViewById(R.id.ll_item_activity_item_grid_classify_rv);
            tvTitle = (TextView) itemView.findViewById(R.id.tv_item_activity_item_grid_classify_rv_title);
            tvPrice = (TextView) itemView.findViewById(R.id.tv_item_activity_item_grid_classify_rv_price);
            tvOriginPrice = (TextView) itemView.findViewById(R.id.tv_item_activity_item_grid_classify_rv_origin_price);
            tvCountry = (TextView) itemView.findViewById(R.id.tv_item_activity_item_grid_classify_rv_country);
            ivBig = (ImageView) itemView.findViewById(R.id.iv_item_activity_item_grid_classify_rv_big);
            ivCountry = (ImageView) itemView.findViewById(R.id.iv_item_activity_item_grid_classify_rv_country);
        }
    }
}
