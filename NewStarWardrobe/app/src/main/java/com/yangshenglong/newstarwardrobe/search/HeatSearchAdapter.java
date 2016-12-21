package com.yangshenglong.newstarwardrobe.search;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.yangshenglong.newstarwardrobe.R;

import java.util.ArrayList;

/**
 * Created by CST on 16/12/21.
 */

public class HeatSearchAdapter extends BaseAdapter{
    private ArrayList<HeatSearchBean> data;
    private Context mContext;

    public HeatSearchAdapter(Context context) {
        mContext = context;
    }

    public void setData(ArrayList<HeatSearchBean> data) {
        this.data = data;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return data.get(0).getData().getItems().size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(0).getData().getItems().get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        HeatSearchHolder holder = null;
        if (convertView== null){
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_activity_search_grid,parent,false);
            holder = new HeatSearchHolder(convertView);
            convertView.setTag(holder);
        }else {
            holder = (HeatSearchHolder) convertView.getTag();
        }
        holder.tv.setText(data.get(0).getData().getItems().get(position).getText());
        return convertView;
    }
    class HeatSearchHolder{
        private TextView tv;
        public HeatSearchHolder(View view){
            super();
            tv = (TextView) view.findViewById(R.id.tv_item_activity_search_grid);
        }
    }

}
