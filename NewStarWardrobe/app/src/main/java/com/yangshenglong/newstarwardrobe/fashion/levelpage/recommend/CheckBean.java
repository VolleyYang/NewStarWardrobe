package com.yangshenglong.newstarwardrobe.fashion.levelpage.recommend;

import java.util.List;

/**
 * Created by VolleyYang on 16/12/23.
 */

public class CheckBean {


    /**
     * message :
     * data : {"items":[{"width":"750","height":"280","is_top":0,"component":{"componentType":"cell","picUrl":"http://s6.mingxingyichu.cn/group5/M00/55/DA/wKgBf1hcvByAYrCNAAFvZD6Bsek320.jpg?imageMogr2?imageMogr2?imageMogr2","action":{"unixtime":1482472458,"actionType":"detail","type":"thread","id":"495241","title":"-靳东演盗墓一脸萌比","banner_id":"2101","track":{"eventname":"fashion_banner_c","fashion_tab":"滑动广告位","position":1,"fashion_banner_id":"2101"}},"title":"-靳东演盗墓一脸萌比","width":"750","height":"280"}},{"width":"750","height":"280","is_top":0,"component":{"componentType":"cell","picUrl":"http://s5.mingxingyichu.cn/group6/M00/9D/A9/wKgBjFhQsN6AKCA0AAJ6z-49n0U988.jpg?imageMogr2?imageMogr2?imageMogr2","action":{"unixtime":1482444007,"actionType":"detail","type":"thread","id":"493030","title":"再没借口不吃早餐","banner_id":"1867","track":{"eventname":"fashion_banner_c","fashion_tab":"滑动广告位","position":2,"fashion_banner_id":"1867"}},"title":"再没借口不吃早餐","width":"750","height":"280"}},{"width":"750","height":"280","is_top":0,"component":{"componentType":"cell","picUrl":"http://s1.mingxingyichu.cn/group6/M00/9D/A8/wKgBjFhQsLSAaAviAAJECN8WTdU044.jpg?imageMogr2?imageMogr2?imageMogr2","action":{"unixtime":1482357625,"actionType":"detail","type":"thread","id":"492076","title":"-还在痴迷唇膏？","banner_id":"1866","track":{"eventname":"fashion_banner_c","fashion_tab":"滑动广告位","position":3,"fashion_banner_id":"1866"}},"title":"-还在痴迷唇膏？","width":"750","height":"280"}},{"width":"750","height":"280","is_top":0,"component":{"componentType":"cell","picUrl":"http://s2.mingxingyichu.cn/group5/M00/53/13/wKgBfVhHdNeAC1-KAAFZpDNeIQc748.jpg?imageMogr2?imageMogr2?imageMogr2","action":{"unixtime":1482444030,"actionType":"detail","type":"thread","id":"491602","title":"-减肥就从这里开始","banner_id":"1737","track":{"eventname":"fashion_banner_c","fashion_tab":"滑动广告位","position":4,"fashion_banner_id":"1737"}},"title":"-减肥就从这里开始","width":"750","height":"280"}},{"width":"750","height":"280","is_top":0,"component":{"componentType":"cell","picUrl":"http://s1.mingxingyichu.cn/group5/M00/55/01/wKgBf1hHdK-ALlsBAAKfPzPGCTk300.jpg?imageMogr2?imageMogr2?imageMogr2","action":{"unixtime":1482444050,"actionType":"detail","type":"thread","id":"491572","title":"-沈梦辰在女神路上越走越远","banner_id":"1736","track":{"eventname":"fashion_banner_c","fashion_tab":"滑动广告位","position":5,"fashion_banner_id":"1736"}},"title":"-沈梦辰在女神路上越走越远","width":"750","height":"280"}},{"width":"750","height":"280","is_top":0,"component":{"componentType":"cell","picUrl":"http://s2.mingxingyichu.cn/group5/M00/55/01/wKgBf1hHdImACnvFAAH6m0qqPQg007.jpg?imageMogr2?imageMogr2?imageMogr2","action":{"unixtime":1482357611,"actionType":"detail","type":"thread","id":"487534","title":"-羊羔毛大衣还没入手？","banner_id":"1735","track":{"eventname":"fashion_banner_c","fashion_tab":"滑动广告位","position":6,"fashion_banner_id":"1735"}},"title":"-羊羔毛大衣还没入手？","width":"750","height":"280"}}],"appApi":"/forum/banner"}
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
         * items : [{"width":"750","height":"280","is_top":0,"component":{"componentType":"cell","picUrl":"http://s6.mingxingyichu.cn/group5/M00/55/DA/wKgBf1hcvByAYrCNAAFvZD6Bsek320.jpg?imageMogr2?imageMogr2?imageMogr2","action":{"unixtime":1482472458,"actionType":"detail","type":"thread","id":"495241","title":"-靳东演盗墓一脸萌比","banner_id":"2101","track":{"eventname":"fashion_banner_c","fashion_tab":"滑动广告位","position":1,"fashion_banner_id":"2101"}},"title":"-靳东演盗墓一脸萌比","width":"750","height":"280"}},{"width":"750","height":"280","is_top":0,"component":{"componentType":"cell","picUrl":"http://s5.mingxingyichu.cn/group6/M00/9D/A9/wKgBjFhQsN6AKCA0AAJ6z-49n0U988.jpg?imageMogr2?imageMogr2?imageMogr2","action":{"unixtime":1482444007,"actionType":"detail","type":"thread","id":"493030","title":"再没借口不吃早餐","banner_id":"1867","track":{"eventname":"fashion_banner_c","fashion_tab":"滑动广告位","position":2,"fashion_banner_id":"1867"}},"title":"再没借口不吃早餐","width":"750","height":"280"}},{"width":"750","height":"280","is_top":0,"component":{"componentType":"cell","picUrl":"http://s1.mingxingyichu.cn/group6/M00/9D/A8/wKgBjFhQsLSAaAviAAJECN8WTdU044.jpg?imageMogr2?imageMogr2?imageMogr2","action":{"unixtime":1482357625,"actionType":"detail","type":"thread","id":"492076","title":"-还在痴迷唇膏？","banner_id":"1866","track":{"eventname":"fashion_banner_c","fashion_tab":"滑动广告位","position":3,"fashion_banner_id":"1866"}},"title":"-还在痴迷唇膏？","width":"750","height":"280"}},{"width":"750","height":"280","is_top":0,"component":{"componentType":"cell","picUrl":"http://s2.mingxingyichu.cn/group5/M00/53/13/wKgBfVhHdNeAC1-KAAFZpDNeIQc748.jpg?imageMogr2?imageMogr2?imageMogr2","action":{"unixtime":1482444030,"actionType":"detail","type":"thread","id":"491602","title":"-减肥就从这里开始","banner_id":"1737","track":{"eventname":"fashion_banner_c","fashion_tab":"滑动广告位","position":4,"fashion_banner_id":"1737"}},"title":"-减肥就从这里开始","width":"750","height":"280"}},{"width":"750","height":"280","is_top":0,"component":{"componentType":"cell","picUrl":"http://s1.mingxingyichu.cn/group5/M00/55/01/wKgBf1hHdK-ALlsBAAKfPzPGCTk300.jpg?imageMogr2?imageMogr2?imageMogr2","action":{"unixtime":1482444050,"actionType":"detail","type":"thread","id":"491572","title":"-沈梦辰在女神路上越走越远","banner_id":"1736","track":{"eventname":"fashion_banner_c","fashion_tab":"滑动广告位","position":5,"fashion_banner_id":"1736"}},"title":"-沈梦辰在女神路上越走越远","width":"750","height":"280"}},{"width":"750","height":"280","is_top":0,"component":{"componentType":"cell","picUrl":"http://s2.mingxingyichu.cn/group5/M00/55/01/wKgBf1hHdImACnvFAAH6m0qqPQg007.jpg?imageMogr2?imageMogr2?imageMogr2","action":{"unixtime":1482357611,"actionType":"detail","type":"thread","id":"487534","title":"-羊羔毛大衣还没入手？","banner_id":"1735","track":{"eventname":"fashion_banner_c","fashion_tab":"滑动广告位","position":6,"fashion_banner_id":"1735"}},"title":"-羊羔毛大衣还没入手？","width":"750","height":"280"}}]
         * appApi : /forum/banner
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
             * height : 280
             * is_top : 0
             * component : {"componentType":"cell","picUrl":"http://s6.mingxingyichu.cn/group5/M00/55/DA/wKgBf1hcvByAYrCNAAFvZD6Bsek320.jpg?imageMogr2?imageMogr2?imageMogr2","action":{"unixtime":1482472458,"actionType":"detail","type":"thread","id":"495241","title":"-靳东演盗墓一脸萌比","banner_id":"2101","track":{"eventname":"fashion_banner_c","fashion_tab":"滑动广告位","position":1,"fashion_banner_id":"2101"}},"title":"-靳东演盗墓一脸萌比","width":"750","height":"280"}
             */

