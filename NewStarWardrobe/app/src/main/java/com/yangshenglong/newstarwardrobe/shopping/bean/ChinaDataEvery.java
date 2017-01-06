package com.yangshenglong.newstarwardrobe.shopping.bean;

import java.util.List;

/**
 * Created by xiaoBu on 16/12/21.
 * 中国馆 每日抢手货 行布局3 (此数据url未知, 无法进行解析!!!)
 */

public class ChinaDataEvery {


    /**
     * message :
     * data : {"items":[{"width":750,"height":480,"component":{"stateMessage":"","description":"TTCOLOR2016秋冬新款撞色格子针织上衣","price":"155.00","origin_price":"259.00","componentType":"region_today_cell","title":"TTCOLOR 撞色格子针织上衣","picUrl":"http://s0.mingxingyichu.cn/group5/M00/55/9B/wKgBf1hXhHaAbloBAAEDLpfFSCY995.jpg","goods_id":"1253254","sales":"","introduce":"减龄学院风 chic百搭","action":{"actionType":"detail","source":"ecshop","sourceId":"2601864","main_image":"0","type":"sku","sales":"","banner_id":"1882","track":{"eventname":"shop_banner_c","shop_tab":"今日抢手货","banner_id":"1882","position":1}}}},{"width":750,"height":480,"component":{"stateMessage":"","description":"晨品 2016秋冬韩版新款舒适圆头厚底内增高百搭系带短筒女靴","price":"339.00","origin_price":"598.00","componentType":"region_today_cell","title":"晨品 韩版新款内增高女靴","picUrl":"http://s0.mingxingyichu.cn/group5/M00/53/79/wKgBfVhQ6GaAHAgPAADdbOs0fEw967.jpg","goods_id":"1246516","sales":"","introduce":"舒适圆头 时尚百搭","action":{"actionType":"detail","source":"ecshop","sourceId":"2590282","main_image":"0","type":"sku","sales":"","banner_id":"1884","track":{"eventname":"shop_banner_c","shop_tab":"今日抢手货","banner_id":"1884","position":2}}}}],"appApi":"/region/detail/daily-goods"}
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
         * items : [{"width":750,"height":480,"component":{"stateMessage":"","description":"TTCOLOR2016秋冬新款撞色格子针织上衣","price":"155.00","origin_price":"259.00","componentType":"region_today_cell","title":"TTCOLOR 撞色格子针织上衣","picUrl":"http://s0.mingxingyichu.cn/group5/M00/55/9B/wKgBf1hXhHaAbloBAAEDLpfFSCY995.jpg","goods_id":"1253254","sales":"","introduce":"减龄学院风 chic百搭","action":{"actionType":"detail","source":"ecshop","sourceId":"2601864","main_image":"0","type":"sku","sales":"","banner_id":"1882","track":{"eventname":"shop_banner_c","shop_tab":"今日抢手货","banner_id":"1882","position":1}}}},{"width":750,"height":480,"component":{"stateMessage":"","description":"晨品 2016秋冬韩版新款舒适圆头厚底内增高百搭系带短筒女靴","price":"339.00","origin_price":"598.00","componentType":"region_today_cell","title":"晨品 韩版新款内增高女靴","picUrl":"http://s0.mingxingyichu.cn/group5/M00/53/79/wKgBfVhQ6GaAHAgPAADdbOs0fEw967.jpg","goods_id":"1246516","sales":"","introduce":"舒适圆头 时尚百搭","action":{"actionType":"detail","source":"ecshop","sourceId":"2590282","main_image":"0","type":"sku","sales":"","banner_id":"1884","track":{"eventname":"shop_banner_c","shop_tab":"今日抢手货","banner_id":"1884","position":2}}}}]
         * appApi : /region/detail/daily-goods
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
             * width : 750
             * height : 480
             * component : {"stateMessage":"","description":"TTCOLOR2016秋冬新款撞色格子针织上衣","price":"155.00","origin_price":"259.00","componentType":"region_today_cell","title":"TTCOLOR 撞色格子针织上衣","picUrl":"http://s0.mingxingyichu.cn/group5/M00/55/9B/wKgBf1hXhHaAbloBAAEDLpfFSCY995.jpg","goods_id":"1253254","sales":"","introduce":"减龄学院风 chic百搭","action":{"actionType":"detail","source":"ecshop","sourceId":"2601864","main_image":"0","type":"sku","sales":"","banner_id":"1882","track":{"eventname":"shop_banner_c","shop_tab":"今日抢手货","banner_id":"1882","position":1}}}
             */

