package com.yangshenglong.newstarwardrobe.fashion.levelpage.recommend;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.yangshenglong.newstarwardrobe.R;

/**
 * Created by VolleyYang on 16/12/21.
 */

public class RecommendGvAdapter extends BaseAdapter {

    private Context context;
    private RecommendGvBean  data;
    private RecommendGvBean.ResponseBean.DataBean.ItemsBean getData;


    public RecommendGvAdapter(Context context) {
        this.context = context;
    }

    public void setData(RecommendGvBean data) {
        this.data = data;
    }

    @Override
    public int getCount() {
        return data!=null ? data.getResponse().getData().getItems().size() : 0;
    }

    @Override
    public Object getItem(int position) {
        return data!=null ? data.getResponse().getData().getItems().get(position) : null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        GvViewHolder  holder = null;
        getData = data.getResponse().getData().getItems().get(position);
        if (convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.item_commend_head_gv,parent,false);
            holder = new GvViewHolder(convertView);
            convertView.setTag(holder);
        }else {
            holder = (GvViewHolder) convertView.getTag();
        }
        holder.gvTv.setText(getData.getComponent().getAction().getTitle());
        Glide.with(context).load(getData.getComponent().getPicUrl()).into(holder.gvIv);
        return convertView;
    }

    class GvViewHolder  {
        private ImageView gvIv;
        private TextView  gvTv;
        public GvViewHolder(View  view) {
            gvIv = (ImageView) view.findViewById(R.id.commend_gv_head_iv);
            gvTv = (TextView) view.findViewById(R.id.commend_gv_head_tv);
        }
    }
}
