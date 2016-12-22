package com.yangshenglong.newstarwardrobe.search;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.yangshenglong.newstarwardrobe.R;

import java.util.ArrayList;

/**
 * Created by CST on 16/12/22.
 */

public class SearchInformationAdapter extends RecyclerView.Adapter<SearchInformationAdapter.SearchInformationHolder>{
    private ArrayList<String> data;
    private Context mContext;
    private SearchInformationClick mClick;

    public void setClick(SearchInformationClick click) {
        mClick = click;
    }

    public SearchInformationAdapter(Context context) {
        mContext = context;
    }

    public void setData(ArrayList<String> data) {
        this.data = data;
    }

    @Override
    public SearchInformationHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        SearchInformationHolder holder = null;
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_search_information,parent,false);
        holder = new SearchInformationHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(SearchInformationHolder holder, final int position) {
        holder.tv.setText(data.get(position));
        holder.tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mClick.getSearchInformation(data.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class SearchInformationHolder extends RecyclerView.ViewHolder{
        private TextView tv;
        public SearchInformationHolder(View itemView) {
            super(itemView);
            tv = (TextView) itemView.findViewById(R.id.tv_item_search_information);
        }
    }
}
