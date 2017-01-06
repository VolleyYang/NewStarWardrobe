package com.yangshenglong.newstarwardrobe.shopping.third.brand;

import java.util.List;

/**
 * Created by xiaoBu on 16/12/27.
 */

public class BrandDataTitle {


    /**
     * response : {"code":"0","msg":"success","isNew":1,"version":"7.1.0","data":{"business":{"appApi":"http://api-v2.mall.hichao.com","business_name":"TTCOLOR","business_id":"2302","business_brief":"演绎甜美优雅与都会随性相结合是TT.COLOR追求时尚的穿衣理念、为年轻、自信、有品位的时尚女性带来精致，甜美，都会的设计风格。注重层次有节奏的混搭效果，彰显自我，崭露个性，坚持在创新中引领潮流。","introduce":"","business_image":"http://mxycsku.mingxingyichu.cn/group6/M00/5D/47/wKgBjVZlNtKAcnI6AAAltKkvT0c21.jpeg","business_image_width":"200","business_image_height":"200","detailUrl":"http://m.hichao.com/app/templates/brand_detail.html?id=2302","english_name":"TTCOLOR","search_keyword":"TTCOLOR;TTCOLOR","business_banner_url":"http://mxycsku.mingxingyichu.cn/group5/M00/55/13/wKgBf1hIAUGAVAFpAAI3e3b6JCc459.jpg","business_banner_width":"750","business_banner_height":"350","brand_title":"品牌店","short_title":"","img_falls":"","img_falls_width":"0.01","img_falls_height":"0.01"},"business_promote":[],"business_recommend":[],"rule_promote_name":[],"business_activity":[],"sort_cate":[{"sort":"1","title":"默认","up":"4","down":"2","two":[{"cid":"17","name":"女式上装"},{"cid":"19","name":"裙子"},{"cid":"20","name":"女裤"},{"cid":"171","name":"其它女装"}]},{"sort":"5","title":"上新"},{"sort":"3","title":"销量"},{"sort":"4","title":"价格","up":"4","down":"2"},{"sort":"6","title":"分类","two":[{"cid":"17","name":"女式上装"},{"cid":"19","name":"裙子"},{"cid":"20","name":"女裤"},{"cid":"171","name":"其它女装"}]}]},"track":{"eventname":"brand_c","business_id":"2302"}}
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
         * msg : success
         * isNew : 1
         * version : 7.1.0
         * data : {"business":{"appApi":"http://api-v2.mall.hichao.com","business_name":"TTCOLOR","business_id":"2302","business_brief":"演绎甜美优雅与都会随性相结合是TT.COLOR追求时尚的穿衣理念、为年轻、自信、有品位的时尚女性带来精致，甜美，都会的设计风格。注重层次有节奏的混搭效果，彰显自我，崭露个性，坚持在创新中引领潮流。","introduce":"","business_image":"http://mxycsku.mingxingyichu.cn/group6/M00/5D/47/wKgBjVZlNtKAcnI6AAAltKkvT0c21.jpeg","business_image_width":"200","business_image_height":"200","detailUrl":"http://m.hichao.com/app/templates/brand_detail.html?id=2302","english_name":"TTCOLOR","search_keyword":"TTCOLOR;TTCOLOR","business_banner_url":"http://mxycsku.mingxingyichu.cn/group5/M00/55/13/wKgBf1hIAUGAVAFpAAI3e3b6JCc459.jpg","business_banner_width":"750","business_banner_height":"350","brand_title":"品牌店","short_title":"","img_falls":"","img_falls_width":"0.01","img_falls_height":"0.01"},"business_promote":[],"business_recommend":[],"rule_promote_name":[],"business_activity":[],"sort_cate":[{"sort":"1","title":"默认"},{"sort":"5","title":"上新"},{"sort":"3","title":"销量"},{"sort":"4","title":"价格","up":"4","down":"2"},{"sort":"6","title":"分类","two":[{"cid":"17","name":"女式上装"},{"cid":"19","name":"裙子"},{"cid":"20","name":"女裤"},{"cid":"171","name":"其它女装"}]}]}
         * track : {"eventname":"brand_c","business_id":"2302"}
         */

        private String code;
        private String msg;
        private int isNew;
        private String version;
        private DataBean data;
        private TrackBean track;

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

        public TrackBean getTrack() {
            return track;
        }

        public void setTrack(TrackBean track) {
            this.track = track;
        }

