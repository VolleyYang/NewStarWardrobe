package com.yangshenglong.newstarwardrobe.shopping.bean;

import java.util.List;

/**
 * Created by xiaoBu on 16/12/22.
 */

public class BeautyDataContent {

    // http://api-v2.mall.hichao.com/region/recommend-goods?flag=&ga=%2Fregion%2Frecommend-goods&id=5

    /**
     * response : {"code":"0","msg":"","isNew":1,"version":"","data":{"items":[{"width":"722","height":"280","component":{"componentType":"cell","picUrl":"http://s6.mingxingyichu.cn/group5/M00/53/B6/wKgBfVhYkamAcK_hAAEhy0QPUDE098.jpg?imageMogr2?imageMogr2?imageMogr2","action":{},"title":"","width":"722","height":"280"}},{"width":177,"height":235,"component":{"stateMessage":"","description":"美康粉黛保湿补水美白玫瑰面膜膏120g","price":"59.00","origin_price":"98.00","componentType":"item","picUrl":"http://s0.mingxingyichu.cn/group5/M00/53/BB/wKgBfVhYzJuAAT5ZAAAd3LXfCtg278.jpg","goods_id":"1034078","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","country":"国内","sales":"","action":{"actionType":"detail","source":"ecshop","sourceId":"2204844","goodsId":"1034078","type":"sku","banner_id":"29102"}}},{"width":177,"height":235,"component":{"stateMessage":"","description":"美康粉黛祛除色斑去黄保湿美白祛斑霜50g","price":"79.00","origin_price":"158.00","componentType":"item","picUrl":"http://s0.mingxingyichu.cn/group5/M00/55/A9/wKgBf1hYzKKAOyJRAAAdKCKAHDE860.jpg","goods_id":"1033827","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","country":"国内","sales":"","action":{"actionType":"detail","source":"ecshop","sourceId":"2204532","goodsId":"1033827","type":"sku","banner_id":"29089"}}},{"width":177,"height":235,"component":{"stateMessage":"","description":"草木之心白皙保湿抹茶面膜24片","price":"99.00","origin_price":"258.00","componentType":"item","picUrl":"http://s0.mingxingyichu.cn/group5/M00/55/A9/wKgBf1hYzKCAX2XAAAAdcN3zT1c026.jpg","goods_id":"1036475","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","country":"国内","sales":"","action":{"actionType":"detail","source":"ecshop","sourceId":"2208366","goodsId":"1036475","type":"sku","banner_id":"29110"}}},{"width":177,"height":235,"component":{"stateMessage":"","description":"草木之心龙井原生菁萃抹茶五件套","price":"148.00","origin_price":"303.00","componentType":"item","picUrl":"http://s0.mingxingyichu.cn/group5/M00/55/A9/wKgBf1hYzJ6AeP8oAAAhPrjMwnY686.jpg","goods_id":"1036508","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","country":"国内","sales":"","action":{"actionType":"detail","source":"ecshop","sourceId":"2208399","goodsId":"1036508","type":"sku","banner_id":"29129"}}},{"width":177,"height":235,"component":{"stateMessage":"","description":"草木之心控油保湿收缩毛孔衡肌水110g","price":"47.00","origin_price":"98.00","componentType":"item","picUrl":"http://s0.mingxingyichu.cn/group5/M00/55/A8/wKgBf1hYzJyABxwjAAAcPYzB9JY417.jpg","goods_id":"1036495","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","country":"国内","sales":"","action":{"actionType":"detail","source":"ecshop","sourceId":"2208386","goodsId":"1036495","type":"sku","banner_id":"29123"}}},{"width":177,"height":235,"component":{"stateMessage":"","description":"美康粉黛 轻描素写睫毛膏 自然纤长浓密防水卷翘不晕染","price":"59.00","origin_price":"78.00","componentType":"item","picUrl":"http://s0.mingxingyichu.cn/group5/M00/53/BB/wKgBfVhYzJ6AW0lMAAAYvKk0tAg407.jpg","goods_id":"1033837","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","country":"国内","sales":"","action":{"actionType":"detail","source":"ecshop","sourceId":"2204552","goodsId":"1033837","type":"sku","banner_id":"29091"}}},{"width":177,"height":235,"component":{"stateMessage":"","description":"【每日十件】美康粉黛美白补水去黑头汉方面膜膏120g","price":"59.00","origin_price":"98.00","componentType":"item","picUrl":"http://s0.mingxingyichu.cn/group5/M00/55/A9/wKgBf1hYzKCAQdycAAAeC6-pHM4927.jpg","goods_id":"1033816","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","country":"国内","sales":"","action":{"actionType":"detail","source":"ecshop","sourceId":"2204521","goodsId":"1033816","type":"sku","banner_id":"29082"}}},{"width":177,"height":235,"component":{"stateMessage":"","description":"【买2送3】美康粉黛彩妆2件套口红气垫CC霜组合","price":"136.00","origin_price":"318.00","componentType":"item","picUrl":"http://s0.mingxingyichu.cn/group5/M00/53/BB/wKgBfVhYzJyAJ4cNAAAhpjPo7j4628.jpg","goods_id":"1033857","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","country":"国内","sales":"","action":{"actionType":"detail","source":"ecshop","sourceId":"2204586","goodsId":"1033857","type":"sku","banner_id":"29101"}}},{"width":177,"height":235,"component":{"stateMessage":"","description":"【孕妈专用】美康粉黛保湿收缩毛孔海藻籽面膜300g","price":"59.00","origin_price":"79.00","componentType":"item","picUrl":"http://s0.mingxingyichu.cn/group5/M00/55/A9/wKgBf1hYzKGAVviNAAAcVxKLkoQ370.jpg","goods_id":"1034092","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","country":"国内","sales":"","action":{"actionType":"detail","source":"ecshop","sourceId":"2204858","goodsId":"1034092","type":"sku","banner_id":"29107"}}},{"width":177,"height":235,"component":{"stateMessage":"","description":"美康粉黛芍药锁水套装  专注植物补水","price":"199.00","origin_price":"269.00","componentType":"item","picUrl":"http://s0.mingxingyichu.cn/group5/M00/55/A9/wKgBf1hYzKCAGJAdAAAgkHk28hk210.jpg","goods_id":"1033850","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","country":"国内","sales":"","action":{"actionType":"detail","source":"ecshop","sourceId":"2204569","goodsId":"1033850","type":"sku","banner_id":"29099"}}},{"width":177,"height":235,"component":{"stateMessage":"","description":"美康粉黛轻描素写眼部彩妆3件套 新手必备","price":"89.00","origin_price":"158.00","componentType":"item","picUrl":"http://s0.mingxingyichu.cn/group5/M00/53/BB/wKgBfVhYzJuAD0AqAAAcILsHjRQ117.jpg","goods_id":"1033845","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","country":"国内","sales":"","action":{"actionType":"detail","source":"ecshop","sourceId":"2204562","goodsId":"1033845","type":"sku","banner_id":"29094"}}},{"width":177,"height":235,"component":{"stateMessage":"","description":"草木之心龙井原生菁萃抹茶三件套","price":"99.00","origin_price":"118.00","componentType":"item","picUrl":"http://s0.mingxingyichu.cn/group5/M00/55/A9/wKgBf1hYzKGALcD0AAAvutrM4io838.jpg","goods_id":"1036505","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","country":"国内","sales":"","action":{"actionType":"detail","source":"ecshop","sourceId":"2208396","goodsId":"1036505","type":"sku","banner_id":"29126"}}},{"width":177,"height":235,"component":{"stateMessage":"","description":"草木之心深层清洁抹茶绿泥面膜100g","price":"98.00","origin_price":"159.00","componentType":"item","picUrl":"http://s0.mingxingyichu.cn/group5/M00/55/A8/wKgBf1hYzJuABxLfAAAa60qUKcQ271.jpg","goods_id":"1036494","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","country":"国内","sales":"","action":{"actionType":"detail","source":"ecshop","sourceId":"2208385","goodsId":"1036494","type":"sku","banner_id":"29124"}}},{"width":177,"height":235,"component":{"stateMessage":"","description":"草木之心白皙补水荷花保湿面霜50g","price":"69.00","origin_price":"139.00","componentType":"item","picUrl":"http://s0.mingxingyichu.cn/group5/M00/53/BB/wKgBfVhYzJ6AHl81AAAZVNAkY4Q024.jpg","goods_id":"1036482","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","country":"国内","sales":"","action":{"actionType":"detail","source":"ecshop","sourceId":"2208373","goodsId":"1036482","type":"sku","banner_id":"29116"}}},{"width":177,"height":235,"component":{"stateMessage":"","description":"美康粉黛紫草祛痘面膜膏 祛痘印收毛孔深度清洁","price":"59.00","origin_price":"98.00","componentType":"item","picUrl":"http://s0.mingxingyichu.cn/group5/M00/53/BB/wKgBfVhYzKGAPB2BAAAT003X_n0058.jpg","goods_id":"1033811","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","country":"国内","sales":"","action":{"actionType":"detail","source":"ecshop","sourceId":"2204514","goodsId":"1033811","type":"sku","banner_id":"29080"}}},{"width":177,"height":235,"component":{"stateMessage":"","description":"美康粉黛保湿补水植物无色润唇膏3.8g","price":"49.00","origin_price":"128.00","componentType":"item","picUrl":"http://s0.mingxingyichu.cn/group5/M00/55/A9/wKgBf1hYzJ6AY3FAAAAWUYA4Fb0850.jpg","goods_id":"1033824","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","country":"国内","sales":"","action":{"actionType":"detail","source":"ecshop","sourceId":"2204529","goodsId":"1033824","type":"sku","banner_id":"29088"}}},{"width":177,"height":235,"component":{"stateMessage":"","description":"草木之心抹茶眼部精华霜20ml","price":"79.00","origin_price":"158.00","componentType":"item","picUrl":"http://s0.mingxingyichu.cn/group5/M00/53/BB/wKgBfVhYzJ2ADHgrAAAZjsjrv8c043.jpg","goods_id":"1036477","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","country":"国内","sales":"","action":{"actionType":"detail","source":"ecshop","sourceId":"2208368","goodsId":"1036477","type":"sku","banner_id":"29111"}}},{"width":177,"height":235,"component":{"stateMessage":"","description":"草木之心荷花补水免洗睡眠面膜100g","price":"69.00","origin_price":"148.00","componentType":"item","picUrl":"http://s0.mingxingyichu.cn/group5/M00/53/BB/wKgBfVhYzJ-AFKIvAAAbKcclOoI800.jpg","goods_id":"1036497","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","country":"国内","sales":"","action":{"actionType":"detail","source":"ecshop","sourceId":"2208388","goodsId":"1036497","type":"sku","banner_id":"29125"}}}],"flag":"0:18"}}
     */

