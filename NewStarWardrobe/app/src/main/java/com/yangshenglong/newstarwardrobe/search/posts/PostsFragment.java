package com.yangshenglong.newstarwardrobe.search.posts;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;

import com.yangshenglong.newstarwardrobe.R;
import com.yangshenglong.newstarwardrobe.base.BaseFragment;
import com.yangshenglong.newstarwardrobe.okhttp.NetTool;
import com.yangshenglong.newstarwardrobe.okhttp.onHttpCallback;

import java.util.ArrayList;

import static com.yangshenglong.newstarwardrobe.staticclass.StaticUrl.HAVE_MORE_SEARCH_INFORMATION;
import static com.yangshenglong.newstarwardrobe.staticclass.StaticUrl.NOT_HAVE_MORE_SEARCH_INFORMATION;
import static com.yangshenglong.newstarwardrobe.staticclass.StaticUrl.POSTS_SEARCH_URL_LEFT;
import static com.yangshenglong.newstarwardrobe.staticclass.StaticUrl.POSTS_SEARCH_URL_RIGHT;

/**
 * Created by CST on 16/12/23.
 */

public class PostsFragment extends BaseFragment {
    private ArrayList<PostsSearchBean> data;
    private RecyclerView mRecyclerView;
    private String url,str;
    private PostsSearchAdapter mAdapter;

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public int setLayout() {
        return R.layout.fragment_posts;
    }

    @Override
    public void initView(View view) {
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler_view_fragment_posts);
    }

    @Override
    public void initData() {
        url = POSTS_SEARCH_URL_LEFT+str+POSTS_SEARCH_URL_RIGHT;
        data = new ArrayList<>();
        mAdapter = new PostsSearchAdapter(getActivity());
        NetTool.getInstance().startRequest(url, PostsSearchBean.class, new onHttpCallback<PostsSearchBean>() {
            @Override
            public void onSuccess(PostsSearchBean response) {
                data.add(response);
                mAdapter.setData(data);
                mRecyclerView.setAdapter(mAdapter);
                mRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,1));
                if (data.get(0).getData().getTags()!=null&&data.get(0).getData().getTags().size()>1){
                    Intent intent = new Intent(HAVE_MORE_SEARCH_INFORMATION);
                    ArrayList<String> newData = new ArrayList<>();
                    for (int i = 0; i < data.get(0).getData().getTags().size(); i++) {
                        newData.add(data.get(0).getData().getTags().get(i).getText());
                    }
                    intent.putStringArrayListExtra("data",newData);
                    getActivity().sendBroadcast(intent);

                }else {
                    Intent intent = new Intent(NOT_HAVE_MORE_SEARCH_INFORMATION);
                    getActivity().sendBroadcast(intent);
                }
            }

            @Override
            public void onError(Throwable e) {

            }
        });
    }
}