            private String width;
            private String height;
            private int is_top;
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

            public int getIs_top() {
                return is_top;
            }

            public void setIs_top(int is_top) {
                this.is_top = is_top;
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
                 * picUrl : http://s6.mingxingyichu.cn/group5/M00/55/DA/wKgBf1hcvByAYrCNAAFvZD6Bsek320.jpg?imageMogr2?imageMogr2?imageMogr2
                 * action : {"unixtime":1482472458,"actionType":"detail","type":"thread","id":"495241","title":"-靳东演盗墓一脸萌比","banner_id":"2101","track":{"eventname":"fashion_banner_c","fashion_tab":"滑动广告位","position":1,"fashion_banner_id":"2101"}}
                 * title : -靳东演盗墓一脸萌比
                 * width : 750
                 * height : 280
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
                     * unixtime : 1482472458
                     * actionType : detail
                     * type : thread
                     * id : 495241
                     * title : -靳东演盗墓一脸萌比
                     * banner_id : 2101
                     * track : {"eventname":"fashion_banner_c","fashion_tab":"滑动广告位","position":1,"fashion_banner_id":"2101"}
                     */

                    private int unixtime;
                    private String actionType;
                    private String type;
                    private String id;
                    private String title;
                    private String banner_id;
                    private TrackBean track;

                    public int getUnixtime() {
                        return unixtime;
                    }

                    public void setUnixtime(int unixtime) {
                        this.unixtime = unixtime;
                    }

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

                    public TrackBean getTrack() {
                        return track;
                    }

                    public void setTrack(TrackBean track) {
                        this.track = track;
                    }

                    public static class TrackBean {
                        /**
                         * eventname : fashion_banner_c
                         * fashion_tab : 滑动广告位
                         * position : 1
                         * fashion_banner_id : 2101
                         */

                        private String eventname;
                        private String fashion_tab;
                        private int position;
                        private String fashion_banner_id;

                        public String getEventname() {
                            return eventname;
                        }

                        public void setEventname(String eventname) {
                            this.eventname = eventname;
                        }

                        public String getFashion_tab() {
                            return fashion_tab;
                        }

                        public void setFashion_tab(String fashion_tab) {
                            this.fashion_tab = fashion_tab;
                        }

                        public int getPosition() {
                            return position;
                        }

                        public void setPosition(int position) {
                            this.position = position;
                        }

                        public String getFashion_banner_id() {
                            return fashion_banner_id;
                        }

                        public void setFashion_banner_id(String fashion_banner_id) {
                            this.fashion_banner_id = fashion_banner_id;
                        }
                    }
                }
            }
        }
    }
}
