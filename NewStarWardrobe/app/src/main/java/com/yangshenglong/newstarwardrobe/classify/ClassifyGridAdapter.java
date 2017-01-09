package com.yangshenglong.newstarwardrobe.classify;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.yangshenglong.newstarwardrobe.R;

import java.util.ArrayList;

import static com.yangshenglong.newstarwardrobe.staticclass.StaticUrl.toUtf8;

/**
 * Created by CST on 16/12/20.
 */

public class ClassifyGridAdapter extends BaseAdapter {
    private ArrayList<ClassifyGridBean> data;
    private int type = 0;
    private Context mContext;

    public void setData(ArrayList<ClassifyGridBean> data) {
        this.data = data;
        notifyDataSetChanged();
    }

    public ClassifyGridAdapter(int type, Context context) {
        this.type = type;
        mContext = context;

    }

    @Override
    public int getCount() {
        return data.get(0).getData().getItems().get(type).getComponent().getItems().size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(0).getData().getItems().get(type).getComponent().getItems().get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        ClassifyGridViewHolder holder = null;
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_fragment_classify_grid, parent, false);
            holder = new ClassifyGridViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ClassifyGridViewHolder) convertView.getTag();
        }
        holder.mTextView.setText(data.get(0).getData().getItems()
                .get(type).getComponent().getItems().get(position).getComponent().getWord());
        Glide.with(mContext)
                .load(data.get(0).getData().getItems().get(type).getComponent()
                        .getItems().get(position).getComponent().getPicUrl()).into(holder.mImageView);
        holder.mLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, ClassifyGridItemActivity.class);
                intent.putExtra("key", data.get(0).getData().getItems().get(type).getComponent().getItems().get(position).getComponent().getWord());
                String url = toUtf8(data.get(0).getData().getItems().get(type).getComponent().getItems().get(position).getComponent().getWord());

                intent.putExtra("url", url);
                mContext.startActivity(intent);
            }
        });
        return convertView;
    }

    private class ClassifyGridViewHolder {
        private ImageView mImageView;
        private TextView mTextView;
        private LinearLayout mLinearLayout;

        public ClassifyGridViewHolder(View view) {
            super();
            mLinearLayout = (LinearLayout) view.findViewById(R.id.ll_item_fragment_classify_grid);
            mImageView = (ImageView) view.findViewById(R.id.iv_item_fragment_classify_grid);
            mTextView = (TextView) view.findViewById(R.id.tv_item_fragment_classify_grid);
        }
    }
}