        public static class DataBean {
            /**
             * business : {"appApi":"http://api-v2.mall.hichao.com","business_name":"TTCOLOR","business_id":"2302","business_brief":"演绎甜美优雅与都会随性相结合是TT.COLOR追求时尚的穿衣理念、为年轻、自信、有品位的时尚女性带来精致，甜美，都会的设计风格。注重层次有节奏的混搭效果，彰显自我，崭露个性，坚持在创新中引领潮流。","introduce":"","business_image":"http://mxycsku.mingxingyichu.cn/group6/M00/5D/47/wKgBjVZlNtKAcnI6AAAltKkvT0c21.jpeg","business_image_width":"200","business_image_height":"200","detailUrl":"http://m.hichao.com/app/templates/brand_detail.html?id=2302","english_name":"TTCOLOR","search_keyword":"TTCOLOR;TTCOLOR","business_banner_url":"http://mxycsku.mingxingyichu.cn/group5/M00/55/13/wKgBf1hIAUGAVAFpAAI3e3b6JCc459.jpg","business_banner_width":"750","business_banner_height":"350","brand_title":"品牌店","short_title":"","img_falls":"","img_falls_width":"0.01","img_falls_height":"0.01"}
             * business_promote : []
             * business_recommend : []
             * rule_promote_name : []
             * business_activity : []
             * sort_cate : [{"sort":"1","title":"默认"},{"sort":"5","title":"上新"},{"sort":"3","title":"销量"},{"sort":"4","title":"价格","up":"4","down":"2"},{"sort":"6","title":"分类","two":[{"cid":"17","name":"女式上装"},{"cid":"19","name":"裙子"},{"cid":"20","name":"女裤"},{"cid":"171","name":"其它女装"}]}]
             */

            private BusinessBean business;
            private List<?> business_promote;
            private List<?> business_recommend;
            private List<?> rule_promote_name;
            private List<?> business_activity;
            private List<SortCateBean> sort_cate;

            public BusinessBean getBusiness() {
                return business;
            }

            public void setBusiness(BusinessBean business) {
                this.business = business;
            }

            public List<?> getBusiness_promote() {
                return business_promote;
            }

            public void setBusiness_promote(List<?> business_promote) {
                this.business_promote = business_promote;
            }

            public List<?> getBusiness_recommend() {
                return business_recommend;
            }

            public void setBusiness_recommend(List<?> business_recommend) {
                this.business_recommend = business_recommend;
            }

            public List<?> getRule_promote_name() {
                return rule_promote_name;
            }

            public void setRule_promote_name(List<?> rule_promote_name) {
                this.rule_promote_name = rule_promote_name;
            }

            public List<?> getBusiness_activity() {
                return business_activity;
            }

            public void setBusiness_activity(List<?> business_activity) {
                this.business_activity = business_activity;
            }

            public List<SortCateBean> getSort_cate() {
                return sort_cate;
            }

            public void setSort_cate(List<SortCateBean> sort_cate) {
                this.sort_cate = sort_cate;
            }

            public static class BusinessBean {
                /**
                 * appApi : http://api-v2.mall.hichao.com
                 * business_name : TTCOLOR
                 * business_id : 2302
                 * business_brief : 演绎甜美优雅与都会随性相结合是TT.COLOR追求时尚的穿衣理念、为年轻、自信、有品位的时尚女性带来精致，甜美，都会的设计风格。注重层次有节奏的混搭效果，彰显自我，崭露个性，坚持在创新中引领潮流。
                 * introduce :
                 * business_image : http://mxycsku.mingxingyichu.cn/group6/M00/5D/47/wKgBjVZlNtKAcnI6AAAltKkvT0c21.jpeg
                 * business_image_width : 200
                 * business_image_height : 200
                 * detailUrl : http://m.hichao.com/app/templates/brand_detail.html?id=2302
                 * english_name : TTCOLOR
                 * search_keyword : TTCOLOR;TTCOLOR
                 * business_banner_url : http://mxycsku.mingxingyichu.cn/group5/M00/55/13/wKgBf1hIAUGAVAFpAAI3e3b6JCc459.jpg
                 * business_banner_width : 750
                 * business_banner_height : 350
                 * brand_title : 品牌店
                 * short_title :
                 * img_falls :
                 * img_falls_width : 0.01
                 * img_falls_height : 0.01
                 */

                private String appApi;
                private String business_name;
                private String business_id;
                private String business_brief;
                private String introduce;
                private String business_image;
                private String business_image_width;
                private String business_image_height;
                private String detailUrl;
                private String english_name;
                private String search_keyword;
                private String business_banner_url;
                private String business_banner_width;
                private String business_banner_height;
                private String brand_title;
                private String short_title;
                private String img_falls;
                private String img_falls_width;
                private String img_falls_height;

                public String getAppApi() {
                    return appApi;
                }

