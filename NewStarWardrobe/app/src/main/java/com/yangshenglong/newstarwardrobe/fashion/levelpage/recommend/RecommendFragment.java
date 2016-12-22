package com.yangshenglong.newstarwardrobe.fashion.levelpage.recommend;

import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.github.jdsjlzx.interfaces.OnRefreshListener;
import com.github.jdsjlzx.progressindicator.indicator.PacmanIndicator;
import com.github.jdsjlzx.recyclerview.LRecyclerView;
import com.github.jdsjlzx.recyclerview.LRecyclerViewAdapter;
import com.yangshenglong.newstarwardrobe.R;
import com.yangshenglong.newstarwardrobe.base.BaseFragment;
import com.yangshenglong.newstarwardrobe.fashion.secondpage.recommend.BannerPageAty;
import com.yangshenglong.newstarwardrobe.fashion.secondpage.recommend.GvPageAty;
import com.yangshenglong.newstarwardrobe.okhttp.NetTool;
import com.yangshenglong.newstarwardrobe.okhttp.onHttpCallback;
import com.yangshenglong.newstarwardrobe.staticclass.StaticUrl;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;
import com.youth.banner.listener.OnBannerClickListener;

import java.util.ArrayList;

/**
 * Created by VolleyYang on 16/12/20.
 */

public class RecommendFragment extends BaseFragment implements OnBannerClickListener, AdapterView.OnItemClickListener {

    private LRecyclerView  lRecyclerView;
    private LRecyclerViewAdapter  lRecyclerViewAdapter;
    private RecommendRvAdapter rvAdapter;
    //头布局
    private Banner  banner;
    private GridView  gridView;

    private ArrayList<String> pics= new ArrayList<>();
    private View headView;
    private RecommendGvAdapter gvAdapter;

    private RecommendBannerBean  data;

    private RecommendGvBean gvData;
    private Intent intent;

    private String gvId;

    @Override
    public int setLayout() {
        return R.layout.fragment_recommend;
    }

    @Override
    public void initView(View view) {
        lRecyclerView = (LRecyclerView) view.findViewById(R.id.recommend_rv);
        //头布局item
        headView = LayoutInflater.from(getContext()).inflate(R.layout.item_commend_head,null);

        banner = (Banner) headView.findViewById(R.id.commend_banner);

        gridView = (GridView) headView.findViewById(R.id.commend_gv);



    }

    @Override
    public void initData() {


        rvAdapter = new RecommendRvAdapter(getContext());
        lRecyclerViewAdapter = new LRecyclerViewAdapter(rvAdapter);
        //头布局
        lRecyclerViewAdapter.addHeaderView(headView);

        LinearLayoutManager manager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        lRecyclerView.setLayoutManager(manager);


        //RecyclerView网络解析
        getInternet();

        //轮播图网络解析
        bannerInternet();

        //GridView网络解析
        gridViewInternet();

        //轮播图点击事件
        banner.setOnBannerClickListener(this);

        gridView.setOnItemClickListener(this);

    }

    //GridView网络解析
    private void gridViewInternet() {
        NetTool.getInstance().startRequest(StaticUrl.RECOMMENDGV, RecommendGvBean.class, new onHttpCallback<RecommendGvBean>() {
            @Override
            public void onSuccess(RecommendGvBean response) {
                gvData = response;

                gvAdapter = new RecommendGvAdapter(getContext());
                gvAdapter.setData(response);
                gridView.setAdapter(gvAdapter);
            }

            @Override
            public void onError(Throwable e) {

            }
        });
    }

    //轮播图网络解析
    private void bannerInternet() {

        NetTool.getInstance().startRequest(StaticUrl.RECOMMENDBANNER, RecommendBannerBean.class, new onHttpCallback<RecommendBannerBean>() {
            @Override
            public void onSuccess(RecommendBannerBean response) {

                data = response;
                for (int i = 0; i < response.getData().getItems().size(); i++) {

                    pics.add(response.getData().getItems().get(i).getComponent().getPicUrl());
                }
                bannerImg();
            }

            @Override
            public void onError(Throwable e) {

            }
        });
    }


    //轮播图
    private void bannerImg() {


        banner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR_TITLE);

        banner.setImageLoader(new GlideImageLoader());

        banner.setImages(pics);

        banner.setBannerAnimation(Transformer.DepthPage);

        banner.isAutoPlay(true);

        banner.setDelayTime(2000);

        banner.setIndicatorGravity(BannerConfig.CENTER);

        banner.start();
    }

    //RecyclerView网络解析
    private void getInternet() {
        NetTool.getInstance().startRequest(StaticUrl.RECOMMEND, RecommendBean.class, new onHttpCallback<RecommendBean>() {
            @Override
            public void onSuccess(RecommendBean response) {

                rvAdapter.setData(response);
                lRecyclerView.setAdapter(lRecyclerViewAdapter);

                //下拉刷新
                lRecyclerView.setOnRefreshListener(new OnRefreshListener() {
                    @Override
                    public void onRefresh() {
                        lRecyclerView.refreshComplete();
                        lRecyclerViewAdapter.notifyDataSetChanged();
                    }
                });
            }

            @Override
            public void onError(Throwable e) {

                Log.d("RecommendFragment", e.getMessage());
            }
        });
    }

    //轮播图点击事件
    @Override
    public void OnBannerClick(int position) {
        String webId = data.getData().getItems().get(position).getComponent().getAction().getId();
        intent = new Intent(getContext(), BannerPageAty.class);
        intent.putExtra("webId",webId);
        startActivity(intent);
    }

    //GridView点击事件
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        gvId = gvData.getResponse().getData().getItems().get(position).getComponent().getAction().getId();
        intent = new Intent(getContext(), GvPageAty.class);
        intent.putExtra("gvId",gvId);
        startActivity(intent);
    }
}
