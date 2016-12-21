package com.yangshenglong.newstarwardrobe.classify;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.yangshenglong.newstarwardrobe.R;
import com.yangshenglong.newstarwardrobe.base.BaseActivity;
import com.yangshenglong.newstarwardrobe.okhttp.NetTool;
import com.yangshenglong.newstarwardrobe.okhttp.onHttpCallback;

import java.util.ArrayList;

import static com.yangshenglong.newstarwardrobe.staticclass.StaticUrl.SEARCH_NEW_URL_LEFT;
import static com.yangshenglong.newstarwardrobe.staticclass.StaticUrl.SEARCH_NEW_URL_RIGHT;
import static com.yangshenglong.newstarwardrobe.staticclass.StaticUrl.SEARCH_SALE_URL_LEFT;
import static com.yangshenglong.newstarwardrobe.staticclass.StaticUrl.SEARCH_SALE_URL_RIGNT;
import static com.yangshenglong.newstarwardrobe.staticclass.StaticUrl.SEARCH_URL_LEFT;
import static com.yangshenglong.newstarwardrobe.staticclass.StaticUrl.SEARCH_URL_RIGHT;

/**
 * Created by CST on 16/12/20.
 */

public class ClassifyGridItemActivity extends BaseActivity implements View.OnClickListener {
    private ImageView ivBack,ivDefault,ivNew,ivSales,ivPrice,ivPriceUp,ivPriceDown;
    private LinearLayout llPrice;
    private TextView tvTitle,tvDefault,tvNew,tvSales,tvPrice;
    private RecyclerView mRecyclerView;
    private ArrayList<SearchBean>data;
    private String url ;
    private ClassifyGridItemActivityAdapter mAdapter;

    @Override
    public int setLayout() {
        return R.layout.activity_item_grid_classify;
    }

