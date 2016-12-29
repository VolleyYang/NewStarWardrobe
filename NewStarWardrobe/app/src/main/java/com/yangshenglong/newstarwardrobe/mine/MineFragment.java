package com.yangshenglong.newstarwardrobe.mine;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.yangshenglong.newstarwardrobe.R;
import com.yangshenglong.newstarwardrobe.base.BaseFragment;

/**
 * Created by VolleyYang on 16/12/20.
 */

public class MineFragment extends BaseFragment implements View.OnClickListener {
    private TextView tvTitle, tvVip, tvLogin, tvRegister, tvAttention, tvFans, tvCollection;
    private ImageView ivShop, ivTitle;
    private LinearLayout llAttention, llFans, llCollection, llGiveMoney, llSendGoods, llReceiveGoods, llEvauation, llReturnGoods, llVip, llCoupon, llRed;
    private RelativeLayout rlOrders, rlAddress, rlPosts, rlBrand, rlLabel, rlSetting, rlHelp, rlPhone, rlInformation;

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
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_fragment_mine_shop:
                break;
            case R.id.rl_fragment_mine_my_information:
                break;
            case R.id.tv_fragment_mine_login:
                break;
            case R.id.tv_fragment_mine_registered:
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
                break;
            case R.id.rl_fragment_mine_my_help:
                break;
            case R.id.rl_fragment_mine_my_phone_num:
                break;
        }
    }
}