                public void setAppApi(String appApi) {
                    this.appApi = appApi;
                }

                public String getBusiness_name() {
                    return business_name;
                }

                public void setBusiness_name(String business_name) {
                    this.business_name = business_name;
                }

                public String getBusiness_id() {
                    return business_id;
                }

                public void setBusiness_id(String business_id) {
                    this.business_id = business_id;
                }

                public String getBusiness_brief() {
                    return business_brief;
                }

                public void setBusiness_brief(String business_brief) {
                    this.business_brief = business_brief;
                }

                public String getIntroduce() {
                    return introduce;
                }

                public void setIntroduce(String introduce) {
                    this.introduce = introduce;
                }

                public String getBusiness_image() {
                    return business_image;
                }

                public void setBusiness_image(String business_image) {
                    this.business_image = business_image;
                }

                public String getBusiness_image_width() {
                    return business_image_width;
                }

                public void setBusiness_image_width(String business_image_width) {
                    this.business_image_width = business_image_width;
                }

                public String getBusiness_image_height() {
                    return business_image_height;
                }

                public void setBusiness_image_height(String business_image_height) {
                    this.business_image_height = business_image_height;
                }

                public String getDetailUrl() {
                    return detailUrl;
                }

                public void setDetailUrl(String detailUrl) {
                    this.detailUrl = detailUrl;
                }

                public String getEnglish_name() {
                    return english_name;
                }

                public void setEnglish_name(String english_name) {
                    this.english_name = english_name;
                }

                public String getSearch_keyword() {
                    return search_keyword;
                }

                public void setSearch_keyword(String search_keyword) {
                    this.search_keyword = search_keyword;
                }

                public String getBusiness_banner_url() {
                    return business_banner_url;
                }

                public void setBusiness_banner_url(String business_banner_url) {
                    this.business_banner_url = business_banner_url;
                }

                public String getBusiness_banner_width() {
                    return business_banner_width;
                }

                public void setBusiness_banner_width(String business_banner_width) {
                    this.business_banner_width = business_banner_width;
                }

                public String getBusiness_banner_height() {
                    return business_banner_height;
                }

                public void setBusiness_banner_height(String business_banner_height) {
                    this.business_banner_height = business_banner_height;
                }

                public String getBrand_title() {
                    return brand_title;
                }

                public void setBrand_title(String brand_title) {
                    this.brand_title = brand_title;
                }

                public String getShort_title() {
                    return short_title;
                }

                public void setShort_title(String short_title) {
                    this.short_title = short_title;
                }

                public String getImg_falls() {
                    return img_falls;
                }

                public void setImg_falls(String img_falls) {
                    this.img_falls = img_falls;
                }

                public String getImg_falls_width() {
                    return img_falls_width;
                }

                public void setImg_falls_width(String img_falls_width) {
                    this.img_falls_width = img_falls_width;
                }

                public String getImg_falls_height() {
                    return img_falls_height;
                }

                public void setImg_falls_height(String img_falls_height) {
                    this.img_falls_height = img_falls_height;
                }
            }

            public static class SortCateBean {
                /**
                 * sort : 1
                 * title : 默认
                 * up : 4
                 * down : 2
                 * two : [{"cid":"17","name":"女式上装"},{"cid":"19","name":"裙子"},{"cid":"20","name":"女裤"},{"cid":"171","name":"其它女装"}]
                 */

                private String sort;
                private String title;
                private String up;
                private String down;
                private List<TwoBean> two;

                public String getSort() {
                    return sort;
                }

                public void setSort(String sort) {
                    this.sort = sort;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getUp() {
                    return up;
                }

                public void setUp(String up) {
                    this.up = up;
                }

                public String getDown() {
                    return down;
                }

                public void setDown(String down) {
                    this.down = down;
                }

                public List<TwoBean> getTwo() {
                    return two;
                }

                public void setTwo(List<TwoBean> two) {
                    this.two = two;
                }

                public static class TwoBean {
                    /**
                     * cid : 17
                     * name : 女式上装
                     */

                    private String cid;
                    private String name;

                    public String getCid() {
                        return cid;
                    }

                    public void setCid(String cid) {
                        this.cid = cid;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }
                }
            }
        }

        public static class TrackBean {
            /**
             * eventname : brand_c
             * business_id : 2302
             */

            private String eventname;
            private String business_id;

            public String getEventname() {
                return eventname;
            }

            public void setEventname(String eventname) {
                this.eventname = eventname;
            }

            public String getBusiness_id() {
                return business_id;
            }

            public void setBusiness_id(String business_id) {
                this.business_id = business_id;
            }
        }
    }
}
