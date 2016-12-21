package com.yangshenglong.newstarwardrobe.search;

import java.util.List;

/**
 * Created by CST on 16/12/21.
 */

public class HeatSearchBean {

    /**
     * message :
     * data : {"items":[{"text":"减龄"},{"text":"冬装"},{"text":"针织裙"},{"text":"冬装新款"},{"text":"冬季护肤"},{"text":"毛衣"},{"text":"显瘦"},{"text":"卫衣"},{"text":"韩版女装"},{"text":"冬妆"}],"appApi":"/search/sug"}
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
         * items : [{"text":"减龄"},{"text":"冬装"},{"text":"针织裙"},{"text":"冬装新款"},{"text":"冬季护肤"},{"text":"毛衣"},{"text":"显瘦"},{"text":"卫衣"},{"text":"韩版女装"},{"text":"冬妆"}]
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
             * text : 减龄
             */

            private String text;

            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
            }
        }
    }
}
