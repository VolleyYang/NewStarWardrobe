package com.yangshenglong.newstarwardrobe.staticclass;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * Created by VolleyYang on 16/12/20.
 */

public class StaticUrl {


    //时尚圈 --推荐 (RecyclerView)
    public static final String RECOMMEND = "http://api-v2.mall.hichao.com/forum/recommend-list?flag=30:494774&last_item_id=493154&ga=%2Fforum%2Frecommend-list";

    //时尚圈 --轮播图
    public static final String RECOMMENDBANNER = " http://api-v2.mall.hichao.com/forum/banner?ga=%2Fforum%2Fbanner";

    //时尚圈 --GridView
    public static final String RECOMMENDGV = "http://api-v2.mall.hichao.com/forum/tag-recommend?ga=%2Fforum%2Ftag-recommend";

    //最新 --RecyclerView
    public static final String NEWEST = "http://api-v2.mall.hichao.com/forum/thread/new?flag=&ga=%2Fforum%2Fthread%2Fnew";

    //最新 --Banner
    public static  final String NEWESTBANNER = "http://api.liwushuo.com/v2/banners";

    //衣橱达人
    public static final String WARDROBEDR = "http://api-v2.mall.hichao.com/forum/star?flag=&ga=%2Fforum%2Fstar";


    // 搜索的网址 左半部分
    public static final String SEARCH_URL_LEFT = "http://api-v2.mall.hichao.com/search/skus?asc=1&flag=&query=";
    // 搜索的网址 右半部分
    public static final String SEARCH_URL_RIGHT = "&cat=&ga=%2Fsearch%2Fskus&sort=all";
    // 上新 左
    public static final String SEARCH_NEW_URL_LEFT = "http://api-v2.mall.hichao.com/search/skus?asc=0&flag=&query=";
    // 上新 右
    public static final String SEARCH_NEW_URL_RIGHT = "&cat=&ga=%2Fsearch%2Fskus&sort=new";
    // 销量 左
    public static final String SEARCH_SALE_URL_LEFT = "http://api-v2.mall.hichao.com/search/skus?asc=0&flag=&query=";
    // 销量 右
    public static final String SEARCH_SALE_URL_RIGNT = "&cat=&ga=%2Fsearch%2Fskus&sort=sale";
    // 价格上 左
    public static final String SEARCH_PRICE_UP_URL_LEFT = "http://api-v2.mall.hichao.com/search/skus?asc=1&flag=&query=";
    // 价格上 右
    public static final String SEARCH_PRICE_UP_URL_RIGHT = "&cat=&ga=%2Fsearch%2Fskus&sort=price";
    // 价格下 左
    public static final String SEARCH_PRICE_DOWN_URL_LEFT = "http://api-v2.mall.hichao.com/search/skus?asc=0&flag=&query=";
    // 价格下 右
    public static final String SEARCH_PRICE_DOWN_URL_RINGT = "&cat=&ga=%2Fsearch%2Fskus&sort=price";
    // 热词推荐
    public static final String HEAT_SEARCH_URL = "http://api-v2.mall.hichao.com/search/sug?q=&ga=%2Fsearch%2Fsug&type=sku";
    // 搜索引导 左
    public static final String GUIDE_SEARCH_URL_LEFT = "http://api-v2.mall.hichao.com/search/sug?q=";
    // 搜索引导 右
    public static final String GUIDE_SEARCH_URL_RIGHT = "&ga=%2Fsearch%2Fsug&type=sku";
    // 帖子搜索 左
    public static final String POSTS_SEARCH_URL_LEFT = "http://api-v2.mall.hichao.com/search/query?q=";
    // 帖子搜索 右
    public static final String POSTS_SEARCH_URL_RIGHT = "&flag=&ga=%2Fsearch%2Fquery&type=new_thread";
    // 红人引导搜索 左
    public static final String RED_GUIDE_SEARCH_URL_LEFT = "http://api-v2.mall.hichao.com/search/sug?q=";
    // 红人引导搜索 右
    public static final String RED_GUIDE_SEARCH_URL_RIGHT = "&ga=%2Fsearch%2Fsug&type=hongren";
    // 红人搜索 左
    public static final String RED_SEARCH_URL_LEFT = "http://api-v2.mall.hichao.com/search/query?q=";
    // 红人搜索 右
    public static final String RED_SEARCH_URL_RIGHT = "&flag=&ga=%2Fsearch%2Fquery&type=hongren";



    // 广播  可以进一步搜索
    public static final String HAVE_MORE_SEARCH_INFORMATION = "have_more_search_information";
    // 广播  不可以进一步搜索
    public static final String NOT_HAVE_MORE_SEARCH_INFORMATION = "not_have_more_search_information";

    // 将文字转换成UTF_8格式 用来拼接网址 将要搜索的文字转换与上面的搜索网址拼接
    public static String toUtf8(String str) {
        String result = null;
        try {
            result = new String(str.getBytes("UTF-8"), "UTF-8");
            result = URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return result;
    }
}
