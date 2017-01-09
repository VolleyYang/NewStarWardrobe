package com.yangshenglong.newstarwardrobe.classify;

import java.util.List;

/**
 * Created by CST on 16/12/20.
 */

public class ClassifyGridBean {


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


        private int id;
        private String version;
        private String appApi;
        private List<ItemsBeanX> items;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public String getAppApi() {
            return appApi;
        }

        public void setAppApi(String appApi) {
            this.appApi = appApi;
        }

        public List<ItemsBeanX> getItems() {
            return items;
        }

        public void setItems(List<ItemsBeanX> items) {
            this.items = items;
        }

        public static class ItemsBeanX {


            private ComponentBeanX component;

            public ComponentBeanX getComponent() {
                return component;
            }

            public void setComponent(ComponentBeanX component) {
                this.component = component;
            }

            public static class ComponentBeanX {


                private String cateimg;
                private String componentType;
                private String title;
                private String en_title;
                private ActionBean action;
                private List<ItemsBean> items;

                public String getCateimg() {
                    return cateimg;
                }

                public void setCateimg(String cateimg) {
                    this.cateimg = cateimg;
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

                public String getEn_title() {
                    return en_title;
                }

                public void setEn_title(String en_title) {
                    this.en_title = en_title;
                }

                public ActionBean getAction() {
                    return action;
                }

                public void setAction(ActionBean action) {
                    this.action = action;
                }

                public List<ItemsBean> getItems() {
                    return items;
                }

                public void setItems(List<ItemsBean> items) {
                    this.items = items;
                }

                public static class ActionBean {


                    private String query;
                    private String title;
                    private String en_title;
                    private String actionType;

                    public String getQuery() {
                        return query;
                    }

                    public void setQuery(String query) {
                        this.query = query;
                    }

                    public String getTitle() {
                        return title;
                    }

                    public void setTitle(String title) {
                        this.title = title;
                    }

                    public String getEn_title() {
                        return en_title;
                    }

                    public void setEn_title(String en_title) {
                        this.en_title = en_title;
                    }

                    public String getActionType() {
                        return actionType;
                    }

                    public void setActionType(String actionType) {
                        this.actionType = actionType;
                    }
                }

                public static class ItemsBean {


                    private ComponentBean component;

                    public ComponentBean getComponent() {
                        return component;
                    }

                    public void setComponent(ComponentBean component) {
                        this.component = component;
                    }

                    public static class ComponentBean {


                        private String componentType;
                        private String word;
                        private String picUrl;
                        private String id;
                        private String en_title;
                        private ActionBeanX action;

                        public String getComponentType() {
                            return componentType;
                        }

                        public void setComponentType(String componentType) {
                            this.componentType = componentType;
                        }

                        public String getWord() {
                            return word;
                        }

                        public void setWord(String word) {
                            this.word = word;
                        }

                        public String getPicUrl() {
                            return picUrl;
                        }

                        public void setPicUrl(String picUrl) {
                            this.picUrl = picUrl;
                        }

                        public String getId() {
                            return id;
                        }

                        public void setId(String id) {
                            this.id = id;
                        }

                        public String getEn_title() {
                            return en_title;
                        }

                        public void setEn_title(String en_title) {
                            this.en_title = en_title;
                        }

                        public ActionBeanX getAction() {
                            return action;
                        }

                        public void setAction(ActionBeanX action) {
                            this.action = action;
                        }

                        public static class ActionBeanX {


                            private String title;
                            private String en_title;
                            private String query;
                            private String id;
                            private String actionType;

                            public String getTitle() {
                                return title;
                            }

                            public void setTitle(String title) {
                                this.title = title;
                            }

                            public String getEn_title() {
                                return en_title;
                            }

                            public void setEn_title(String en_title) {
                                this.en_title = en_title;
                            }

                            public String getQuery() {
                                return query;
                            }

                            public void setQuery(String query) {
                                this.query = query;
                            }

                            public String getId() {
                                return id;
                            }

                            public void setId(String id) {
                                this.id = id;
                            }

                            public String getActionType() {
                                return actionType;
                            }

                            public void setActionType(String actionType) {
                                this.actionType = actionType;
                            }
                        }
                    }
                }
            }
        }
    }
}
