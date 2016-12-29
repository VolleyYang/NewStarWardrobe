package com.yangshenglong.newstarwardrobe.search.redmen;

import java.util.List;

/**
 * Created by CST on 16/12/24.
 */

public class RedGuideSearchBean {

    /**
     * message :
     * data : {"items":[{"text":"啊啊越","picUrl":"http://mxycforum.u.qiniudn.com/2014-09-14-8d82b8ff1bd17a6522a2c0ac74525833","description":"红人","id":"1434895"},{"text":"爱蜜粒特","picUrl":"http://tp3.sinaimg.cn/2318733242/180/40070558359/0","description":"美妆达人","id":"2258663"},{"text":"Amber","picUrl":"http://api.upload3.pimg.cn/user_upload/a28296f5621049d4884aabe756a4cb26.jpeg_thumb_120x%3E_.jpeg","description":"穿搭达人","id":"2132850"},{"text":"乔装打扮","picUrl":"http://img.taobaocdn.com/sns_logo/T1rBmcFjpaXXb1upjX.jpg","description":"穿搭达人","id":"4001221"},{"text":"阿晶","picUrl":"http://mxycforum.u.qiniudn.com/2014-12-02-3f146593a0de8d35f712b5ec50f7a7d8","description":"乐活达人","id":"1491068"},{"text":"ALAN","picUrl":"http://api.upload3.pimg.cn/user_upload/2b9e5c05b43041b2a95468b26e92b5cc.jpeg_thumb_120x%3E_.jpeg","description":"穿搭达人","id":"3111368"},{"text":"Adi","picUrl":"http://mxycforum.u.qiniudn.com/2015-02-13-2bec90728f1a02b1fcefa650fe7784e3","description":"乐活达人","id":"111546"},{"text":"kangcher888","picUrl":"","description":"穿搭达人","id":"1232"},{"text":"Akia韩范","picUrl":"http://api.upload4.pimg.cn/user_upload/a92ee1a68bc940848f6d26e0c240e682.jpeg_thumb_120x%3E_.jpeg","description":"穿搭达人","id":"3394524"},{"text":"Ami曼曼","picUrl":"http://api.upload1.pimg.cn/user_upload/4277836fe69d40779861d6a9faefdd53.jpeg_thumb_120x%3E_.jpeg","description":"美妆达人","id":"12468325"}],"appApi":"/search/sug"}
     */

    private String message;
    private DataBean data;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * items : [{"text":"啊啊越","picUrl":"http://mxycforum.u.qiniudn.com/2014-09-14-8d82b8ff1bd17a6522a2c0ac74525833","description":"红人","id":"1434895"},{"text":"爱蜜粒特","picUrl":"http://tp3.sinaimg.cn/2318733242/180/40070558359/0","description":"美妆达人","id":"2258663"},{"text":"Amber","picUrl":"http://api.upload3.pimg.cn/user_upload/a28296f5621049d4884aabe756a4cb26.jpeg_thumb_120x%3E_.jpeg","description":"穿搭达人","id":"2132850"},{"text":"乔装打扮","picUrl":"http://img.taobaocdn.com/sns_logo/T1rBmcFjpaXXb1upjX.jpg","description":"穿搭达人","id":"4001221"},{"text":"阿晶","picUrl":"http://mxycforum.u.qiniudn.com/2014-12-02-3f146593a0de8d35f712b5ec50f7a7d8","description":"乐活达人","id":"1491068"},{"text":"ALAN","picUrl":"http://api.upload3.pimg.cn/user_upload/2b9e5c05b43041b2a95468b26e92b5cc.jpeg_thumb_120x%3E_.jpeg","description":"穿搭达人","id":"3111368"},{"text":"Adi","picUrl":"http://mxycforum.u.qiniudn.com/2015-02-13-2bec90728f1a02b1fcefa650fe7784e3","description":"乐活达人","id":"111546"},{"text":"kangcher888","picUrl":"","description":"穿搭达人","id":"1232"},{"text":"Akia韩范","picUrl":"http://api.upload4.pimg.cn/user_upload/a92ee1a68bc940848f6d26e0c240e682.jpeg_thumb_120x%3E_.jpeg","description":"穿搭达人","id":"3394524"},{"text":"Ami曼曼","picUrl":"http://api.upload1.pimg.cn/user_upload/4277836fe69d40779861d6a9faefdd53.jpeg_thumb_120x%3E_.jpeg","description":"美妆达人","id":"12468325"}]
         * appApi : /search/sug
         */

        private String appApi;
        private List<ItemsBean> items;

        public String getAppApi() {
            return appApi;
        }

        public void setAppApi(String appApi) {
            this.appApi = appApi;
        }

        public List<ItemsBean> getItems() {
            return items;
        }

        public void setItems(List<ItemsBean> items) {
            this.items = items;
        }

        public static class ItemsBean {
            /**
             * text : 啊啊越
             * picUrl : http://mxycforum.u.qiniudn.com/2014-09-14-8d82b8ff1bd17a6522a2c0ac74525833
             * description : 红人
             * id : 1434895
             */

            private String text;
            private String picUrl;
            private String description;
            private String id;

            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
            }

            public String getPicUrl() {
                return picUrl;
            }

            public void setPicUrl(String picUrl) {
                this.picUrl = picUrl;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }
        }
    }
}
