package com.yangshenglong.newstarwardrobe.fashion.levelpage.newest;

import android.support.v7.widget.GridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;

import com.github.jdsjlzx.interfaces.OnRefreshListener;
import com.github.jdsjlzx.recyclerview.LRecyclerView;
import com.github.jdsjlzx.recyclerview.LRecyclerViewAdapter;
import com.yangshenglong.newstarwardrobe.R;
import com.yangshenglong.newstarwardrobe.base.BaseFragment;
import com.yangshenglong.newstarwardrobe.fashion.levelpage.recommend.GlideImageLoader;
import com.yangshenglong.newstarwardrobe.okhttp.NetTool;
import com.yangshenglong.newstarwardrobe.okhttp.onHttpCallback;
import com.yangshenglong.newstarwardrobe.staticclass.StaticUrl;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;

import java.util.ArrayList;

/**
 * Created by VolleyYang on 16/12/20.
 */

public class NewestFragment extends BaseFragment {
    private LRecyclerView  lRecyclerView;
    private LRecyclerViewAdapter lAdapter;
    private NewestRvAdapter rvAdapter;
    private View headView;
    private ArrayList<String> pics = new ArrayList<>();
    private Banner  banner;

    @Override
    public int setLayout() {
        return R.layout.fragment_newest;
    }

    @Override
    public void initView(View view) {

        lRecyclerView = (LRecyclerView) view.findViewById(R.id.newest_rv);

        //头布局
        headView = LayoutInflater.from(getContext()).inflate(R.layout.item_newest_head,null);


        banner = (Banner) headView.findViewById(R.id.newest_banner);

    }

    @Override
    public void initData() {

        //初始化适配器
        rvAdapter = new NewestRvAdapter(getContext());
        lAdapter = new LRecyclerViewAdapter(rvAdapter);
        //添加头布局
        lAdapter.addHeaderView(headView);

        GridLayoutManager manager = new GridLayoutManager(getContext(),2);
        lRecyclerView.setLayoutManager(manager);

        //网络解析
        getInternet();

        //Banner解析
        bannerInternet();

        //下拉刷新
        lRecyclerView.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh() {
                lRecyclerView.refreshComplete();
                lAdapter.notifyDataSetChanged();
            }
        });
    }

    private void bannerInternet() {
        NetTool.getInstance().startRequest(StaticUrl.NEWESTBANNER, NewBannerBean.class, new onHttpCallback<NewBannerBean>() {
            @Override
            public void onSuccess(NewBannerBean response) {
                for (int i = 0; i < response.getData().getBanners().size(); i++) {
                    pics.add(response.getData().getBanners().get(i).getImage_url());
                }
                bannerImg();
            }

            @Override
            public void onError(Throwable e) {

            }
        });
    }

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


    private void getInternet() {
        NetTool.getInstance().startRequest(StaticUrl.NEWEST, NewestBean.class, new onHttpCallback<NewestBean>() {
            @Override
            public void onSuccess(NewestBean response) {
                rvAdapter.setData(response);
                lRecyclerView.setAdapter(lAdapter);

            }

            @Override
            public void onError(Throwable e) {

            }
        });
    }
}
