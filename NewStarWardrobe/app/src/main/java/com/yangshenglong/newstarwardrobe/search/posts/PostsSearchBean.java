package com.yangshenglong.newstarwardrobe.search.posts;

import java.util.List;

/**
 * Created by CST on 16/12/23.
 */

public class PostsSearchBean {



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
                private String description;
                private String id;
                private String forumId;
                private String itemsCount;
                private String commentCount;
                private String v;
                private ActionBean action;

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

                public String getDescription() {
                    return description;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getForumId() {
                    return forumId;
                }

                public void setForumId(String forumId) {
                    this.forumId = forumId;
                }

                public String getItemsCount() {
                    return itemsCount;
                }

                public void setItemsCount(String itemsCount) {
                    this.itemsCount = itemsCount;
                }

                public String getCommentCount() {
                    return commentCount;
                }

                public void setCommentCount(String commentCount) {
                    this.commentCount = commentCount;
                }

                public String getV() {
                    return v;
                }

                public void setV(String v) {
                    this.v = v;
                }

                public ActionBean getAction() {
                    return action;
                }

                public void setAction(ActionBean action) {
                    this.action = action;
                }

                public static class ActionBean {


                    private String actionType;
                    private String type;
                    private String id;
                    private String commentCount;
                    private String unixtime;
                    private String trackQuery;

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

                    public String getCommentCount() {
                        return commentCount;
                    }

                    public void setCommentCount(String commentCount) {
                        this.commentCount = commentCount;
                    }

                    public String getUnixtime() {
                        return unixtime;
                    }

                    public void setUnixtime(String unixtime) {
                        this.unixtime = unixtime;
                    }

                    public String getTrackQuery() {
                        return trackQuery;
                    }

                    public void setTrackQuery(String trackQuery) {
                        this.trackQuery = trackQuery;
                    }
                }
            }
        }

        public static class TagsBean {


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
