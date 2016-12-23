package com.yangshenglong.newstarwardrobe.search;

import java.util.List;

/**
 * Created by CST on 16/12/23.
 */

public class GuideSearchBean {

    /**
     * message :
     * data : {"items":[{"follow":"2302","picUrl":"http://s1.mingxingyichu.cn/group6/M00/95/AC/wKgBjFXa68-AKuKlAACLJzsDhvc31.jpeg","description":"ABC名称源于英文单词\u201cAlways Being Clean\u201d的首字母，寓意永远地追求清洁、卫生与健康。 ABC品牌专为爱惜自己，注重个人及家庭护理、健康，追求高品质生活的女性而设，同时传递着对万千女性的关爱。","text":"ABC卫生巾"},{"follow":"1420","picUrl":"http://s1.mingxingyichu.cn/group5/M00/FA/FA/wKgBf1dP8JOAR3KcAABat-XL9ro251.jpg","description":"AIM，品牌定位为游走于城市精英生活圈，热爱有品质的生活，有修养，对时尚有一定品位的商务男士和优雅女士。","text":"AIM"},{"follow":"7715","picUrl":"http://s0.mingxingyichu.cn/group5/M00/93/4A/wKgBf1bQId2AduAKAAAXjCbeEHU647.jpg","description":"以感性设计获得女性喜爱，在短时间内获得大跨步发展的韩国女性品牌AIN在\u201c2015上海品牌颁奖典礼（2015 Shanghai Asia Brand Awards）\u201d上荣获专业女装品牌奖。AIN以\u201c与顾客的沟通\u201d为品牌理念，针对10代、20代女性推出了各种不同风格的流行服装，以简约特别的底色和设计为特色，获得了年轻女性消费者的喜爱。","text":"AIN"},{"follow":"5572","picUrl":"http://mxycsku.mingxingyichu.cn/group6/M00/8E/AF/wKgBjVXWw5iADj9vAAB4ky1QKAk28.jpeg","description":"品牌介绍：ALIAS的风格摩登时尚亦不失大方。重视自由精神，注重设计的实用性，ALIAS简约的都市风尚扣人心弦。深受建筑、男装和街头文化的启发，ALIAS的系列常会出现版型扩大和宽松的服装，乍看廓形线条流畅简单，近看便会发现内有考究的隐藏式设计细节。无太多花哨的装饰，透过简洁的线条和边幅粗躁的毛边细节便可以隐约地感受到当中叛逆地男孩气息。","text":"ALIAS"},{"follow":"13751","picUrl":"http://s1.mingxingyichu.cn/group5/M00/B7/14/wKgBfVYl71eABPxnAAAf43OEP8Y80.jpeg","description":"AMII，主张极简美学的原创设计品牌。极简美学是以简驭繁的艺术。精简去所有多余的装饰，让服饰设计回归到最极简的原点，从面料、廓形、色彩、搭配，只为表现你最美的一面，装饰其他不完美，无需刻意，已是不动声色的美。","text":"AMII"},{"follow":"2972","picUrl":"http://s5.mingxingyichu.cn/group5/M00/E9/52/wKgBf1WMxOaAApSvAABBeP57Bqk75.jpeg","description":"来自韩国的时尚品牌Andersson Bell，不同于韩国其他本土品牌的风格，\r\nAnderssonBell展现了自然舒适的北欧风， 让你感受满满的北欧风情。","text":"ANDERSSON BELL"},{"follow":"2679","picUrl":"http://s2.mingxingyichu.cn/group5/M00/C6/7A/wKgBfVYvRqGASe88AABKJP9Dj1435.jpeg","description":"ANNE KLEIN品牌公司创立于1968年。47年来，ANNE KLEIN已经成为\u201c美国时尚风格\u201d的代名词，将精明干练与性感迷人两种截然不同的性格融合于一体。2015年，ANNE KLEIN在中国大陆首家实体店于北京国瑞城购物中心开业。","text":"ANNE KLEIN"},{"follow":"18112","picUrl":"http://mxycsku.mingxingyichu.cn/group6/M00/B8/9B/wKgBjFUl3qaAJKFxAAB8d6v6O7o59.jpeg","description":"ANNSUU专注时尚态度，专注客户体验，原创设计，不断创新，街头潮人首选。ANNSUU宣言：无风格不时尚！追求个性时尚，展示不同面的我！我就是我，我为自己代言！我不止于一面！","text":"ANNSUU"},{"follow":"5264","picUrl":"http://s3.mingxingyichu.cn/group6/M00/2B/DA/wKgBjVZES0eAfTEIAABJcVK5ah039.jpeg","description":"AR&TESIA，寓意为被上帝眷爱着。从完美深刻的芭蕾舞者艺术精神到极致美好的时装梦想，创始人TESIA或许有被上帝眷爱的幸运，却有更多来自内心坚韧的力量。时装的一针一线，就如同芭蕾舞者对每个舞姿、动作、弧线的苛刻要求，最后的成衣才能呈现出那般自信却又放松的状态。","text":"AR&TESIA"},{"follow":"1765","picUrl":"http://s5.mingxingyichu.cn/group5/M00/AD/2E/wKgBf1YeC0eAewYWAAAYPQk0Tuo902.png","description":"","text":"ARS SOUL"}],"appApi":"/search/sug"}
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
         * items : [{"follow":"2302","picUrl":"http://s1.mingxingyichu.cn/group6/M00/95/AC/wKgBjFXa68-AKuKlAACLJzsDhvc31.jpeg","description":"ABC名称源于英文单词\u201cAlways Being Clean\u201d的首字母，寓意永远地追求清洁、卫生与健康。 ABC品牌专为爱惜自己，注重个人及家庭护理、健康，追求高品质生活的女性而设，同时传递着对万千女性的关爱。","text":"ABC卫生巾"},{"follow":"1420","picUrl":"http://s1.mingxingyichu.cn/group5/M00/FA/FA/wKgBf1dP8JOAR3KcAABat-XL9ro251.jpg","description":"AIM，品牌定位为游走于城市精英生活圈，热爱有品质的生活，有修养，对时尚有一定品位的商务男士和优雅女士。","text":"AIM"},{"follow":"7715","picUrl":"http://s0.mingxingyichu.cn/group5/M00/93/4A/wKgBf1bQId2AduAKAAAXjCbeEHU647.jpg","description":"以感性设计获得女性喜爱，在短时间内获得大跨步发展的韩国女性品牌AIN在\u201c2015上海品牌颁奖典礼（2015 Shanghai Asia Brand Awards）\u201d上荣获专业女装品牌奖。AIN以\u201c与顾客的沟通\u201d为品牌理念，针对10代、20代女性推出了各种不同风格的流行服装，以简约特别的底色和设计为特色，获得了年轻女性消费者的喜爱。","text":"AIN"},{"follow":"5572","picUrl":"http://mxycsku.mingxingyichu.cn/group6/M00/8E/AF/wKgBjVXWw5iADj9vAAB4ky1QKAk28.jpeg","description":"品牌介绍：ALIAS的风格摩登时尚亦不失大方。重视自由精神，注重设计的实用性，ALIAS简约的都市风尚扣人心弦。深受建筑、男装和街头文化的启发，ALIAS的系列常会出现版型扩大和宽松的服装，乍看廓形线条流畅简单，近看便会发现内有考究的隐藏式设计细节。无太多花哨的装饰，透过简洁的线条和边幅粗躁的毛边细节便可以隐约地感受到当中叛逆地男孩气息。","text":"ALIAS"},{"follow":"13751","picUrl":"http://s1.mingxingyichu.cn/group5/M00/B7/14/wKgBfVYl71eABPxnAAAf43OEP8Y80.jpeg","description":"AMII，主张极简美学的原创设计品牌。极简美学是以简驭繁的艺术。精简去所有多余的装饰，让服饰设计回归到最极简的原点，从面料、廓形、色彩、搭配，只为表现你最美的一面，装饰其他不完美，无需刻意，已是不动声色的美。","text":"AMII"},{"follow":"2972","picUrl":"http://s5.mingxingyichu.cn/group5/M00/E9/52/wKgBf1WMxOaAApSvAABBeP57Bqk75.jpeg","description":"来自韩国的时尚品牌Andersson Bell，不同于韩国其他本土品牌的风格，\r\nAnderssonBell展现了自然舒适的北欧风， 让你感受满满的北欧风情。","text":"ANDERSSON BELL"},{"follow":"2679","picUrl":"http://s2.mingxingyichu.cn/group5/M00/C6/7A/wKgBfVYvRqGASe88AABKJP9Dj1435.jpeg","description":"ANNE KLEIN品牌公司创立于1968年。47年来，ANNE KLEIN已经成为\u201c美国时尚风格\u201d的代名词，将精明干练与性感迷人两种截然不同的性格融合于一体。2015年，ANNE KLEIN在中国大陆首家实体店于北京国瑞城购物中心开业。","text":"ANNE KLEIN"},{"follow":"18112","picUrl":"http://mxycsku.mingxingyichu.cn/group6/M00/B8/9B/wKgBjFUl3qaAJKFxAAB8d6v6O7o59.jpeg","description":"ANNSUU专注时尚态度，专注客户体验，原创设计，不断创新，街头潮人首选。ANNSUU宣言：无风格不时尚！追求个性时尚，展示不同面的我！我就是我，我为自己代言！我不止于一面！","text":"ANNSUU"},{"follow":"5264","picUrl":"http://s3.mingxingyichu.cn/group6/M00/2B/DA/wKgBjVZES0eAfTEIAABJcVK5ah039.jpeg","description":"AR&TESIA，寓意为被上帝眷爱着。从完美深刻的芭蕾舞者艺术精神到极致美好的时装梦想，创始人TESIA或许有被上帝眷爱的幸运，却有更多来自内心坚韧的力量。时装的一针一线，就如同芭蕾舞者对每个舞姿、动作、弧线的苛刻要求，最后的成衣才能呈现出那般自信却又放松的状态。","text":"AR&TESIA"},{"follow":"1765","picUrl":"http://s5.mingxingyichu.cn/group5/M00/AD/2E/wKgBf1YeC0eAewYWAAAYPQk0Tuo902.png","description":"","text":"ARS SOUL"}]
         * appApi : /search/sug
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
             * follow : 2302
             * picUrl : http://s1.mingxingyichu.cn/group6/M00/95/AC/wKgBjFXa68-AKuKlAACLJzsDhvc31.jpeg
             * description : ABC名称源于英文单词“Always Being Clean”的首字母，寓意永远地追求清洁、卫生与健康。 ABC品牌专为爱惜自己，注重个人及家庭护理、健康，追求高品质生活的女性而设，同时传递着对万千女性的关爱。
             * text : ABC卫生巾
             */

            private String follow;
            private String picUrl;
            private String description;
            private String text;

            public String getFollow() {
                return follow;
            }

            public void setFollow(String follow) {
                this.follow = follow;
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

            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
            }
        }
    }
}
