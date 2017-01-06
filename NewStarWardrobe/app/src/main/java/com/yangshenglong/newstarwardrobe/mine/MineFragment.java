package com.yangshenglong.newstarwardrobe.mine;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.yangshenglong.newstarwardrobe.R;
import com.yangshenglong.newstarwardrobe.base.BaseFragment;
import com.yangshenglong.newstarwardrobe.database.DBTool;
import com.yangshenglong.newstarwardrobe.database.LoginData;
import com.yangshenglong.newstarwardrobe.mine.login.LoginActivity;
import com.yangshenglong.newstarwardrobe.mine.login.RegisteredActivity;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.ArrayList;

/**
 * Created by VolleyYang on 16/12/20.
 */

public class MineFragment extends BaseFragment implements View.OnClickListener {
    private TextView tvTitle, tvVip, tvLogin, tvRegister, tvAttention, tvFans, tvCollection;
    private ImageView ivShop, ivTitle;
    private LinearLayout llAttention, llFans, llCollection, llGiveMoney, llSendGoods, llReceiveGoods, llEvauation, llReturnGoods, llVip, llCoupon, llRed;
    private RelativeLayout rlOrders, rlAddress, rlPosts, rlBrand, rlLabel, rlSetting, rlHelp, rlPhone, rlInformation;
    private Intent mIntent;
    private boolean isLogin;
    private SharedPreferences sp;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        EventBus.getDefault().register(this);
    }

    @Override
    public int setLayout() {
        return R.layout.fragment_mine;
    }

    @Override
    public void initView(View view) {
        // 用户名
        tvTitle = (TextView) view.findViewById(R.id.tv_fragment_mine_title);
        // 购物车
        ivShop = (ImageView) view.findViewById(R.id.iv_fragment_mine_shop);
        // 个人信息
        rlInformation = (RelativeLayout) view.findViewById(R.id.rl_fragment_mine_my_information);
        // 头像
        ivTitle = (ImageView) view.findViewById(R.id.iv_fragment_mine_title);
        tvVip = (TextView) view.findViewById(R.id.tv_fragment_mine_vip);
        // 登录
        tvLogin = (TextView) view.findViewById(R.id.tv_fragment_mine_login);
        // 注册
        tvRegister = (TextView) view.findViewById(R.id.tv_fragment_mine_registered);
        // 关注的人
        llAttention = (LinearLayout) view.findViewById(R.id.ll_fragment_mine_my_attention);
        tvAttention = (TextView) view.findViewById(R.id.tv_fragment_mine_my_attention);
        // 我的粉丝
        llFans = (LinearLayout) view.findViewById(R.id.ll_fragment_mine_my_fans);
        tvFans = (TextView) view.findViewById(R.id.tv_fragment_mine_my_fans);
        // 我的收藏
        llCollection = (LinearLayout) view.findViewById(R.id.ll_fragment_mine_my_collection);
        tvCollection = (TextView) view.findViewById(R.id.tv_fragment_mine_my_collection);
        // 我的订单
        rlOrders = (RelativeLayout) view.findViewById(R.id.rl_fragment_mine_my_orders);
        // 待付款
        llGiveMoney = (LinearLayout) view.findViewById(R.id.ll_fragment_mine_will_give_money);
        // 待发货
        llSendGoods = (LinearLayout) view.findViewById(R.id.ll_fragment_mine_will_send_goods);
        // 待收货
        llReceiveGoods = (LinearLayout) view.findViewById(R.id.ll_fragment_mine_will_receive_goods);
        // 待评价
        llEvauation = (LinearLayout) view.findViewById(R.id.ll_fragment_mine_wait_evaluation);
        // 退款/退货
        llReturnGoods = (LinearLayout) view.findViewById(R.id.ll_fragment_mine_will_return_goods);
        // 会员专享
        llVip = (LinearLayout) view.findViewById(R.id.ll_fragment_mine_my_vip);
        // 优惠券
        llCoupon = (LinearLayout) view.findViewById(R.id.ll_fragment_mine_my_coupon);
        // 我的红包
        llRed = (LinearLayout) view.findViewById(R.id.ll_fragment_mine_my_red);
        // 我的收货地址
        rlAddress = (RelativeLayout) view.findViewById(R.id.rl_fragment_mine_my_address);
        // 我的发帖
        rlPosts = (RelativeLayout) view.findViewById(R.id.rl_fragment_mine_my_posts);
        // 我关注的品牌
        rlBrand = (RelativeLayout) view.findViewById(R.id.rl_fragment_mine_my_like_brand);
        // 我关注的标签
        rlLabel = (RelativeLayout) view.findViewById(R.id.rl_fragment_mine_my_label);
        // 设置
        rlSetting = (RelativeLayout) view.findViewById(R.id.rl_fragment_mine_my_setting);
        // 帮助与反馈
        rlHelp = (RelativeLayout) view.findViewById(R.id.rl_fragment_mine_my_help);
        // 客服电话
        rlPhone = (RelativeLayout) view.findViewById(R.id.rl_fragment_mine_my_phone_num);
    }

    @Override
    public void initData() {
        ivShop.setOnClickListener(this);
        rlInformation.setOnClickListener(this);
        tvLogin.setOnClickListener(this);
        tvRegister.setOnClickListener(this);
        llAttention.setOnClickListener(this);
        llFans.setOnClickListener(this);
        llCollection.setOnClickListener(this);
        rlOrders.setOnClickListener(this);
        llGiveMoney.setOnClickListener(this);
        llSendGoods.setOnClickListener(this);
        llReceiveGoods.setOnClickListener(this);
        llEvauation.setOnClickListener(this);
        llReturnGoods.setOnClickListener(this);
        llVip.setOnClickListener(this);
        llCoupon.setOnClickListener(this);
        llRed.setOnClickListener(this);

        rlAddress.setOnClickListener(this);
        rlPosts.setOnClickListener(this);
        rlBrand.setOnClickListener(this);
        rlLabel.setOnClickListener(this);
        rlSetting.setOnClickListener(this);
        rlHelp.setOnClickListener(this);
        rlPhone.setOnClickListener(this);
        sp = getActivity().getSharedPreferences("login", Context.MODE_PRIVATE);
        isLogin = sp.getBoolean("isLogin", false);
        tvTitle.setText(sp.getString("title", "我的"));

        if (isLogin) {
            tvLogin.setVisibility(View.GONE);
            tvRegister.setVisibility(View.GONE);
            tvAttention.setVisibility(View.VISIBLE);
            tvFans.setVisibility(View.VISIBLE);
            tvCollection.setVisibility(View.VISIBLE);
            ArrayList<LoginData> loginDatas = DBTool.getInstance().query(LoginData.class, "accountNum", tvTitle.getText().toString());
            if (loginDatas != null && loginDatas.size() > 0 && loginDatas.get(0).getAttentionName() != null && loginDatas.get(0).getFansName() != null && loginDatas.get(0).getPerson() != null && loginDatas.get(0).getPosts() != null) {
                if (loginDatas.get(0).getAttentionName().size() > 0) {
                    tvAttention.setText(loginDatas.get(0).getAttentionName().size());
                } else {
                    tvAttention.setText(0);
                }
                if (loginDatas.get(0).getFansName().size() > 0) {
                    tvFans.setText(loginDatas.get(0).getFansName().size());
                } else {
                    tvFans.setText(0);
                }
                if (loginDatas.get(0).getPerson().size() > 0 || loginDatas.get(0).getPosts().size() > 0) {
                    tvCollection.setText((loginDatas.get(0).getPerson().size() + loginDatas.get(0).getPosts().size()));
                } else {
                    tvCollection.setText(0);
                }
            }

        } else {
            tvLogin.setVisibility(View.VISIBLE);
            tvRegister.setVisibility(View.VISIBLE);
            tvAttention.setVisibility(View.GONE);
            tvFans.setVisibility(View.GONE);
            tvCollection.setVisibility(View.GONE);
        }

    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void getTitle(LoginData data) {
        tvTitle.setText(data.getAccountNum());
        isLogin = true;
        if (isLogin) {
            tvLogin.setVisibility(View.GONE);
            tvRegister.setVisibility(View.GONE);
            tvAttention.setVisibility(View.VISIBLE);
            tvFans.setVisibility(View.VISIBLE);
            tvCollection.setVisibility(View.VISIBLE);
            ArrayList<LoginData> loginDatas = DBTool.getInstance().query(LoginData.class, "accountNum", tvTitle.getText().toString());
            if (loginDatas.get(0).getAttentionName()!=null&&loginDatas.get(0).getAttentionName().size() > 0) {
                tvAttention.setText(loginDatas.get(0).getAttentionName().size());

            } else {
                tvAttention.setText(0+"");
            }
            if (loginDatas.get(0).getFansName()!=null&&loginDatas.get(0).getFansName().size() > 0) {
                tvFans.setText(loginDatas.get(0).getFansName().size()+"");
            } else {
                tvFans.setText(0+"");
            }
            if ((loginDatas.get(0).getPerson()!=null&&loginDatas.get(0).getPerson().size() > 0 )|| (loginDatas.get(0).getPosts()!=null&&loginDatas.get(0).getPosts().size() > 0)) {
                tvCollection.setText((loginDatas.get(0).getPerson().size() + loginDatas.get(0).getPosts().size())+"");
            } else {
                tvCollection.setText(0+"");
            }

        } else {
            tvLogin.setVisibility(View.VISIBLE);
            tvRegister.setVisibility(View.VISIBLE);
            tvAttention.setVisibility(View.GONE);
            tvFans.setVisibility(View.GONE);
            tvCollection.setVisibility(View.GONE);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_fragment_mine_shop:
                break;
            case R.id.rl_fragment_mine_my_information:
                break;
            case R.id.tv_fragment_mine_login:
                mIntent = new Intent(getActivity(), LoginActivity.class);
                startActivity(mIntent);
                break;
            case R.id.tv_fragment_mine_registered:
                mIntent = new Intent(getActivity(), RegisteredActivity.class);
                startActivity(mIntent);
                break;
            case R.id.ll_fragment_mine_my_attention:
                break;
            case R.id.ll_fragment_mine_my_fans:
                break;
            case R.id.ll_fragment_mine_my_collection:
                break;
            case R.id.rl_fragment_mine_my_orders:
                break;
            case R.id.ll_fragment_mine_will_give_money:
                break;
            case R.id.ll_fragment_mine_will_send_goods:
                break;
            case R.id.ll_fragment_mine_will_receive_goods:
                break;
            case R.id.ll_fragment_mine_wait_evaluation:
                break;
            case R.id.ll_fragment_mine_will_return_goods:
                break;
            case R.id.ll_fragment_mine_my_vip:
                break;
            case R.id.ll_fragment_mine_my_coupon:
                break;
            case R.id.ll_fragment_mine_my_red:
                break;
            case R.id.rl_fragment_mine_my_address:
                break;
            case R.id.rl_fragment_mine_my_posts:
                break;
            case R.id.rl_fragment_mine_my_like_brand:
                break;
            case R.id.rl_fragment_mine_my_label:
                break;
            case R.id.rl_fragment_mine_my_setting:
                Intent intent = new Intent(getActivity(),SettingActivity.class);
                getActivity().startActivity(intent);
                break;
            case R.id.rl_fragment_mine_my_help:
                break;
            case R.id.rl_fragment_mine_my_phone_num:
                break;
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        EventBus.getDefault().unregister(this);
    }

    @Override
    public void onResume() {
        super.onResume();
        isLogin = sp.getBoolean("isLogin", false);
        if (!isLogin){
            tvLogin.setVisibility(View.VISIBLE);
            tvRegister.setVisibility(View.VISIBLE);
            tvAttention.setVisibility(View.GONE);
            tvFans.setVisibility(View.GONE);
            tvCollection.setVisibility(View.GONE);
            tvTitle.setText(sp.getString("title", "我的"));
        }
    }



}
