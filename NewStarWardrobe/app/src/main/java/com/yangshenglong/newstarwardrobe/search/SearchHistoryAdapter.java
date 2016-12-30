package com.yangshenglong.newstarwardrobe.search;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.yangshenglong.newstarwardrobe.R;
import com.yangshenglong.newstarwardrobe.database.SearchData;

import java.util.ArrayList;


/**
 * Created by CST on 16/12/29.
 */

public class SearchHistoryAdapter extends RecyclerView.Adapter<SearchHistoryAdapter.SearchHistoryHolder>{
    private ArrayList<SearchData> data;
    private Context mContext;

    public SearchHistoryAdapter(Context context) {
        mContext = context;
    }

    public void setData(ArrayList<SearchData> data) {
        this.data = data;
        notifyDataSetChanged();
    }

    @Override
    public SearchHistoryHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_search_history_rv,parent,false);
        return new SearchHistoryHolder(view);
    }

    @Override
    public void onBindViewHolder(SearchHistoryHolder holder, int position) {
        holder.tv.setText(data.get(position).getSearchText());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class SearchHistoryHolder extends RecyclerView.ViewHolder{
        private TextView tv;
        public SearchHistoryHolder(View itemView) {
            super(itemView);
            tv = (TextView) itemView.findViewById(R.id.tv_item_search_history_rv);
        }
    }
}