    private ResponseBean response;

    public ResponseBean getResponse() {
        return response;
    }

    public void setResponse(ResponseBean response) {
        this.response = response;
    }

    public static class ResponseBean {
        /**
         * code : 0
         * msg :
         * isNew : 1
         * version :
         * data : {"items":[{"width":"722","height":"280","component":{"componentType":"cell","picUrl":"http://s6.mingxingyichu.cn/group5/M00/53/B6/wKgBfVhYkamAcK_hAAEhy0QPUDE098.jpg?imageMogr2?imageMogr2?imageMogr2","action":{},"title":"","width":"722","height":"280"}},{"width":177,"height":235,"component":{"stateMessage":"","description":"美康粉黛保湿补水美白玫瑰面膜膏120g","price":"59.00","origin_price":"98.00","componentType":"item","picUrl":"http://s0.mingxingyichu.cn/group5/M00/53/BB/wKgBfVhYzJuAAT5ZAAAd3LXfCtg278.jpg","goods_id":"1034078","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","country":"国内","sales":"","action":{"actionType":"detail","source":"ecshop","sourceId":"2204844","goodsId":"1034078","type":"sku","banner_id":"29102"}}},{"width":177,"height":235,"component":{"stateMessage":"","description":"美康粉黛祛除色斑去黄保湿美白祛斑霜50g","price":"79.00","origin_price":"158.00","componentType":"item","picUrl":"http://s0.mingxingyichu.cn/group5/M00/55/A9/wKgBf1hYzKKAOyJRAAAdKCKAHDE860.jpg","goods_id":"1033827","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","country":"国内","sales":"","action":{"actionType":"detail","source":"ecshop","sourceId":"2204532","goodsId":"1033827","type":"sku","banner_id":"29089"}}},{"width":177,"height":235,"component":{"stateMessage":"","description":"草木之心白皙保湿抹茶面膜24片","price":"99.00","origin_price":"258.00","componentType":"item","picUrl":"http://s0.mingxingyichu.cn/group5/M00/55/A9/wKgBf1hYzKCAX2XAAAAdcN3zT1c026.jpg","goods_id":"1036475","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","country":"国内","sales":"","action":{"actionType":"detail","source":"ecshop","sourceId":"2208366","goodsId":"1036475","type":"sku","banner_id":"29110"}}},{"width":177,"height":235,"component":{"stateMessage":"","description":"草木之心龙井原生菁萃抹茶五件套","price":"148.00","origin_price":"303.00","componentType":"item","picUrl":"http://s0.mingxingyichu.cn/group5/M00/55/A9/wKgBf1hYzJ6AeP8oAAAhPrjMwnY686.jpg","goods_id":"1036508","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","country":"国内","sales":"","action":{"actionType":"detail","source":"ecshop","sourceId":"2208399","goodsId":"1036508","type":"sku","banner_id":"29129"}}},{"width":177,"height":235,"component":{"stateMessage":"","description":"草木之心控油保湿收缩毛孔衡肌水110g","price":"47.00","origin_price":"98.00","componentType":"item","picUrl":"http://s0.mingxingyichu.cn/group5/M00/55/A8/wKgBf1hYzJyABxwjAAAcPYzB9JY417.jpg","goods_id":"1036495","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","country":"国内","sales":"","action":{"actionType":"detail","source":"ecshop","sourceId":"2208386","goodsId":"1036495","type":"sku","banner_id":"29123"}}},{"width":177,"height":235,"component":{"stateMessage":"","description":"美康粉黛 轻描素写睫毛膏 自然纤长浓密防水卷翘不晕染","price":"59.00","origin_price":"78.00","componentType":"item","picUrl":"http://s0.mingxingyichu.cn/group5/M00/53/BB/wKgBfVhYzJ6AW0lMAAAYvKk0tAg407.jpg","goods_id":"1033837","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","country":"国内","sales":"","action":{"actionType":"detail","source":"ecshop","sourceId":"2204552","goodsId":"1033837","type":"sku","banner_id":"29091"}}},{"width":177,"height":235,"component":{"stateMessage":"","description":"【每日十件】美康粉黛美白补水去黑头汉方面膜膏120g","price":"59.00","origin_price":"98.00","componentType":"item","picUrl":"http://s0.mingxingyichu.cn/group5/M00/55/A9/wKgBf1hYzKCAQdycAAAeC6-pHM4927.jpg","goods_id":"1033816","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","country":"国内","sales":"","action":{"actionType":"detail","source":"ecshop","sourceId":"2204521","goodsId":"1033816","type":"sku","banner_id":"29082"}}},{"width":177,"height":235,"component":{"stateMessage":"","description":"【买2送3】美康粉黛彩妆2件套口红气垫CC霜组合","price":"136.00","origin_price":"318.00","componentType":"item","picUrl":"http://s0.mingxingyichu.cn/group5/M00/53/BB/wKgBfVhYzJyAJ4cNAAAhpjPo7j4628.jpg","goods_id":"1033857","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","country":"国内","sales":"","action":{"actionType":"detail","source":"ecshop","sourceId":"2204586","goodsId":"1033857","type":"sku","banner_id":"29101"}}},{"width":177,"height":235,"component":{"stateMessage":"","description":"【孕妈专用】美康粉黛保湿收缩毛孔海藻籽面膜300g","price":"59.00","origin_price":"79.00","componentType":"item","picUrl":"http://s0.mingxingyichu.cn/group5/M00/55/A9/wKgBf1hYzKGAVviNAAAcVxKLkoQ370.jpg","goods_id":"1034092","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","country":"国内","sales":"","action":{"actionType":"detail","source":"ecshop","sourceId":"2204858","goodsId":"1034092","type":"sku","banner_id":"29107"}}},{"width":177,"height":235,"component":{"stateMessage":"","description":"美康粉黛芍药锁水套装  专注植物补水","price":"199.00","origin_price":"269.00","componentType":"item","picUrl":"http://s0.mingxingyichu.cn/group5/M00/55/A9/wKgBf1hYzKCAGJAdAAAgkHk28hk210.jpg","goods_id":"1033850","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","country":"国内","sales":"","action":{"actionType":"detail","source":"ecshop","sourceId":"2204569","goodsId":"1033850","type":"sku","banner_id":"29099"}}},{"width":177,"height":235,"component":{"stateMessage":"","description":"美康粉黛轻描素写眼部彩妆3件套 新手必备","price":"89.00","origin_price":"158.00","componentType":"item","picUrl":"http://s0.mingxingyichu.cn/group5/M00/53/BB/wKgBfVhYzJuAD0AqAAAcILsHjRQ117.jpg","goods_id":"1033845","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","country":"国内","sales":"","action":{"actionType":"detail","source":"ecshop","sourceId":"2204562","goodsId":"1033845","type":"sku","banner_id":"29094"}}},{"width":177,"height":235,"component":{"stateMessage":"","description":"草木之心龙井原生菁萃抹茶三件套","price":"99.00","origin_price":"118.00","componentType":"item","picUrl":"http://s0.mingxingyichu.cn/group5/M00/55/A9/wKgBf1hYzKGALcD0AAAvutrM4io838.jpg","goods_id":"1036505","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","country":"国内","sales":"","action":{"actionType":"detail","source":"ecshop","sourceId":"2208396","goodsId":"1036505","type":"sku","banner_id":"29126"}}},{"width":177,"height":235,"component":{"stateMessage":"","description":"草木之心深层清洁抹茶绿泥面膜100g","price":"98.00","origin_price":"159.00","componentType":"item","picUrl":"http://s0.mingxingyichu.cn/group5/M00/55/A8/wKgBf1hYzJuABxLfAAAa60qUKcQ271.jpg","goods_id":"1036494","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","country":"国内","sales":"","action":{"actionType":"detail","source":"ecshop","sourceId":"2208385","goodsId":"1036494","type":"sku","banner_id":"29124"}}},{"width":177,"height":235,"component":{"stateMessage":"","description":"草木之心白皙补水荷花保湿面霜50g","price":"69.00","origin_price":"139.00","componentType":"item","picUrl":"http://s0.mingxingyichu.cn/group5/M00/53/BB/wKgBfVhYzJ6AHl81AAAZVNAkY4Q024.jpg","goods_id":"1036482","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","country":"国内","sales":"","action":{"actionType":"detail","source":"ecshop","sourceId":"2208373","goodsId":"1036482","type":"sku","banner_id":"29116"}}},{"width":177,"height":235,"component":{"stateMessage":"","description":"美康粉黛紫草祛痘面膜膏 祛痘印收毛孔深度清洁","price":"59.00","origin_price":"98.00","componentType":"item","picUrl":"http://s0.mingxingyichu.cn/group5/M00/53/BB/wKgBfVhYzKGAPB2BAAAT003X_n0058.jpg","goods_id":"1033811","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","country":"国内","sales":"","action":{"actionType":"detail","source":"ecshop","sourceId":"2204514","goodsId":"1033811","type":"sku","banner_id":"29080"}}},{"width":177,"height":235,"component":{"stateMessage":"","description":"美康粉黛保湿补水植物无色润唇膏3.8g","price":"49.00","origin_price":"128.00","componentType":"item","picUrl":"http://s0.mingxingyichu.cn/group5/M00/55/A9/wKgBf1hYzJ6AY3FAAAAWUYA4Fb0850.jpg","goods_id":"1033824","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","country":"国内","sales":"","action":{"actionType":"detail","source":"ecshop","sourceId":"2204529","goodsId":"1033824","type":"sku","banner_id":"29088"}}},{"width":177,"height":235,"component":{"stateMessage":"","description":"草木之心抹茶眼部精华霜20ml","price":"79.00","origin_price":"158.00","componentType":"item","picUrl":"http://s0.mingxingyichu.cn/group5/M00/53/BB/wKgBfVhYzJ2ADHgrAAAZjsjrv8c043.jpg","goods_id":"1036477","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","country":"国内","sales":"","action":{"actionType":"detail","source":"ecshop","sourceId":"2208368","goodsId":"1036477","type":"sku","banner_id":"29111"}}},{"width":177,"height":235,"component":{"stateMessage":"","description":"草木之心荷花补水免洗睡眠面膜100g","price":"69.00","origin_price":"148.00","componentType":"item","picUrl":"http://s0.mingxingyichu.cn/group5/M00/53/BB/wKgBfVhYzJ-AFKIvAAAbKcclOoI800.jpg","goods_id":"1036497","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","country":"国内","sales":"","action":{"actionType":"detail","source":"ecshop","sourceId":"2208388","goodsId":"1036497","type":"sku","banner_id":"29125"}}}],"flag":"0:18"}
         */

