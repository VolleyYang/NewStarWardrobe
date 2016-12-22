package com.yangshenglong.newstarwardrobe.search;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by CST on 16/12/22.
 */

public class GuideSearchAdapter extends RecyclerView.Adapter<GuideSearchAdapter.GuideSearchHolder>{
    @Override
    public GuideSearchHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(GuideSearchHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class GuideSearchHolder extends RecyclerView.ViewHolder{

        public GuideSearchHolder(View itemView) {
            super(itemView);
        }
    }
}
