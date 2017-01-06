package com.yangshenglong.newstarwardrobe.shopping.bean;

import java.util.List;

/**
 * Created by xiaoBu on 16/12/21.
 * 全部Tab--下方内容数据 (自行添加字段)
 */

public class AllDataContent {

    // http://api-v2.mall.hichao.com/sku/list/bind-banner?flag=&ga=%2Fsku%2Flist%2Fbind-banner

    private ResponseBean response;

    public ResponseBean getResponse() {
        return response;
    }

    public void setResponse(ResponseBean response) {
        this.response = response;
    }

    public static class ResponseBean {


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
