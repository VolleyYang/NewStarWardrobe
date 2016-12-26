package com.yangshenglong.newstarwardrobe.search;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.yangshenglong.newstarwardrobe.R;

import java.util.ArrayList;

import static com.yangshenglong.newstarwardrobe.staticclass.StaticUrl.toUtf8;

/**
 * Created by CST on 16/12/21.
 */

public class HeatSearchAdapter extends BaseAdapter{
    private ArrayList<HeatSearchBean> data;
    private Context mContext;
    private HeatSearchHolder mHolder;

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
    public View getView(final int position, View convertView, ViewGroup parent) {
        mHolder = null;
        if (convertView== null){
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_activity_search_grid,parent,false);
            mHolder = new HeatSearchHolder(convertView);
            convertView.setTag(mHolder);
        }else {
            mHolder = (HeatSearchHolder) convertView.getTag();
        }
        mHolder.tv.setText(data.get(0).getData().getItems().get(position).getText());
        mHolder.tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = data.get(0).getData().getItems().get(position).getText();
                Intent intent = new Intent(mContext, SearchInformationActivity.class);
                intent.putExtra("url",toUtf8(str));
                intent.putExtra("key",str);
                SearchActivity activity = (SearchActivity) mContext;
                int type = activity.getType();
                intent.putExtra("type",type);
                mContext.startActivity(intent);
            }
        });
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
