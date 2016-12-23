package com.yangshenglong.newstarwardrobe.search;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.yangshenglong.newstarwardrobe.R;
import com.yangshenglong.newstarwardrobe.base.BaseActivity;
import com.yangshenglong.newstarwardrobe.okhttp.NetTool;
import com.yangshenglong.newstarwardrobe.okhttp.onHttpCallback;

import java.util.ArrayList;

import static com.yangshenglong.newstarwardrobe.staticclass.StaticUrl.GUIDE_SEARCH_URL_LEFT;
import static com.yangshenglong.newstarwardrobe.staticclass.StaticUrl.GUIDE_SEARCH_URL_RIGHT;
import static com.yangshenglong.newstarwardrobe.staticclass.StaticUrl.HEAT_SEARCH_URL;
import static com.yangshenglong.newstarwardrobe.staticclass.StaticUrl.toUtf8;

public class SearchActivity extends BaseActivity implements View.OnClickListener {
    private ImageView ivClose, ivCommodity, ivPosts, ivRed, ivClear, ivSearch;
    private LinearLayout llCommodity, llPosts, llRed,llDefault;
    private TextView tvCommodity, tvPosts, tvRed;
    private GridView mGridView;
    private RecyclerView rvHistory,rvSearch;
    private EditText et;
    private ArrayList<HeatSearchBean> data;
    private int type = 1;  // 搜索类型 1代表商品 2代表帖子 3代表红人;
    private GuideSearchAdapter mGuideSearchAdapter;
    private ArrayList<GuideSearchBean> guideData;

    @Override
    public int setLayout() {
        return R.layout.activity_search;
    }

    @Override
    public void initView() {
        ivSearch = (ImageView) findViewById(R.id.iv_activity_search_search);
        ivClose = (ImageView) findViewById(R.id.iv_activity_search_close);
        ivCommodity = (ImageView) findViewById(R.id.iv_activity_search_commodity);
        ivPosts = (ImageView) findViewById(R.id.iv_activity_search_posts);
        ivRed = (ImageView) findViewById(R.id.iv_activity_search_red);
        ivClear = (ImageView) findViewById(R.id.iv_activity_search_clear);
        llCommodity = (LinearLayout) findViewById(R.id.ll_activity_search_commodity);
        llPosts = (LinearLayout) findViewById(R.id.ll_activity_search_posts);
        llRed = (LinearLayout) findViewById(R.id.ll_activity_search_red);
        llDefault = (LinearLayout) findViewById(R.id.ll_activity_search_default);
        tvCommodity = (TextView) findViewById(R.id.tv_activity_search_commodity);
        tvPosts = (TextView) findViewById(R.id.tv_activity_search_posts);
        tvRed = (TextView) findViewById(R.id.tv_activity_search_red);
        mGridView = (GridView) findViewById(R.id.grid_view_search_activity);
        rvHistory = (RecyclerView) findViewById(R.id.recycler_view_search_activity_history);
        rvSearch = (RecyclerView) findViewById(R.id.recycler_view_search_activity_search);
        et = (EditText) findViewById(R.id.et_activity_search);
    }

