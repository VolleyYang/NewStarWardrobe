package com.yangshenglong.newstarwardrobe.classify;

import android.content.Intent;
import android.view.View;
import android.widget.GridView;
import android.widget.RadioButton;
import android.widget.RelativeLayout;

import com.yangshenglong.newstarwardrobe.R;
import com.yangshenglong.newstarwardrobe.base.BaseFragment;
import com.yangshenglong.newstarwardrobe.okhttp.NetTool;
import com.yangshenglong.newstarwardrobe.okhttp.onHttpCallback;
import com.yangshenglong.newstarwardrobe.search.SearchActivity;

import java.util.ArrayList;

import static com.yangshenglong.newstarwardrobe.staticclass.StaticUrl.CLASSIFY_FRAGMENT_URL;

/**
 * Created by VolleyYang on 16/12/20.
 */

public class ClassifyFragment extends BaseFragment implements View.OnClickListener {
    private GridView mGridView;
    private RadioButton rBtnSkirt, rBtnJacket, rBtnCoat, rBtnPants, rBtnShoe, rBtnPackage, rBtnAccessories, rBtnMakeups, rBtnMen;
    private RelativeLayout rlSearch;
    private ArrayList<ClassifyGridBean> data;
    private ClassifyGridAdapter mAdapter;

    @Override
    public int setLayout() {
        return R.layout.fragment_classify;
    }

    @Override
    public void initView(View view) {
        mGridView = (GridView) view.findViewById(R.id.grid_view_fragment_classify);
        rBtnSkirt = (RadioButton) view.findViewById(R.id.radio_btn_skirt);
        rBtnJacket = (RadioButton) view.findViewById(R.id.radio_btn_jacket);
        rBtnCoat = (RadioButton) view.findViewById(R.id.radio_btn_coat);
        rBtnPants = (RadioButton) view.findViewById(R.id.radio_btn_pants);
        rBtnShoe = (RadioButton) view.findViewById(R.id.radio_btn_shoe);
        rBtnPackage = (RadioButton) view.findViewById(R.id.radio_btn_package);
        rBtnAccessories = (RadioButton) view.findViewById(R.id.radio_btn_accessories);
        rBtnMakeups = (RadioButton) view.findViewById(R.id.radio_btn_makeups);
        rBtnMen = (RadioButton) view.findViewById(R.id.radio_btn_men);
        rlSearch = (RelativeLayout) view.findViewById(R.id.rl_fragment_classify_search);
    }

    @Override
    public void initData() {
        rBtnSkirt.setOnClickListener(this);
        rBtnJacket.setOnClickListener(this);
        rBtnCoat.setOnClickListener(this);
        rBtnPants.setOnClickListener(this);
        rBtnShoe.setOnClickListener(this);
        rBtnPackage.setOnClickListener(this);
        rBtnAccessories.setOnClickListener(this);
        rBtnMakeups.setOnClickListener(this);
        rBtnMen.setOnClickListener(this);
        rlSearch.setOnClickListener(this);
        rBtnSkirt.setChecked(true);
        mGridView.destroyDrawingCache();
        startOk(0);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.radio_btn_skirt:
                startOk(0);
                break;
            case R.id.radio_btn_jacket:
                startOk(1);
                break;
            case R.id.radio_btn_coat:
                startOk(2);
                break;
            case R.id.radio_btn_pants:
                startOk(3);
                break;
            case R.id.radio_btn_shoe:
                startOk(4);
                break;
            case R.id.radio_btn_package:
                startOk(5);
                break;
            case R.id.radio_btn_accessories:
                startOk(6);
                break;
            case R.id.radio_btn_makeups:
                startOk(7);
                break;
            case R.id.radio_btn_men:
                startOk(8);
                break;
            case R.id.rl_fragment_classify_search:
                Intent intent = new Intent(getActivity(), SearchActivity.class);
                getActivity().startActivity(intent);
                break;
        }
    }

    private void startOk(int type) {
        mAdapter = new ClassifyGridAdapter(type, getContext());
        data = new ArrayList<>();
        NetTool.getInstance().startRequest(CLASSIFY_FRAGMENT_URL, ClassifyGridBean.class, new onHttpCallback<ClassifyGridBean>() {
            @Override
            public void onSuccess(ClassifyGridBean response) {
                data.add(response);
                mAdapter.setData(data);
                mGridView.setAdapter(mAdapter);
            }

            @Override
            public void onError(Throwable e) {

            }
        });
    }
}
