package com.yangshenglong.newstarwardrobe.search;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.yangshenglong.newstarwardrobe.R;
import com.yangshenglong.newstarwardrobe.base.BaseFragment;
import com.yangshenglong.newstarwardrobe.classify.ClassifyGridItemActivityAdapter;
import com.yangshenglong.newstarwardrobe.classify.SearchBean;
import com.yangshenglong.newstarwardrobe.okhttp.NetTool;
import com.yangshenglong.newstarwardrobe.okhttp.onHttpCallback;

import java.util.ArrayList;

import static com.yangshenglong.newstarwardrobe.staticclass.StaticUrl.HAVE_MORE_SEARCH_INFORMATION;
import static com.yangshenglong.newstarwardrobe.staticclass.StaticUrl.NOT_HAVE_MORE_SEARCH_INFORMATION;
import static com.yangshenglong.newstarwardrobe.staticclass.StaticUrl.SEARCH_NEW_URL_LEFT;
import static com.yangshenglong.newstarwardrobe.staticclass.StaticUrl.SEARCH_NEW_URL_RIGHT;
import static com.yangshenglong.newstarwardrobe.staticclass.StaticUrl.SEARCH_PRICE_DOWN_URL_LEFT;
import static com.yangshenglong.newstarwardrobe.staticclass.StaticUrl.SEARCH_PRICE_DOWN_URL_RINGT;
import static com.yangshenglong.newstarwardrobe.staticclass.StaticUrl.SEARCH_PRICE_UP_URL_LEFT;
import static com.yangshenglong.newstarwardrobe.staticclass.StaticUrl.SEARCH_PRICE_UP_URL_RIGHT;
import static com.yangshenglong.newstarwardrobe.staticclass.StaticUrl.SEARCH_SALE_URL_LEFT;
import static com.yangshenglong.newstarwardrobe.staticclass.StaticUrl.SEARCH_SALE_URL_RIGNT;
import static com.yangshenglong.newstarwardrobe.staticclass.StaticUrl.SEARCH_URL_LEFT;
import static com.yangshenglong.newstarwardrobe.staticclass.StaticUrl.SEARCH_URL_RIGHT;

/**
 * Created by CST on 16/12/22.
 */

public class SearchFragment extends BaseFragment implements View.OnClickListener {
    private ImageView ivDefault,ivNew,ivSales,ivPrice,ivPriceUp,ivPriceDown;
    private LinearLayout llPrice;
    private TextView tvDefault,tvNew,tvSales,tvPrice;
    private RecyclerView mRecyclerView;
    private ArrayList<SearchBean> data;
    private String url,str;
    private ClassifyGridItemActivityAdapter mAdapter;
    private int type = 1; //价格排序方式 1代表从低到高排序 2代表从高到低排序

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public int setLayout() {
        return R.layout.fragment_search;
    }