    @Override
    public void initData() {
        ivSearch.setOnClickListener(this);
        ivClose.setOnClickListener(this);
        llCommodity.setOnClickListener(this);
        llPosts.setOnClickListener(this);
        llRed.setOnClickListener(this);
        ivClear.setOnClickListener(this);
        tvCommodity.setTextColor(Color.rgb(0xce, 0x10, 0x4f));
        ivCommodity.setVisibility(View.VISIBLE);
        tvPosts.setTextColor(Color.rgb(0x6d, 0x6d, 0x6d));
        ivPosts.setVisibility(View.INVISIBLE);
        tvRed.setTextColor(Color.rgb(0x6d, 0x6d, 0x6d));
        ivRed.setVisibility(View.INVISIBLE);
        type = 1;
        data = new ArrayList<>();
        NetTool.getInstance().startRequest(HEAT_SEARCH_URL, HeatSearchBean.class, new onHttpCallback<HeatSearchBean>() {
            @Override
            public void onSuccess(HeatSearchBean response) {
                data.add(response);
                HeatSearchAdapter adapter = new HeatSearchAdapter(SearchActivity.this);
                adapter.setData(data);
                mGridView.setAdapter(adapter);
            }

            @Override
            public void onError(Throwable e) {

            }
        });
//        mGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Log.d("1122", "11111");
//                switch (type){
//                    case 1:
//                        Log.d("1122", "22222");
//                        String str = data.get(0).getData().getItems().get(position).getText();
//                        Intent intent = new Intent(SearchActivity.this, SearchInformationActivity.class);
//                        intent.putExtra("url",toUtf8(str));
//                        intent.putExtra("key",str);
//                        startActivity(intent);
//                        break;
//                    case 2:
//                        break;
//                    case 3:
//                        break;
//                }
//
//            }
//        });
        et.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (et.getText()!=null){
                    llDefault.setVisibility(View.INVISIBLE);
                    rvSearch.setVisibility(View.VISIBLE);
                    rvSearch.destroyDrawingCache();
                    switch (type){
                        case 1:
                            String url = GUIDE_SEARCH_URL_LEFT+toUtf8(et.getText().toString())+GUIDE_SEARCH_URL_RIGHT;
                            startOk(url);
                            break;
                        case 2:
                            String url2 = GUIDE_SEARCH_URL_LEFT+toUtf8(et.getText().toString())+GUIDE_SEARCH_URL_RIGHT;
                            startOk(url2);
                            break;
                        case 3:
                            break;
                    }

                }
                if (et.getText().length()<1){
                    llDefault.setVisibility(View.VISIBLE);
                    rvSearch.setVisibility(View.INVISIBLE);
                    rvSearch.destroyDrawingCache();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_activity_search_close:
                finish();
                break;
            case R.id.iv_activity_search_search:
                switch (type){
                    case 1:
                        String str = et.getText().toString();
                        Intent intent = new Intent(SearchActivity.this, SearchInformationActivity.class);
                        intent.putExtra("url",toUtf8(str));
                        intent.putExtra("key",str);
                        startActivity(intent);
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                }
                break;
            case R.id.ll_activity_search_commodity:
                if (ivCommodity.getVisibility() != View.VISIBLE) {
                    tvCommodity.setTextColor(Color.rgb(0xce, 0x10, 0x4f));
                    ivCommodity.setVisibility(View.VISIBLE);
                    tvPosts.setTextColor(Color.rgb(0x6d, 0x6d, 0x6d));
                    ivPosts.setVisibility(View.INVISIBLE);
                    tvRed.setTextColor(Color.rgb(0x6d, 0x6d, 0x6d));
                    ivRed.setVisibility(View.INVISIBLE);
                    type = 1;
                }
                break;
            case R.id.ll_activity_search_posts:
                if (ivPosts.getVisibility() != View.VISIBLE) {
                    tvPosts.setTextColor(Color.rgb(0xce, 0x10, 0x4f));
                    ivPosts.setVisibility(View.VISIBLE);
                    tvCommodity.setTextColor(Color.rgb(0x6d, 0x6d, 0x6d));
                    ivCommodity.setVisibility(View.INVISIBLE);
                    tvRed.setTextColor(Color.rgb(0x6d, 0x6d, 0x6d));
                    ivRed.setVisibility(View.INVISIBLE);
                    type = 2;
                }
                break;
            case R.id.ll_activity_search_red:
                if (ivRed.getVisibility() != View.VISIBLE) {
                    tvRed.setTextColor(Color.rgb(0xce, 0x10, 0x4f));
                    ivRed.setVisibility(View.VISIBLE);
                    tvCommodity.setTextColor(Color.rgb(0x6d, 0x6d, 0x6d));
                    ivCommodity.setVisibility(View.INVISIBLE);
                    tvPosts.setTextColor(Color.rgb(0x6d, 0x6d, 0x6d));
                    ivPosts.setVisibility(View.INVISIBLE);
                    type = 3;
                }
                break;
            case R.id.iv_activity_search_clear:
                break;
        }
    }
    private void startOk(String url){
        guideData = new ArrayList<>();
        NetTool.getInstance().startRequest(url, GuideSearchBean.class, new onHttpCallback<GuideSearchBean>() {
            @Override
            public void onSuccess(GuideSearchBean response) {
                guideData.add(response);
                mGuideSearchAdapter = new GuideSearchAdapter(SearchActivity.this);
                mGuideSearchAdapter.setData(guideData);
                rvSearch.setAdapter(mGuideSearchAdapter);
                rvSearch.setLayoutManager(new LinearLayoutManager(SearchActivity.this));
            }

            @Override
            public void onError(Throwable e) {

            }
        });
    }
}
