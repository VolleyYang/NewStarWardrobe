package com.yangshenglong.newstarwardrobe.search.redmen;

import java.util.List;

/**
 * Created by CST on 16/12/24.
 */

public class RedMenLikeBean {



    private ResponseBean response;

    public ResponseBean getResponse() {
        return response;
    }

    public void setResponse(ResponseBean response) {
        this.response = response;
    }

    public static class ResponseBean {


        private int code;
        private String msg;
        private int isNew;
        private String version;
        private DataBean data;

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
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
                    private String datatime;
                    private UserBean user;
                    private String userId;
                    private String content;
                    private String id;
                    private String pics;
                    private ActionBeanX action;
                    private String is_live;
                    private String live_status;
                    private String live_view_count;
                    private String is_collect;
                    private String collect_count;

                    public String getComponentType() {
                        return componentType;
                    }

                    public void setComponentType(String componentType) {
                        this.componentType = componentType;
                    }

                    public String getDatatime() {
                        return datatime;
                    }

                    public void setDatatime(String datatime) {
                        this.datatime = datatime;
                    }

                    public UserBean getUser() {
                        return user;
                    }

                    public void setUser(UserBean user) {
                        this.user = user;
                    }

                    public String getUserId() {
                        return userId;
                    }

                    public void setUserId(String userId) {
                        this.userId = userId;
                    }

                    public String getContent() {
                        return content;
                    }

                    public void setContent(String content) {
                        this.content = content;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }

                    public String getPics() {
                        return pics;
                    }

                    public void setPics(String pics) {
                        this.pics = pics;
                    }

                    public ActionBeanX getAction() {
                        return action;
                    }

                    public void setAction(ActionBeanX action) {
                        this.action = action;
                    }

                    public String getIs_live() {
                        return is_live;
                    }

                    public void setIs_live(String is_live) {
                        this.is_live = is_live;
                    }

                    public String getLive_status() {
                        return live_status;
                    }

                    public void setLive_status(String live_status) {
                        this.live_status = live_status;
                    }

                    public String getLive_view_count() {
                        return live_view_count;
                    }

                    public void setLive_view_count(String live_view_count) {
                        this.live_view_count = live_view_count;
                    }

                    public String getIs_collect() {
                        return is_collect;
                    }

                    public void setIs_collect(String is_collect) {
                        this.is_collect = is_collect;
                    }

                    public String getCollect_count() {
                        return collect_count;
                    }

                    public void setCollect_count(String collect_count) {
                        this.collect_count = collect_count;
                    }

                    public static class UserBean {


                        private ActionBean action;
                        private String userAvatar;
                        private String userId;
                        private String username;
                        private String datatime;

                        public ActionBean getAction() {
                            return action;
                        }

                        public void setAction(ActionBean action) {
                            this.action = action;
                        }

                        public String getUserAvatar() {
                            return userAvatar;
                        }

                        public void setUserAvatar(String userAvatar) {
                            this.userAvatar = userAvatar;
                        }

                        public String getUserId() {
                            return userId;
                        }

                        public void setUserId(String userId) {
                            this.userId = userId;
                        }

                        public String getUsername() {
                            return username;
                        }

                        public void setUsername(String username) {
                            this.username = username;
                        }

                        public String getDatatime() {
                            return datatime;
                        }

                        public void setDatatime(String datatime) {
                            this.datatime = datatime;
                        }

                        public static class ActionBean {


                            private String actionType;
                            private String type;
                            private String id;

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
                        }
                    }

                    public static class ActionBeanX {


                        private String actionType;
                        private String type;
                        private String id;
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
