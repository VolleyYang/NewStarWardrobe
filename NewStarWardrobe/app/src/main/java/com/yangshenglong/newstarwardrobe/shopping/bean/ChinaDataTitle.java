package com.yangshenglong.newstarwardrobe.shopping.bean;

import java.util.List;

/**
 * Created by xiaoBu on 16/12/21.
 * 中国馆 题头图片 行布局1
 */

public class ChinaDataTitle {

    // http://api-v2.mall.hichao.com/region/detail/banner/get-prefecture-banner?ga=%2Fregion%2Fdetail%2Fbanner%2Fget-prefecture-banner&id=3

    /**
     * message :
     * data : {"items":[{"component":{"componentType":"cell","picUrl":"http://s0.mingxingyichu.cn/group5/M00/55/97/wKgBf1hXSkqAIHWzAAEVOzQ4H6Q705.jpg","action":{"actionType":"topicDetail","id":"14954","title":"衣橱女装TOP榜","banner_id":"1169"},"title":"衣橱女装TOP榜","width":"616","height":"360"},"width":"616","height":"360"}],"appApi":"/region/detail/banner/get-prefecture-banner"}
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
         * items : [{"component":{"componentType":"cell","picUrl":"http://s0.mingxingyichu.cn/group5/M00/55/97/wKgBf1hXSkqAIHWzAAEVOzQ4H6Q705.jpg","action":{"actionType":"topicDetail","id":"14954","title":"衣橱女装TOP榜","banner_id":"1169"},"title":"衣橱女装TOP榜","width":"616","height":"360"},"width":"616","height":"360"}]
         * appApi : /region/detail/banner/get-prefecture-banner
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
             * component : {"componentType":"cell","picUrl":"http://s0.mingxingyichu.cn/group5/M00/55/97/wKgBf1hXSkqAIHWzAAEVOzQ4H6Q705.jpg","action":{"actionType":"topicDetail","id":"14954","title":"衣橱女装TOP榜","banner_id":"1169"},"title":"衣橱女装TOP榜","width":"616","height":"360"}
             * width : 616
             * height : 360
             */

            private ComponentBean component;
            private String width;
            private String height;

            public ComponentBean getComponent() {
                return component;
            }

            public void setComponent(ComponentBean component) {
                this.component = component;
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

            public static class ComponentBean {
                /**
                 * componentType : cell
                 * picUrl : http://s0.mingxingyichu.cn/group5/M00/55/97/wKgBf1hXSkqAIHWzAAEVOzQ4H6Q705.jpg
                 * action : {"actionType":"topicDetail","id":"14954","title":"衣橱女装TOP榜","banner_id":"1169"}
                 * title : 衣橱女装TOP榜
                 * width : 616
                 * height : 360
                 */

                private String componentType;
                private String picUrl;
                private ActionBean action;
                private String title;
                private String width;
                private String height;

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
                    /**
                     * actionType : topicDetail
                     * id : 14954
                     * title : 衣橱女装TOP榜
                     * banner_id : 1169
                     */

                    private String actionType;
                    private String id;
                    private String title;
                    private String banner_id;

                    public String getActionType() {
                        return actionType;
                    }

                    public void setActionType(String actionType) {
                        this.actionType = actionType;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }

                    public String getTitle() {
                        return title;
                    }

                    public void setTitle(String title) {
                        this.title = title;
                    }

                    public String getBanner_id() {
                        return banner_id;
                    }

                    public void setBanner_id(String banner_id) {
                        this.banner_id = banner_id;
                    }
                }
            }
        }
    }
}
