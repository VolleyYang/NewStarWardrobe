package com.yangshenglong.newstarwardrobe.fashion.levelpage.recommend;

import java.util.List;

/**
 * Created by VolleyYang on 16/12/21.
 */

public class RecommendGvBean {

    /**
     * response : {"code":"0","msg":"","isNew":1,"version":"","data":{"items":[{"width":"230","height":"144","is_top":0,"component":{"componentType":"labelCell","picUrl":"http://s4.mingxingyichu.cn/group6/M00/9C/41/wKgBjVgsFtuAFxInAAB_l5-6yRA942.jpg?imageMogr2?imageMogr2?imageMogr2","action":{"actionType":"tag","type":"forum","id":"526","tag":"潮流搭配","title":"#搭配","banner_id":"27"},"title":"#搭配","width":"230","height":"144"}},{"width":"230","height":"144","is_top":0,"component":{"componentType":"labelCell","picUrl":"http://s0.mingxingyichu.cn/group5/M00/51/FE/wKgBfVgsFuyAFImQAACPct94MD8083.jpg?imageMogr2?imageMogr2?imageMogr2","action":{"actionType":"tag","type":"forum","id":"527","tag":"衣橱杂志","title":"#专题","banner_id":"26"},"title":"#专题","width":"230","height":"144"}},{"width":"230","height":"144","is_top":0,"component":{"componentType":"labelCell","picUrl":"http://s4.mingxingyichu.cn/group5/M00/69/2F/wKgBfVfOebKAYa1nAABpzwVHsZA822.jpg?imageMogr2?imageMogr2?imageMogr2","action":{"actionType":"tag","type":"forum","id":"236","tag":"漫画","title":"#漫画","banner_id":"157"},"title":"#漫画","width":"230","height":"144"}},{"width":"230","height":"144","is_top":0,"component":{"componentType":"labelCell","picUrl":"http://mxycsku.mingxingyichu.cn/group6/M00/82/4E/wKgBjVe-VoqALoKwAABJkOnogcg391.jpg?imageMogr2?imageMogr2?imageMogr2","action":{"actionType":"tag","type":"forum","id":"66","tag":"美白","title":"#美白","banner_id":"30"},"title":"#美白","width":"230","height":"144"}},{"width":"230","height":"144","is_top":0,"component":{"componentType":"labelCell","picUrl":"http://s4.mingxingyichu.cn/group6/M00/82/45/wKgBjFe-VvGAb-eAAABpxLBZKPk092.jpg?imageMogr2?imageMogr2?imageMogr2","action":{"actionType":"tag","type":"forum","id":"204","tag":"高圆圆","title":"#高圆圆","banner_id":"63"},"title":"#高圆圆","width":"230","height":"144"}},{"width":"230","height":"144","is_top":0,"component":{"componentType":"labelCell","picUrl":"http://mxycsku.mingxingyichu.cn/group6/M00/93/9A/wKgBjVfYzfuAdHn9AABpnP3Jmr0923.jpg?imageMogr2?imageMogr2?imageMogr2","action":{"actionType":"tag","type":"forum","id":"490","tag":"袁姗姗","title":"#袁姗姗","banner_id":"207"},"title":"#袁姗姗","width":"230","height":"144"}}]}}
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
         * data : {"items":[{"width":"230","height":"144","is_top":0,"component":{"componentType":"labelCell","picUrl":"http://s4.mingxingyichu.cn/group6/M00/9C/41/wKgBjVgsFtuAFxInAAB_l5-6yRA942.jpg?imageMogr2?imageMogr2?imageMogr2","action":{"actionType":"tag","type":"forum","id":"526","tag":"潮流搭配","title":"#搭配","banner_id":"27"},"title":"#搭配","width":"230","height":"144"}},{"width":"230","height":"144","is_top":0,"component":{"componentType":"labelCell","picUrl":"http://s0.mingxingyichu.cn/group5/M00/51/FE/wKgBfVgsFuyAFImQAACPct94MD8083.jpg?imageMogr2?imageMogr2?imageMogr2","action":{"actionType":"tag","type":"forum","id":"527","tag":"衣橱杂志","title":"#专题","banner_id":"26"},"title":"#专题","width":"230","height":"144"}},{"width":"230","height":"144","is_top":0,"component":{"componentType":"labelCell","picUrl":"http://s4.mingxingyichu.cn/group5/M00/69/2F/wKgBfVfOebKAYa1nAABpzwVHsZA822.jpg?imageMogr2?imageMogr2?imageMogr2","action":{"actionType":"tag","type":"forum","id":"236","tag":"漫画","title":"#漫画","banner_id":"157"},"title":"#漫画","width":"230","height":"144"}},{"width":"230","height":"144","is_top":0,"component":{"componentType":"labelCell","picUrl":"http://mxycsku.mingxingyichu.cn/group6/M00/82/4E/wKgBjVe-VoqALoKwAABJkOnogcg391.jpg?imageMogr2?imageMogr2?imageMogr2","action":{"actionType":"tag","type":"forum","id":"66","tag":"美白","title":"#美白","banner_id":"30"},"title":"#美白","width":"230","height":"144"}},{"width":"230","height":"144","is_top":0,"component":{"componentType":"labelCell","picUrl":"http://s4.mingxingyichu.cn/group6/M00/82/45/wKgBjFe-VvGAb-eAAABpxLBZKPk092.jpg?imageMogr2?imageMogr2?imageMogr2","action":{"actionType":"tag","type":"forum","id":"204","tag":"高圆圆","title":"#高圆圆","banner_id":"63"},"title":"#高圆圆","width":"230","height":"144"}},{"width":"230","height":"144","is_top":0,"component":{"componentType":"labelCell","picUrl":"http://mxycsku.mingxingyichu.cn/group6/M00/93/9A/wKgBjVfYzfuAdHn9AABpnP3Jmr0923.jpg?imageMogr2?imageMogr2?imageMogr2","action":{"actionType":"tag","type":"forum","id":"490","tag":"袁姗姗","title":"#袁姗姗","banner_id":"207"},"title":"#袁姗姗","width":"230","height":"144"}}]}
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
            private List<ItemsBean> items;

            public List<ItemsBean> getItems() {
                return items;
            }

            public void setItems(List<ItemsBean> items) {
                this.items = items;
            }

            public static class ItemsBean {
                /**
                 * width : 230
                 * height : 144
                 * is_top : 0
                 * component : {"componentType":"labelCell","picUrl":"http://s4.mingxingyichu.cn/group6/M00/9C/41/wKgBjVgsFtuAFxInAAB_l5-6yRA942.jpg?imageMogr2?imageMogr2?imageMogr2","action":{"actionType":"tag","type":"forum","id":"526","tag":"潮流搭配","title":"#搭配","banner_id":"27"},"title":"#搭配","width":"230","height":"144"}
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
                     * componentType : labelCell
                     * picUrl : http://s4.mingxingyichu.cn/group6/M00/9C/41/wKgBjVgsFtuAFxInAAB_l5-6yRA942.jpg?imageMogr2?imageMogr2?imageMogr2
                     * action : {"actionType":"tag","type":"forum","id":"526","tag":"潮流搭配","title":"#搭配","banner_id":"27"}
                     * title : #搭配
                     * width : 230
                     * height : 144
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
                         * actionType : tag
                         * type : forum
                         * id : 526
                         * tag : 潮流搭配
                         * title : #搭配
                         * banner_id : 27
                         */

                        private String actionType;
                        private String type;
                        private String id;
                        private String tag;
                        private String title;
                        private String banner_id;

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

                        public String getTag() {
                            return tag;
                        }

                        public void setTag(String tag) {
                            this.tag = tag;
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
}
