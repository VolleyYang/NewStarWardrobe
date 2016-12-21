package com.yangshenglong.newstarwardrobe.fashion.levelpage.recommend;

import java.util.List;

/**
 * Created by VolleyYang on 16/12/20.
 */

public class RecommendBean {


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
            private String last_item_id;
            private String tips;
            private List<ItemsBean> items;

            public String getFlag() {
                return flag;
            }

            public void setFlag(String flag) {
                this.flag = flag;
            }

            public String getLast_item_id() {
                return last_item_id;
            }

            public void setLast_item_id(String last_item_id) {
                this.last_item_id = last_item_id;
            }

            public String getTips() {
                return tips;
            }

            public void setTips(String tips) {
                this.tips = tips;
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

                    private String componentType;
                    private String picUrl;
                    private ActionBean action;
                    private String title;
                    private String width;
                    private String height;
                    private UserBean user;
                    private String content;
                    private String pics;
                    private String collect_count;

                    public String getCollect_count() {
                        return collect_count;
                    }

                    public void setCollect_count(String collect_count) {
                        this.collect_count = collect_count;
                    }

                    public String getContent() {
                        return content;
                    }

                    public void setContent(String content) {
                        this.content = content;
                    }

                    public String getPics() {
                        return pics;
                    }

                    public void setPics(String pics) {
                        this.pics = pics;
                    }

                    public UserBean getUser() {
                        return user;
                    }

                    public void setUser(UserBean user) {
                        this.user = user;
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

                    public static class UserBean{

                        private String  userAvatar;
                        private String username;
                        private String  userId;

                        public String getUserAvatar() {
                            return userAvatar;
                        }

                        public void setUserAvatar(String userAvatar) {
                            this.userAvatar = userAvatar;
                        }

                        public String getUsername() {
                            return username;
                        }

                        public void setUsername(String username) {
                            this.username = username;
                        }

                        public String getUserId() {
                            return userId;
                        }

                        public void setUserId(String userId) {
                            this.userId = userId;
                        }
                    }

                    public static class ActionBean {

                        private int unixtime;
                        private String actionType;
                        private String type;
                        private String id;
                        private String title;
                        private String banner_id;

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
                    }
                }
            }
        }
    }
}
