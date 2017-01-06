package com.yangshenglong.newstarwardrobe.shopping.bean;

import java.util.List;

/**
 * Created by xiaoBu on 16/12/21.
 * 中国馆 品牌推荐 行布局2
 */

public class ChinaDataBrand {

    // http://api-v2.mall.hichao.com/region/detail/brands/prefecture-promotion?ga=%2Fregion%2Fdetail%2Fbrands%2Fprefecture-promotion&id=3

    /**
     * message :
     * data : {"items":[{"component":{"componentType":"cell","picUrl":"http://s0.mingxingyichu.cn/group6/M00/9B/B5/wKgBjFgkH02ADXKQAABIugVa_7E798.jpg","action":{"actionType":"ecshopSearch","id":"381","title":"","banner_id":"1108"},"title":"","width":"200","height":"200"},"width":"200","height":"200"},{"component":{"componentType":"cell","picUrl":"http://s0.mingxingyichu.cn/group6/M00/9D/17/wKgBjVhA2smAItkAAAA-h80Uuvo984.jpg","action":{"actionType":"ecshopSearch","id":"2302","title":"","banner_id":"1109"},"title":"","width":"200","height":"200"},"width":"200","height":"200"},{"component":{"componentType":"cell","picUrl":"http://s0.mingxingyichu.cn/group6/M00/9D/EE/wKgBjVhXjQmAZkr9AAB9s6Mjo1o970.jpg","action":{"actionType":"ecshopSearch","id":"3034","title":"","banner_id":"1110"},"title":"","width":"200","height":"200"},"width":"200","height":"200"}],"title":"优质品牌推荐","appApi":"/region/detail/brands/prefecture-promotion"}
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
         * items : [{"component":{"componentType":"cell","picUrl":"http://s0.mingxingyichu.cn/group6/M00/9B/B5/wKgBjFgkH02ADXKQAABIugVa_7E798.jpg","action":{"actionType":"ecshopSearch","id":"381","title":"","banner_id":"1108"},"title":"","width":"200","height":"200"},"width":"200","height":"200"},{"component":{"componentType":"cell","picUrl":"http://s0.mingxingyichu.cn/group6/M00/9D/17/wKgBjVhA2smAItkAAAA-h80Uuvo984.jpg","action":{"actionType":"ecshopSearch","id":"2302","title":"","banner_id":"1109"},"title":"","width":"200","height":"200"},"width":"200","height":"200"},{"component":{"componentType":"cell","picUrl":"http://s0.mingxingyichu.cn/group6/M00/9D/EE/wKgBjVhXjQmAZkr9AAB9s6Mjo1o970.jpg","action":{"actionType":"ecshopSearch","id":"3034","title":"","banner_id":"1110"},"title":"","width":"200","height":"200"},"width":"200","height":"200"}]
         * title : 优质品牌推荐
         * appApi : /region/detail/brands/prefecture-promotion
         */

        private String title;
        private String appApi;
        private List<ItemsBean> items;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

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
             * component : {"componentType":"cell","picUrl":"http://s0.mingxingyichu.cn/group6/M00/9B/B5/wKgBjFgkH02ADXKQAABIugVa_7E798.jpg","action":{"actionType":"ecshopSearch","id":"381","title":"","banner_id":"1108"},"title":"","width":"200","height":"200"}
             * width : 200
             * height : 200
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
                 * picUrl : http://s0.mingxingyichu.cn/group6/M00/9B/B5/wKgBjFgkH02ADXKQAABIugVa_7E798.jpg
                 * action : {"actionType":"ecshopSearch","id":"381","title":"","banner_id":"1108"}
                 * title :
                 * width : 200
                 * height : 200
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
                     * actionType : ecshopSearch
                     * id : 381
                     * title :
                     * banner_id : 1108
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