        private String code;
        private String msg;
        private int isNew;
        private String version;
        private DataBean data;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        public int getIsNew() {
            return isNew;
        }

        public void setIsNew(int isNew) {
            this.isNew = isNew;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public DataBean getData() {
            return data;
        }

        public void setData(DataBean data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * items : [{"width":"722","height":"280","component":{"componentType":"cell","picUrl":"http://s6.mingxingyichu.cn/group5/M00/53/B6/wKgBfVhYkamAcK_hAAEhy0QPUDE098.jpg?imageMogr2?imageMogr2?imageMogr2","action":{},"title":"","width":"722","height":"280"}},{"width":177,"height":235,"component":{"stateMessage":"","description":"美康粉黛保湿补水美白玫瑰面膜膏120g","price":"59.00","origin_price":"98.00","componentType":"item","picUrl":"http://s0.mingxingyichu.cn/group5/M00/53/BB/wKgBfVhYzJuAAT5ZAAAd3LXfCtg278.jpg","goods_id":"1034078","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","country":"国内","sales":"","action":{"actionType":"detail","source":"ecshop","sourceId":"2204844","goodsId":"1034078","type":"sku","banner_id":"29102"}}},{"width":177,"height":235,"component":{"stateMessage":"","description":"美康粉黛祛除色斑去黄保湿美白祛斑霜50g","price":"79.00","origin_price":"158.00","componentType":"item","picUrl":"http://s0.mingxingyichu.cn/group5/M00/55/A9/wKgBf1hYzKKAOyJRAAAdKCKAHDE860.jpg","goods_id":"1033827","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","country":"国内","sales":"","action":{"actionType":"detail","source":"ecshop","sourceId":"2204532","goodsId":"1033827","type":"sku","banner_id":"29089"}}},{"width":177,"height":235,"component":{"stateMessage":"","description":"草木之心白皙保湿抹茶面膜24片","price":"99.00","origin_price":"258.00","componentType":"item","picUrl":"http://s0.mingxingyichu.cn/group5/M00/55/A9/wKgBf1hYzKCAX2XAAAAdcN3zT1c026.jpg","goods_id":"1036475","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","country":"国内","sales":"","action":{"actionType":"detail","source":"ecshop","sourceId":"2208366","goodsId":"1036475","type":"sku","banner_id":"29110"}}},{"width":177,"height":235,"component":{"stateMessage":"","description":"草木之心龙井原生菁萃抹茶五件套","price":"148.00","origin_price":"303.00","componentType":"item","picUrl":"http://s0.mingxingyichu.cn/group5/M00/55/A9/wKgBf1hYzJ6AeP8oAAAhPrjMwnY686.jpg","goods_id":"1036508","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","country":"国内","sales":"","action":{"actionType":"detail","source":"ecshop","sourceId":"2208399","goodsId":"1036508","type":"sku","banner_id":"29129"}}},{"width":177,"height":235,"component":{"stateMessage":"","description":"草木之心控油保湿收缩毛孔衡肌水110g","price":"47.00","origin_price":"98.00","componentType":"item","picUrl":"http://s0.mingxingyichu.cn/group5/M00/55/A8/wKgBf1hYzJyABxwjAAAcPYzB9JY417.jpg","goods_id":"1036495","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","country":"国内","sales":"","action":{"actionType":"detail","source":"ecshop","sourceId":"2208386","goodsId":"1036495","type":"sku","banner_id":"29123"}}},{"width":177,"height":235,"component":{"stateMessage":"","description":"美康粉黛 轻描素写睫毛膏 自然纤长浓密防水卷翘不晕染","price":"59.00","origin_price":"78.00","componentType":"item","picUrl":"http://s0.mingxingyichu.cn/group5/M00/53/BB/wKgBfVhYzJ6AW0lMAAAYvKk0tAg407.jpg","goods_id":"1033837","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","country":"国内","sales":"","action":{"actionType":"detail","source":"ecshop","sourceId":"2204552","goodsId":"1033837","type":"sku","banner_id":"29091"}}},{"width":177,"height":235,"component":{"stateMessage":"","description":"【每日十件】美康粉黛美白补水去黑头汉方面膜膏120g","price":"59.00","origin_price":"98.00","componentType":"item","picUrl":"http://s0.mingxingyichu.cn/group5/M00/55/A9/wKgBf1hYzKCAQdycAAAeC6-pHM4927.jpg","goods_id":"1033816","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","country":"国内","sales":"","action":{"actionType":"detail","source":"ecshop","sourceId":"2204521","goodsId":"1033816","type":"sku","banner_id":"29082"}}},{"width":177,"height":235,"component":{"stateMessage":"","description":"【买2送3】美康粉黛彩妆2件套口红气垫CC霜组合","price":"136.00","origin_price":"318.00","componentType":"item","picUrl":"http://s0.mingxingyichu.cn/group5/M00/53/BB/wKgBfVhYzJyAJ4cNAAAhpjPo7j4628.jpg","goods_id":"1033857","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","country":"国内","sales":"","action":{"actionType":"detail","source":"ecshop","sourceId":"2204586","goodsId":"1033857","type":"sku","banner_id":"29101"}}},{"width":177,"height":235,"component":{"stateMessage":"","description":"【孕妈专用】美康粉黛保湿收缩毛孔海藻籽面膜300g","price":"59.00","origin_price":"79.00","componentType":"item","picUrl":"http://s0.mingxingyichu.cn/group5/M00/55/A9/wKgBf1hYzKGAVviNAAAcVxKLkoQ370.jpg","goods_id":"1034092","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","country":"国内","sales":"","action":{"actionType":"detail","source":"ecshop","sourceId":"2204858","goodsId":"1034092","type":"sku","banner_id":"29107"}}},{"width":177,"height":235,"component":{"stateMessage":"","description":"美康粉黛芍药锁水套装  专注植物补水","price":"199.00","origin_price":"269.00","componentType":"item","picUrl":"http://s0.mingxingyichu.cn/group5/M00/55/A9/wKgBf1hYzKCAGJAdAAAgkHk28hk210.jpg","goods_id":"1033850","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","country":"国内","sales":"","action":{"actionType":"detail","source":"ecshop","sourceId":"2204569","goodsId":"1033850","type":"sku","banner_id":"29099"}}},{"width":177,"height":235,"component":{"stateMessage":"","description":"美康粉黛轻描素写眼部彩妆3件套 新手必备","price":"89.00","origin_price":"158.00","componentType":"item","picUrl":"http://s0.mingxingyichu.cn/group5/M00/53/BB/wKgBfVhYzJuAD0AqAAAcILsHjRQ117.jpg","goods_id":"1033845","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","country":"国内","sales":"","action":{"actionType":"detail","source":"ecshop","sourceId":"2204562","goodsId":"1033845","type":"sku","banner_id":"29094"}}},{"width":177,"height":235,"component":{"stateMessage":"","description":"草木之心龙井原生菁萃抹茶三件套","price":"99.00","origin_price":"118.00","componentType":"item","picUrl":"http://s0.mingxingyichu.cn/group5/M00/55/A9/wKgBf1hYzKGALcD0AAAvutrM4io838.jpg","goods_id":"1036505","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","country":"国内","sales":"","action":{"actionType":"detail","source":"ecshop","sourceId":"2208396","goodsId":"1036505","type":"sku","banner_id":"29126"}}},{"width":177,"height":235,"component":{"stateMessage":"","description":"草木之心深层清洁抹茶绿泥面膜100g","price":"98.00","origin_price":"159.00","componentType":"item","picUrl":"http://s0.mingxingyichu.cn/group5/M00/55/A8/wKgBf1hYzJuABxLfAAAa60qUKcQ271.jpg","goods_id":"1036494","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","country":"国内","sales":"","action":{"actionType":"detail","source":"ecshop","sourceId":"2208385","goodsId":"1036494","type":"sku","banner_id":"29124"}}},{"width":177,"height":235,"component":{"stateMessage":"","description":"草木之心白皙补水荷花保湿面霜50g","price":"69.00","origin_price":"139.00","componentType":"item","picUrl":"http://s0.mingxingyichu.cn/group5/M00/53/BB/wKgBfVhYzJ6AHl81AAAZVNAkY4Q024.jpg","goods_id":"1036482","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","country":"国内","sales":"","action":{"actionType":"detail","source":"ecshop","sourceId":"2208373","goodsId":"1036482","type":"sku","banner_id":"29116"}}},{"width":177,"height":235,"component":{"stateMessage":"","description":"美康粉黛紫草祛痘面膜膏 祛痘印收毛孔深度清洁","price":"59.00","origin_price":"98.00","componentType":"item","picUrl":"http://s0.mingxingyichu.cn/group5/M00/53/BB/wKgBfVhYzKGAPB2BAAAT003X_n0058.jpg","goods_id":"1033811","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","country":"国内","sales":"","action":{"actionType":"detail","source":"ecshop","sourceId":"2204514","goodsId":"1033811","type":"sku","banner_id":"29080"}}},{"width":177,"height":235,"component":{"stateMessage":"","description":"美康粉黛保湿补水植物无色润唇膏3.8g","price":"49.00","origin_price":"128.00","componentType":"item","picUrl":"http://s0.mingxingyichu.cn/group5/M00/55/A9/wKgBf1hYzJ6AY3FAAAAWUYA4Fb0850.jpg","goods_id":"1033824","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","country":"国内","sales":"","action":{"actionType":"detail","source":"ecshop","sourceId":"2204529","goodsId":"1033824","type":"sku","banner_id":"29088"}}},{"width":177,"height":235,"component":{"stateMessage":"","description":"草木之心抹茶眼部精华霜20ml","price":"79.00","origin_price":"158.00","componentType":"item","picUrl":"http://s0.mingxingyichu.cn/group5/M00/53/BB/wKgBfVhYzJ2ADHgrAAAZjsjrv8c043.jpg","goods_id":"1036477","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","country":"国内","sales":"","action":{"actionType":"detail","source":"ecshop","sourceId":"2208368","goodsId":"1036477","type":"sku","banner_id":"29111"}}},{"width":177,"height":235,"component":{"stateMessage":"","description":"草木之心荷花补水免洗睡眠面膜100g","price":"69.00","origin_price":"148.00","componentType":"item","picUrl":"http://s0.mingxingyichu.cn/group5/M00/53/BB/wKgBfVhYzJ-AFKIvAAAbKcclOoI800.jpg","goods_id":"1036497","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","country":"国内","sales":"","action":{"actionType":"detail","source":"ecshop","sourceId":"2208388","goodsId":"1036497","type":"sku","banner_id":"29125"}}}]
             * flag : 0:18
             */

            private String flag;
            private List<ItemsBean> items;

            public String getFlag() {
                return flag;
            }

            public void setFlag(String flag) {
                this.flag = flag;
            }

            public List<ItemsBean> getItems() {
                return items;
            }

            public void setItems(List<ItemsBean> items) {
                this.items = items;
            }

            public static class ItemsBean {
                /**
                 * width : 722
                 * height : 280
                 * component : {"componentType":"cell","picUrl":"http://s6.mingxingyichu.cn/group5/M00/53/B6/wKgBfVhYkamAcK_hAAEhy0QPUDE098.jpg?imageMogr2?imageMogr2?imageMogr2","action":{},"title":"","width":"722","height":"280"}
                 */

                private String width;
                private String height;
                private ComponentBean component;

                public String getWidth() {
                    return width;
                }

                public void setWidth(String width) {
                    this.width = width;
                }

                public String getHeight() {
                    return height;
                }

                public void setHeight(String height) {
                    this.height = height;
                }

                public ComponentBean getComponent() {
                    return component;
                }

                public void setComponent(ComponentBean component) {
                    this.component = component;
                }

                public static class ComponentBean {
                    /**
                     * componentType : cell
                     * picUrl : http://s6.mingxingyichu.cn/group5/M00/53/B6/wKgBfVhYkamAcK_hAAEhy0QPUDE098.jpg?imageMogr2?imageMogr2?imageMogr2
                     * action : {}
                     * title :
                     * width : 722
                     * height : 280
                     */

                    private String componentType;
                    private String picUrl;
                    private ActionBean action;
                    private String title;
                    private String width;
                    private String height;

                    /* 自行添加的字段 (set get) */
                    private String description;
                    private String price;
                    private String origin_price;
                    private String goods_id;
                    private String nationalFlag;
                    private String country;

                    public String getDescription() {
                        return description;
                    }

                    public void setDescription(String description) {
                        this.description = description;
                    }

                    public String getPrice() {
                        return price;
                    }

                    public void setPrice(String price) {
                        this.price = price;
                    }

                    public String getOrigin_price() {
                        return origin_price;
                    }

                    public void setOrigin_price(String origin_price) {
                        this.origin_price = origin_price;
                    }

                    public String getGoods_id() {
                        return goods_id;
                    }

                    public void setGoods_id(String goods_id) {
                        this.goods_id = goods_id;
                    }

                    public String getNationalFlag() {
                        return nationalFlag;
                    }

                    public void setNationalFlag(String nationalFlag) {
                        this.nationalFlag = nationalFlag;
                    }

                    public String getCountry() {
                        return country;
                    }

                    public void setCountry(String country) {
                        this.country = country;
                    }

                    public String getComponentType() {
                        return componentType;
                    }

                    public void setComponentType(String componentType) {
                        this.componentType = componentType;
                    }

                    public String getPicUrl() {
                        return picUrl;
                    }

                    public void setPicUrl(String picUrl) {
                        this.picUrl = picUrl;
                    }

                    public ActionBean getAction() {
                        return action;
                    }

                    public void setAction(ActionBean action) {
                        this.action = action;
                    }

                    public String getTitle() {
                        return title;
                    }

                    public void setTitle(String title) {
                        this.title = title;
                    }

                    public String getWidth() {
                        return width;
                    }

                    public void setWidth(String width) {
                        this.width = width;
                    }

                    public String getHeight() {
                        return height;
                    }

                    public void setHeight(String height) {
                        this.height = height;
                    }

                    public static class ActionBean {
                    }
                }
            }
        }
    }
}