    @Override
    public void initView() {
        ivBack = (ImageView) findViewById(R.id.iv_activity_item_grid_classify_colse);
        ivDefault = (ImageView) findViewById(R.id.iv_activity_item_grid_classify_default);
        ivNew = (ImageView) findViewById(R.id.iv_activity_item_grid_classify_new);
        ivSales = (ImageView) findViewById(R.id.iv_activity_item_grid_classify_sales);
        ivPrice = (ImageView) findViewById(R.id.iv_activity_item_grid_classify_price);
        ivPriceUp = (ImageView) findViewById(R.id.iv_activity_item_grid_classify_price_up);
        ivPriceDown = (ImageView) findViewById(R.id.iv_activity_item_grid_classify_price_down);
        llPrice = (LinearLayout) findViewById(R.id.ll_activity_item_grid_classify_price);
        tvTitle = (TextView) findViewById(R.id.tv_activity_item_grid_classify_title);
        tvDefault = (TextView) findViewById(R.id.tv_activity_item_grid_classify_default);
        tvNew = (TextView) findViewById(R.id.tv_activity_item_grid_classify_new);
        tvSales = (TextView) findViewById(R.id.tv_activity_item_grid_classify_sales);
        tvPrice = (TextView) findViewById(R.id.tv_activity_item_grid_classify_price);
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view_activity_item_grid_classify);
    }

    

    @Override
    public void initData() {
        tvTitle.setText(getIntent().getStringExtra("key"));
        url = SEARCH_URL_LEFT+getIntent().getStringExtra("url")+SEARCH_URL_RIGHT;

        Log.d("ClassifyGridItemActivit", url);
        ivBack.setOnClickListener(this);
        tvDefault.setOnClickListener(this);
        tvNew.setOnClickListener(this);
        tvSales.setOnClickListener(this);
        llPrice.setOnClickListener(this);
        tvDefault.setTextColor(Color.rgb(0xce,0x10,0x4f));
        ivDefault.setVisibility(View.VISIBLE);
        startOk(url);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.iv_activity_item_grid_classify_colse:
                finish();
            break;
            case R.id.tv_activity_item_grid_classify_default:
                if (ivDefault.getVisibility()!=View.VISIBLE) {
                    url = SEARCH_URL_LEFT + getIntent().getStringExtra("url") + SEARCH_URL_RIGHT;
                    startOk(url);
                    tvDefault.setTextColor(Color.rgb(0xce, 0x10, 0x4f));
                    ivDefault.setVisibility(View.VISIBLE);
                    tvNew.setTextColor(Color.rgb(0x6d, 0x6d, 0x6d));
                    ivNew.setVisibility(View.INVISIBLE);
                    tvSales.setTextColor(Color.rgb(0x6d, 0x6d, 0x6d));
                    ivSales.setVisibility(View.INVISIBLE);
                    tvPrice.setTextColor(Color.rgb(0x6d, 0x6d, 0x6d));
                    ivPrice.setVisibility(View.INVISIBLE);
                }
            break;
            case R.id.tv_activity_item_grid_classify_new:
                if (ivNew.getVisibility()!=View.VISIBLE) {
                    url = SEARCH_NEW_URL_LEFT + getIntent().getStringExtra("url") +SEARCH_NEW_URL_RIGHT;
                    startOk(url);
                    tvNew.setTextColor(Color.rgb(0xce, 0x10, 0x4f));
                    ivNew.setVisibility(View.VISIBLE);
                    tvDefault.setTextColor(Color.rgb(0x6d, 0x6d, 0x6d));
                    ivDefault.setVisibility(View.INVISIBLE);
                    tvSales.setTextColor(Color.rgb(0x6d, 0x6d, 0x6d));
                    ivSales.setVisibility(View.INVISIBLE);
                    tvPrice.setTextColor(Color.rgb(0x6d, 0x6d, 0x6d));
                    ivPrice.setVisibility(View.INVISIBLE);
                }
            break;
            case R.id.tv_activity_item_grid_classify_sales:
                if (ivSales.getVisibility()!=View.VISIBLE) {
                    url = SEARCH_SALE_URL_LEFT+getIntent().getStringExtra("url")+SEARCH_SALE_URL_RIGNT;
                    startOk(url);
                    tvSales.setTextColor(Color.rgb(0xce, 0x10, 0x4f));
                    ivSales.setVisibility(View.VISIBLE);
                    tvDefault.setTextColor(Color.rgb(0x6d, 0x6d, 0x6d));
                    ivDefault.setVisibility(View.INVISIBLE);
                    tvNew.setTextColor(Color.rgb(0x6d, 0x6d, 0x6d));
                    ivNew.setVisibility(View.INVISIBLE);
                    tvPrice.setTextColor(Color.rgb(0x6d, 0x6d, 0x6d));
                    ivPrice.setVisibility(View.INVISIBLE);
                }
            break;
            case R.id.ll_activity_item_grid_classify_price:
                tvPrice.setTextColor(Color.rgb(0xce,0x10,0x4f));
                ivPrice.setVisibility(View.VISIBLE);
                tvDefault.setTextColor(Color.rgb(0x6d,0x6d,0x6d));
                ivDefault.setVisibility(View.INVISIBLE);
                tvNew.setTextColor(Color.rgb(0x6d,0x6d,0x6d));
                ivNew.setVisibility(View.INVISIBLE);
                tvSales.setTextColor(Color.rgb(0x6d,0x6d,0x6d));
                ivSales.setVisibility(View.INVISIBLE);
            break;
        }
    }
    private void startOk(String myUrl){
        mAdapter = new ClassifyGridItemActivityAdapter(this);
        data = new ArrayList<>();
        mRecyclerView.destroyDrawingCache();
        NetTool.getInstance().startRequest(myUrl, SearchBean.class, new onHttpCallback<SearchBean>() {
            @Override
            public void onSuccess(SearchBean response) {
                data.add(response);
                mAdapter.setData(data);
                mRecyclerView.setAdapter(mAdapter);
                mRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,1));
            }

            @Override
            public void onError(Throwable e) {

            }
        });

    }
}
