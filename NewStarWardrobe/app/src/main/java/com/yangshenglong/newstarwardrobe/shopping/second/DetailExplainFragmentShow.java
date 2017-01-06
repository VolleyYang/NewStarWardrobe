package com.yangshenglong.newstarwardrobe.shopping.second;

import android.view.View;
import android.webkit.WebView;

import com.yangshenglong.newstarwardrobe.R;
import com.yangshenglong.newstarwardrobe.base.BaseFragment;

/**
 * Created by xiaoBu on 2016/12/25.
 */

public class DetailExplainFragmentShow extends BaseFragment {

    private WebView mWebView;

    @Override
    public int setLayout() {
        return R.layout.fragment_xiaobu_second_detail_explain_show;
    }

    @Override
    public void initView(View view) {

        mWebView = (WebView) view.findViewById(R.id.web_xiaobu_second_detail_explain_show);
    }

    @Override
    public void initData() {

        mWebView.loadUrl("http://m.hichao.com/lib/interface.php?m=goodsdetail&sid=2611988");
    }
}
