package com.yangshenglong.newstarwardrobe.classify;

import java.util.List;

/**
 * Created by CST on 16/12/21.
 */

public class SearchBean {



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


        private String flag;
        private String appApi;
        private List<ItemsBean> items;
        private List<TagsBean> tags;

        public String getFlag() {
            return flag;
        }

        public void setFlag(String flag) {
            this.flag = flag;
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

        public List<TagsBean> getTags() {
            return tags;
        }

        public void setTags(List<TagsBean> tags) {
            this.tags = tags;
        }

        public static class ItemsBean {
            /**
             * component : {"componentType":"item","publish_date":"2015","picUrl":"http://s1.mingxingyichu.cn/group5/M00/52/DB/wKgBfVhA8c6AGCJUAAAkxRbInD8245.jpg?imageMogr2/format/WEBP/thumbnail/320x%3E","price":"296","origin_price":"296","id":"4746350","goods_id":"216176","description":"STYLENANDA简约纯色字母刺绣圆领卫衣","trackValue":"item_sku_4746350","eventIcon":"","stateMessage":"","country":"韩国","nationalFlag":"http://s0.mingxingyichu.cn/group5/M00/13/A4/wKgBf1eqzY-AbnnDAAAEzaPE8rQ746.png","sales":"106","starCount":"8","action":{"actionType":"detail","type":"sku","id":"4746350","source":"ecshop","sourceId":"1353255","width":"360","height":"470","main_image":0,"collectionCount":"0","trackValue":"item_sku_4746350"},"collectionCount":"0"}
             * width : 360
             * height : 470
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
                 * componentType : item
                 * publish_date : 2015
                 * picUrl : http://s1.mingxingyichu.cn/group5/M00/52/DB/wKgBfVhA8c6AGCJUAAAkxRbInD8245.jpg?imageMogr2/format/WEBP/thumbnail/320x%3E
                 * price : 296
                 * origin_price : 296
                 * id : 4746350
                 * goods_id : 216176
                 * description : STYLENANDA简约纯色字母刺绣圆领卫衣
                 * trackValue : item_sku_4746350
                 * eventIcon :
                 * stateMessage :
                 * country : 韩国
                 * nationalFlag : http://s0.mingxingyichu.cn/group5/M00/13/A4/wKgBf1eqzY-AbnnDAAAEzaPE8rQ746.png
                 * sales : 106
                 * starCount : 8
                 * action : {"actionType":"detail","type":"sku","id":"4746350","source":"ecshop","sourceId":"1353255","width":"360","height":"470","main_image":0,"collectionCount":"0","trackValue":"item_sku_4746350"}
                 * collectionCount : 0
                 */

                private String componentType;
                private String publish_date;
                private String picUrl;
                private String price;
                private String origin_price;
                private String id;
                private String goods_id;
                private String description;
                private String trackValue;
                private String eventIcon;
                private String stateMessage;
                private String country;
                private String nationalFlag;
                private String sales;
                private String starCount;
                private ActionBean action;
                private String collectionCount;

                public String getComponentType() {
                    return componentType;
                }

                public void setComponentType(String componentType) {
                    this.componentType = componentType;
                }

                public String getPublish_date() {
                    return publish_date;
                }

                public void setPublish_date(String publish_date) {
                    this.publish_date = publish_date;
                }

                public String getPicUrl() {
                    return picUrl;
                }

                public void setPicUrl(String picUrl) {
                    this.picUrl = picUrl;
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

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getGoods_id() {
                    return goods_id;
                }

                public void setGoods_id(String goods_id) {
                    this.goods_id = goods_id;
                }

                public String getDescription() {
                    return description;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                public String getTrackValue() {
                    return trackValue;
                }

                public void setTrackValue(String trackValue) {
                    this.trackValue = trackValue;
                }

                public String getEventIcon() {
                    return eventIcon;
                }

                public void setEventIcon(String eventIcon) {
                    this.eventIcon = eventIcon;
                }

                public String getStateMessage() {
                    return stateMessage;
                }

                public void setStateMessage(String stateMessage) {
                    this.stateMessage = stateMessage;
                }

                public String getCountry() {
                    return country;
                }

                public void setCountry(String country) {
                    this.country = country;
                }

                public String getNationalFlag() {
                    return nationalFlag;
                }

                public void setNationalFlag(String nationalFlag) {
                    this.nationalFlag = nationalFlag;
                }

                public String getSales() {
                    return sales;
                }

                public void setSales(String sales) {
                    this.sales = sales;
                }

                public String getStarCount() {
                    return starCount;
                }

                public void setStarCount(String starCount) {
                    this.starCount = starCount;
                }

                public ActionBean getAction() {
                    return action;
                }

                public void setAction(ActionBean action) {
                    this.action = action;
                }

                public String getCollectionCount() {
                    return collectionCount;
                }

                public void setCollectionCount(String collectionCount) {
                    this.collectionCount = collectionCount;
                }

                public static class ActionBean {
                    /**
                     * actionType : detail
                     * type : sku
                     * id : 4746350
                     * source : ecshop
                     * sourceId : 1353255
                     * width : 360
                     * height : 470
                     * main_image : 0
                     * collectionCount : 0
                     * trackValue : item_sku_4746350
                     */

                    private String actionType;
                    private String type;
                    private String id;
                    private String source;
                    private String sourceId;
                    private String width;
                    private String height;
                    private int main_image;
                    private String collectionCount;
                    private String trackValue;

                    public String getActionType() {
                        return actionType;
                    }

                    public void setActionType(String actionType) {
                        this.actionType = actionType;
                    }

                    public String getType() {
                        return type;
                    }

                    public void setType(String type) {
                        this.type = type;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }

                    public String getSource() {
                        return source;
                    }

                    public void setSource(String source) {
                        this.source = source;
                    }

                    public String getSourceId() {
                        return sourceId;
                    }

                    public void setSourceId(String sourceId) {
                        this.sourceId = sourceId;
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

                    public int getMain_image() {
                        return main_image;
                    }

                    public void setMain_image(int main_image) {
                        this.main_image = main_image;
                    }

                    public String getCollectionCount() {
                        return collectionCount;
                    }

                    public void setCollectionCount(String collectionCount) {
                        this.collectionCount = collectionCount;
                    }

                    public String getTrackValue() {
                        return trackValue;
                    }

                    public void setTrackValue(String trackValue) {
                        this.trackValue = trackValue;
                    }
                }
            }
        }

        public static class TagsBean {
            /**
             * text : 连帽
             * color : 27,27,29,255
             * picUrl : http://mxycsku.u.qiniudn.com/group1/M00/96/7A/wKgBWFPu8AeAPVRSAAc32L26Mz8081.jpg
             */

            private String text;
            private String color;
            private String picUrl;

            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
            }

            public String getColor() {
                return color;
            }

            public void setColor(String color) {
                this.color = color;
            }

            public String getPicUrl() {
                return picUrl;
            }

            public void setPicUrl(String picUrl) {
                this.picUrl = picUrl;
            }
        }
    }
}
