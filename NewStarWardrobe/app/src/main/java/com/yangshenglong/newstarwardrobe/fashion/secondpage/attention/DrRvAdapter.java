package com.yangshenglong.newstarwardrobe.fashion.secondpage.attention;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.yangshenglong.newstarwardrobe.R;

/**
 * Created by VolleyYang on 16/12/22.
 */

public class DrRvAdapter extends RecyclerView.Adapter<DrRvAdapter.DrViewHolder> {
    private Context  context;
    private DrBean  data;
    private DrBean.DataBean.ItemsBean.ComponentBeanX getData;

    public DrRvAdapter(Context context) {
        this.context = context;
    }

    public void setData(DrBean data) {
        this.data = data;
    }

    @Override
    public DrViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_second_dr,parent,false);
        DrViewHolder holder = new DrViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(DrViewHolder holder, int position) {
        getData = data.getData().getItems().get(position).getComponent();
        Glide.with(context).load(getData.getUserAvatar()).into(holder.ivAuthor);
        holder.tvAuthor.setText(getData.getUserName());
        holder.tvTypeName.setText(getData.getUserTypeName());
        if (getData.getPics().size()>2){
            Glide.with(context).load(getData.getPics().get(0).getComponent().getPicUrl()).into(holder.ivOne);
            Glide.with(context).load(getData.getPics().get(1).getComponent().getPicUrl()).into(holder.ivTwo);
            Glide.with(context).load(getData.getPics().get(2).getComponent().getPicUrl()).into(holder.ivThree);
        }else if (getData.getPics().size()<=2){
            Glide.with(context).load(getData.getPics().get(0).getComponent().getPicUrl()).into(holder.ivOne);
            Glide.with(context).load(getData.getPics().get(1).getComponent().getPicUrl()).into(holder.ivTwo);
        }
    }

    @Override
    public int getItemCount() {
        return data!= null ? data.getData().getItems().size() : 0;
    }

    class DrViewHolder extends RecyclerView.ViewHolder{
        private ImageView ivAuthor,ivOne,ivTwo,ivThree;
        private TextView tvAuthor,tvTypeName;
        public DrViewHolder(View itemView) {
            super(itemView);
            ivAuthor = (ImageView) itemView.findViewById(R.id.dr_iv_author);
            ivOne = (ImageView) itemView.findViewById(R.id.dr_pic_one);
            ivTwo = (ImageView) itemView.findViewById(R.id.dr_pic_two);
            ivThree = (ImageView) itemView.findViewById(R.id.dr_pic_three);
            tvAuthor = (TextView) itemView.findViewById(R.id.dr_tv_author);
            tvTypeName = (TextView) itemView.findViewById(R.id.dr_tv_typeName);
        }
    }
}