    @Override
    public void initView(View view) {
        ivDefault = (ImageView) view.findViewById(R.id.iv_fragment_item_grid_classify_default);
        ivNew = (ImageView) view.findViewById(R.id.iv_fragment_item_grid_classify_new);
        ivSales = (ImageView) view.findViewById(R.id.iv_fragment_item_grid_classify_sales);
        ivPrice = (ImageView) view.findViewById(R.id.iv_fragment_item_grid_classify_price);
        ivPriceUp = (ImageView) view.findViewById(R.id.iv_fragment_item_grid_classify_price_up);
        ivPriceDown = (ImageView) view.findViewById(R.id.iv_fragment_item_grid_classify_price_down);
        llPrice = (LinearLayout) view.findViewById(R.id.ll_fragment_item_grid_classify_price);
        tvDefault = (TextView) view.findViewById(R.id.tv_fragment_item_grid_classify_default);
        tvNew = (TextView) view.findViewById(R.id.tv_fragment_item_grid_classify_new);
        tvSales = (TextView) view.findViewById(R.id.tv_fragment_item_grid_classify_sales);
        tvPrice = (TextView) view.findViewById(R.id.tv_fragment_item_grid_classify_price);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler_view_fragment_item_grid_classify);
    }

    @Override
    public void initData() {
        tvDefault.setOnClickListener(this);
        tvNew.setOnClickListener(this);
        tvSales.setOnClickListener(this);
        llPrice.setOnClickListener(this);
        tvDefault.setTextColor(Color.rgb(0xce,0x10,0x4f));
        ivDefault.setVisibility(View.VISIBLE);
        url = SEARCH_URL_LEFT+str+SEARCH_URL_RIGHT;
        startOk(url);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tv_fragment_item_grid_classify_default:
                if (ivDefault.getVisibility()!=View.VISIBLE) {
                    url = SEARCH_URL_LEFT + str + SEARCH_URL_RIGHT;
                    startOk(url);
                    tvDefault.setTextColor(Color.rgb(0xce, 0x10, 0x4f));
                    ivDefault.setVisibility(View.VISIBLE);
                    tvNew.setTextColor(Color.rgb(0x6d, 0x6d, 0x6d));
                    ivNew.setVisibility(View.INVISIBLE);
                    tvSales.setTextColor(Color.rgb(0x6d, 0x6d, 0x6d));
                    ivSales.setVisibility(View.INVISIBLE);
                    tvPrice.setTextColor(Color.rgb(0x6d, 0x6d, 0x6d));
                    ivPrice.setVisibility(View.INVISIBLE);
                    ivPriceUp.setImageResource(R.mipmap.ic_sort_up_off);
                    ivPriceDown.setImageResource(R.mipmap.ic_sort_down_off);
                    type=1;
                }
                break;
            case R.id.tv_fragment_item_grid_classify_new:
                if (ivNew.getVisibility()!=View.VISIBLE) {
                    url = SEARCH_NEW_URL_LEFT + str +SEARCH_NEW_URL_RIGHT;
                    startOk(url);
                    tvNew.setTextColor(Color.rgb(0xce, 0x10, 0x4f));
                    ivNew.setVisibility(View.VISIBLE);
                    tvDefault.setTextColor(Color.rgb(0x6d, 0x6d, 0x6d));
                    ivDefault.setVisibility(View.INVISIBLE);
                    tvSales.setTextColor(Color.rgb(0x6d, 0x6d, 0x6d));
                    ivSales.setVisibility(View.INVISIBLE);
                    tvPrice.setTextColor(Color.rgb(0x6d, 0x6d, 0x6d));
                    ivPrice.setVisibility(View.INVISIBLE);
                    ivPriceUp.setImageResource(R.mipmap.ic_sort_up_off);
                    ivPriceDown.setImageResource(R.mipmap.ic_sort_down_off);
                    type=1;
                }
                break;
            case R.id.tv_fragment_item_grid_classify_sales:
                if (ivSales.getVisibility()!=View.VISIBLE) {
                    url = SEARCH_SALE_URL_LEFT+str+SEARCH_SALE_URL_RIGNT;
                    startOk(url);
                    tvSales.setTextColor(Color.rgb(0xce, 0x10, 0x4f));
                    ivSales.setVisibility(View.VISIBLE);
                    tvDefault.setTextColor(Color.rgb(0x6d, 0x6d, 0x6d));
                    ivDefault.setVisibility(View.INVISIBLE);
                    tvNew.setTextColor(Color.rgb(0x6d, 0x6d, 0x6d));
                    ivNew.setVisibility(View.INVISIBLE);
                    tvPrice.setTextColor(Color.rgb(0x6d, 0x6d, 0x6d));
                    ivPrice.setVisibility(View.INVISIBLE);
                    ivPriceUp.setImageResource(R.mipmap.ic_sort_up_off);
                    ivPriceDown.setImageResource(R.mipmap.ic_sort_down_off);
                    type=1;
                }
                break;
            case R.id.ll_fragment_item_grid_classify_price:
                tvPrice.setTextColor(Color.rgb(0xce,0x10,0x4f));
                ivPrice.setVisibility(View.VISIBLE);
                tvDefault.setTextColor(Color.rgb(0x6d,0x6d,0x6d));
                ivDefault.setVisibility(View.INVISIBLE);
                tvNew.setTextColor(Color.rgb(0x6d,0x6d,0x6d));
                ivNew.setVisibility(View.INVISIBLE);
                tvSales.setTextColor(Color.rgb(0x6d,0x6d,0x6d));
                ivSales.setVisibility(View.INVISIBLE);
                if (type == 1){
                    ivPriceUp.setImageResource(R.mipmap.ic_sort_up_on);
                    ivPriceDown.setImageResource(R.mipmap.ic_sort_down_off);
                    url = SEARCH_PRICE_UP_URL_LEFT+str+SEARCH_PRICE_UP_URL_RIGHT;
                    startOk(url);
                    type =2;
                } else if (type == 2){
                    ivPriceUp.setImageResource(R.mipmap.ic_sort_up_off);
                    ivPriceDown.setImageResource(R.mipmap.ic_sort_down_on);
                    url = SEARCH_PRICE_DOWN_URL_LEFT+str+SEARCH_PRICE_DOWN_URL_RINGT;
                    startOk(url);
                    type = 1;
                }
                break;
        }
    }
    private void startOk(String myUrl){
        mAdapter = new ClassifyGridItemActivityAdapter(getActivity());
        data = new ArrayList<>();
        mRecyclerView.destroyDrawingCache();
        NetTool.getInstance().startRequest(myUrl, SearchBean.class, new onHttpCallback<SearchBean>() {
            @Override
            public void onSuccess(SearchBean response) {
                data.add(response);
                mAdapter.setData(data);
                mRecyclerView.setAdapter(mAdapter);
                mRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,1));
                if (data!=null&&data.get(0).getData().getTags()!=null&&data.get(0).getData().getTags().size()>1){
                    Intent intent = new Intent(HAVE_MORE_SEARCH_INFORMATION);
                    ArrayList<String> newData = new ArrayList<>();
                    for (int i = 0; i < data.get(0).getData().getTags().size(); i++) {
                        newData.add(data.get(0).getData().getTags().get(i).getText());
                    }
                    intent.putStringArrayListExtra("data",newData);
                    getActivity().sendBroadcast(intent);

                }else {
                    Intent myIntent = new Intent(NOT_HAVE_MORE_SEARCH_INFORMATION);
                    getActivity().sendBroadcast(myIntent);
                }
            }

            @Override
            public void onError(Throwable e) {

            }
        });

    }
}