            private int width;
            private int height;
            private ComponentBean component;

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
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
                 * stateMessage :
                 * description : TTCOLOR2016秋冬新款撞色格子针织上衣
                 * price : 155.00
                 * origin_price : 259.00
                 * componentType : region_today_cell
                 * title : TTCOLOR 撞色格子针织上衣
                 * picUrl : http://s0.mingxingyichu.cn/group5/M00/55/9B/wKgBf1hXhHaAbloBAAEDLpfFSCY995.jpg
                 * goods_id : 1253254
                 * sales :
                 * introduce : 减龄学院风 chic百搭
                 * action : {"actionType":"detail","source":"ecshop","sourceId":"2601864","main_image":"0","type":"sku","sales":"","banner_id":"1882","track":{"eventname":"shop_banner_c","shop_tab":"今日抢手货","banner_id":"1882","position":1}}
                 */

                private String stateMessage;
                private String description;
                private String price;
                private String origin_price;
                private String componentType;
                private String title;
                private String picUrl;
                private String goods_id;
                private String sales;
                private String introduce;
                private ActionBean action;

                public String getStateMessage() {
                    return stateMessage;
                }

                public void setStateMessage(String stateMessage) {
                    this.stateMessage = stateMessage;
                }

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

                public String getComponentType() {
                    return componentType;
                }

                public void setComponentType(String componentType) {
                    this.componentType = componentType;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getPicUrl() {
                    return picUrl;
                }

                public void setPicUrl(String picUrl) {
                    this.picUrl = picUrl;
                }

                public String getGoods_id() {
                    return goods_id;
                }

                public void setGoods_id(String goods_id) {
                    this.goods_id = goods_id;
                }

                public String getSales() {
                    return sales;
                }

                public void setSales(String sales) {
                    this.sales = sales;
                }

                public String getIntroduce() {
                    return introduce;
                }

                public void setIntroduce(String introduce) {
                    this.introduce = introduce;
                }

                public ActionBean getAction() {
                    return action;
                }

                public void setAction(ActionBean action) {
                    this.action = action;
                }

                public static class ActionBean {
                    /**
                     * actionType : detail
                     * source : ecshop
                     * sourceId : 2601864
                     * main_image : 0
                     * type : sku
                     * sales :
                     * banner_id : 1882
                     * track : {"eventname":"shop_banner_c","shop_tab":"今日抢手货","banner_id":"1882","position":1}
                     */

                    private String actionType;
                    private String source;
                    private String sourceId;
                    private String main_image;
                    private String type;
                    private String sales;
                    private String banner_id;
                    private TrackBean track;

                    public String getActionType() {
                        return actionType;
                    }

                    public void setActionType(String actionType) {
                        this.actionType = actionType;
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

                    public String getMain_image() {
                        return main_image;
                    }

                    public void setMain_image(String main_image) {
                        this.main_image = main_image;
                    }

                    public String getType() {
                        return type;
                    }

                    public void setType(String type) {
                        this.type = type;
                    }

                    public String getSales() {
                        return sales;
                    }

                    public void setSales(String sales) {
                        this.sales = sales;
                    }

                    public String getBanner_id() {
                        return banner_id;
                    }

                    public void setBanner_id(String banner_id) {
                        this.banner_id = banner_id;
                    }

                    public TrackBean getTrack() {
                        return track;
                    }

                    public void setTrack(TrackBean track) {
                        this.track = track;
                    }

                    public static class TrackBean {
                        /**
                         * eventname : shop_banner_c
                         * shop_tab : 今日抢手货
                         * banner_id : 1882
                         * position : 1
                         */

                        private String eventname;
                        private String shop_tab;
                        private String banner_id;
                        private int position;

                        public String getEventname() {
                            return eventname;
                        }

                        public void setEventname(String eventname) {
                            this.eventname = eventname;
                        }

                        public String getShop_tab() {
                            return shop_tab;
                        }

                        public void setShop_tab(String shop_tab) {
                            this.shop_tab = shop_tab;
                        }

                        public String getBanner_id() {
                            return banner_id;
                        }

                        public void setBanner_id(String banner_id) {
                            this.banner_id = banner_id;
                        }

                        public int getPosition() {
                            return position;
                        }

                        public void setPosition(int position) {
                            this.position = position;
                        }
                    }
                }
            }
        }
    }
}
