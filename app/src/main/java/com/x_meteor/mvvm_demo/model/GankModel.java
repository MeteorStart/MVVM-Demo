package com.x_meteor.mvvm_demo.model;

import android.databinding.Bindable;
import android.databinding.BindingAdapter;
import android.databinding.Observable;
import android.databinding.PropertyChangeRegistry;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.x_meteor.mvvm_demo.BR;
import com.x_meteor.mvvm_demo.MyApplication;

import java.util.List;

/**
 * @author: X_Meteor
 * @description: 类描述
 * @version: V_1.0.0
 * @date: 2018/11/22 11:04
 * @company:
 * @email: lx802315@163.com
 */
public class GankModel implements Observable {

    /**
     * error : false
     * results : [{"_id":"5874bb17421aa9315bfbe852","createdAt":"2018-11-19T03:32:48.481Z","desc":"一个简单的干货集中营客户端。",
     * "images":["https://ww1.sinaimg.cn/large/0073sXn7gy1fxd7y3928wj30a00hrq3a",
     * "https://ww1.sinaimg.cn/large/0073sXn7gy1fxd7y3k0ncj30a00hrq3e",
     * "https://ww1.sinaimg.cn/large/0073sXn7gy1fxd7y3t5xhj30a00hrdgb",
     * "https://ww1.sinaimg.cn/large/0073sXn7gy1fxd7y43m0hj30a00hraaf"],
     * "publishedAt":"2018-11-19T00:00:00.0Z","source":"web","type":"App",
     * "url":"https://github.com/SpiritMan/gank","used":true,"who":"yolo.cc"},{"_id":"5bd905e69d21223ddba8c9e6","createdAt":"2018-11-19T03:30:51.4Z","desc":"整理了一些在平时开发中可能会碰到的问题,以及相关知识点补充,会一直保持更新下去","publishedAt":"2018-11-19T00:00:00.0Z","source":"web","type":"拓展资源","url":"https://github.com/DarielChen/SwiftTips","used":true,"who":"Dariel"},{"_id":"5be14cb49d21223dd88989cc","createdAt":"2018-11-06T08:11:32.840Z","desc":"适用于iOS的简洁易用的浮动面板UI组件。","images":["https://ww1.sinaimg.cn/large/0073sXn7gy1fxd7y72z9lg30980k01ky","https://ww1.sinaimg.cn/large/0073sXn7gy1fxd7y7oiktg30980k0e0y"],"publishedAt":"2018-11-19T00:00:00.0Z","source":"chrome","type":"iOS","url":"https://github.com/SCENEE/FloatingPanel","used":true,"who":"lijinshanmx"},{"_id":"5be92b979d21223dd88989dc","createdAt":"2018-11-12T07:28:23.457Z","desc":"优质爬虫, 实测效能胜过python 一天600万笔数据","publishedAt":"2018-11-19T00:00:00.0Z","source":"web","type":"瞎推荐","url":"https://github.com/tim232385/PornBot/","used":true,"who":"Tim Liu"},{"_id":"5bebebc89d21223dd5066107","createdAt":"2018-11-14T09:32:56.867Z","desc":"可以轻松自定义效果的视图自由切换容器","images":["https://ww1.sinaimg.cn/large/0073sXn7gy1fxd7y95o0zg30cw0cm1kx"],"publishedAt":"2018-11-19T00:00:00.0Z","source":"web","type":"Android","url":"https://github.com/Marksss/AndroidAutoSwitcher","used":true,"who":"Mark"},{"_id":"5bed1d3e9d21223d7a1b0ad6","createdAt":"2018-11-15T07:16:14.289Z","desc":"一个简单好用的密码、验证码输入框，多样式可选。","images":["https://ww1.sinaimg.cn/large/0073sXn7gy1fxd7yf5gwdg30hs0qou0y","https://ww1.sinaimg.cn/large/0073sXn7gy1fxd7yjo250g30hs0qo7wl"],"publishedAt":"2018-11-19T00:00:00.0Z","source":"web","type":"Android","url":"https://github.com/WGwangguan/SeparatedEditText","used":true,"who":"WGwangguan"},{"_id":"5bee88339d21223dd88989e8","createdAt":"2018-11-19T03:28:04.43Z","desc":"GSYGithubApp系列Kotlin版本，完成度高，适合全方位对比学习。","images":["https://ww1.sinaimg.cn/large/0073sXn7gy1fxd7yklbimj30u0140qem"],"publishedAt":"2018-11-19T00:00:00.0Z","source":"web","type":"App","url":"https://github.com/CarGuo/GSYGithubAppKotlin","used":true,"who":"Shuyu Guo"},{"_id":"5beffd3b9d21223dd88989eb","createdAt":"2018-11-17T11:36:27.500Z","desc":"如何简单高效地部署和监控分布式爬虫项目","publishedAt":"2018-11-19T00:00:00.0Z","source":"web","type":"拓展资源","url":"https://juejin.im/post/5bebc5fd6fb9a04a053f3a0e","used":true,"who":"my8100"},{"_id":"5bf04edf9d21223d7a1b0adc","createdAt":"2018-11-19T02:45:20.914Z","desc":"开发安卓5年来经历的安卓开发方式的进化之路。值得推荐大家看看。","publishedAt":"2018-11-19T00:00:00.0Z","source":"web","type":"拓展资源","url":"https://www.jianshu.com/p/44305a99c51a","used":true,"who":"阿韦"},{"_id":"5bf213d39d21223d7a1b0add","createdAt":"2018-11-19T02:45:03.1Z","desc":"给扔物线 HenCoder Plus 学员的一次分享文字版","publishedAt":"2018-11-19T00:00:00.0Z","source":"web","type":"瞎推荐","url":"https://mp.weixin.qq.com/s/rP1vTJpoLlqj9jfj13WKeQ","used":true,"who":"LiuShilin"},{"_id":"5bf228439d21223ddba8ca18","createdAt":"2018-11-19T03:04:35.596Z","desc":"使用Android MotionLayout构建的简单轮播。","images":["https://ww1.sinaimg.cn/large/0073sXn7gy1fxd7ylv4h1g307i0dckjl"],"publishedAt":"2018-11-19T00:00:00.0Z","source":"chrome","type":"Android","url":"https://github.com/faob-dev/MotionLayoutCarousel","used":true,"who":"lijinshanmx"},{"_id":"5bf2290c9d21223ddba8ca1a","createdAt":"2018-11-19T03:07:56.130Z","desc":"Android库在同一个叠加层上展示/突出显示多个视图。","images":["https://ww1.sinaimg.cn/large/0073sXn7gy1fxd7ym8i9qj30u01hcwfq"],"publishedAt":"2018-11-19T00:00:00.0Z","source":"chrome","type":"Android","url":"https://github.com/ujwalthote/MultiLamp","used":true,"who":"lijinshanmx"},{"_id":"5bf229989d21223ddba8ca1c","createdAt":"2018-11-19T03:10:16.925Z","desc":"适用于Android的轻量级刮刮卡查看库。","images":["https://ww1.sinaimg.cn/large/0073sXn7gy1fxd7ymvayig305008wt9k"],"publishedAt":"2018-11-19T00:00:00.0Z","source":"chrome","type":"Android","url":"https://github.com/myinnos/AndroidScratchCard","used":true,"who":"lijinshanmx"},{"_id":"5bf229be9d21223ddba8ca1d","createdAt":"2018-11-19T03:10:54.0Z","desc":"一个堆叠标签的库。","images":["https://ww1.sinaimg.cn/large/0073sXn7gy1fxd7ynfvk3j30u011ignu"],"publishedAt":"2018-11-19T00:00:00.0Z","source":"chrome","type":"Android","url":"https://github.com/kongzue/StackLabel","used":true,"who":"lijinshanmx"},{"_id":"5bf229dd9d21223dd5066111","createdAt":"2018-11-19T03:11:25.124Z","desc":"该库创建了一个浮动菜单，如应用程序momo，vtcpay，wepay。","images":["https://ww1.sinaimg.cn/large/0073sXn7gy1fxd7yprfb8g30bs0hcqv8","https://ww1.sinaimg.cn/large/0073sXn7gy1fxd7yqtcpcg30bs0hctz6","https://ww1.sinaimg.cn/large/0073sXn7gy1fxd7yrfdttg30bs0hcb29"],"publishedAt":"2018-11-19T00:00:00.0Z","source":"chrome","type":"Android","url":"https://github.com/ATHBK/CoordinatorMenu","used":true,"who":"lijinshanmx"},{"_id":"5bf22a249d21223dd5066112","createdAt":"2018-11-19T03:12:36.290Z","desc":"Flutter实现的snapping lists库。","images":["https://ww1.sinaimg.cn/large/0073sXn7gy1fxd7z04lwxg307i0dc4qs"],"publishedAt":"2018-11-19T00:00:00.0Z","source":"chrome","type":"Android","url":"https://github.com/ariedov/flutter_snaplist","used":true,"who":"lijinshanmx"},{"_id":"5bf22a459d21223ddba8ca1e","createdAt":"2018-11-19T03:13:09.249Z","desc":"Android图片选择器，仿微信相册图片选择器，支持自定义！","images":["https://ww1.sinaimg.cn/large/0073sXn7gy1fxd7z1rhx2g30hs0a01kz","https://ww1.sinaimg.cn/large/0073sXn7gy1fxd7z40iw0g30hs0a0u11"],"publishedAt":"2018-11-19T00:00:00.0Z","source":"chrome","type":"Android","url":"https://github.com/Hu12037102/MediaSelector","used":true,"who":"lijinshanmx"},{"_id":"5bf22a8d9d21223dd88989f1","createdAt":"2018-11-19T03:14:21.616Z","desc":"适用于Android的分割线View。","images":["https://ww1.sinaimg.cn/large/0073sXn7gy1fxd7z4gwhuj30f9087jrh","https://ww1.sinaimg.cn/large/0073sXn7gy1fxd7z4ov74j30fa09q74g"],"publishedAt":"2018-11-19T00:00:00.0Z","source":"chrome","type":"Android","url":"https://github.com/mhashim6/SeparatorView","used":true,"who":"lijinshanmx"},{"_id":"5bf22ae09d21223dd5066114","createdAt":"2018-11-19T03:15:44.727Z","desc":"用于替代Android自带Dialog和PopupWindow。","images":["https://ww1.sinaimg.cn/large/0073sXn7gy1fxd7z5ry4ug308t0fte82"],"publishedAt":"2018-11-19T00:00:00.0Z","source":"chrome","type":"Android","url":"https://github.com/goweii/AnyLayer","used":true,"who":"lijinshanmx"},{"_id":"5bf22be39d21223ddba8ca21","createdAt":"2018-11-19T03:28:27.402Z","desc":"适用于iOS应用程序的简单锁屏（Swift 4 +，iOS 11.0+）。","images":["https://ww1.sinaimg.cn/large/0073sXn7gy1fxd7z7c0x6g30lm16gk3y","https://ww1.sinaimg.cn/large/0073sXn7gy1fxd7z88svxg30lm16g159"],"publishedAt":"2018-11-19T00:00:00.0Z","source":"chrome","type":"iOS","url":"https://github.com/mayckonx/MBSPasswordView","used":true,"who":"lijinshanmx"}]
     */

    private boolean error;
    private List<ResultsBean> results;
    private transient PropertyChangeRegistry propertyChangeRegistry = new PropertyChangeRegistry();

    @Bindable
    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
        notifyChange(BR.error);
    }

    @Bindable
    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
        notifyChange(BR.results);
    }

    private synchronized void notifyChange(int propertyId) {
        if (propertyChangeRegistry == null) {
            propertyChangeRegistry = new PropertyChangeRegistry();
        }
        propertyChangeRegistry.notifyChange(this, propertyId);
    }

    @Override
    public synchronized void addOnPropertyChangedCallback(OnPropertyChangedCallback callback) {
        if (propertyChangeRegistry == null) {
            propertyChangeRegistry = new PropertyChangeRegistry();
        }
        propertyChangeRegistry.add(callback);

    }

    @Override
    public synchronized void removeOnPropertyChangedCallback(OnPropertyChangedCallback callback) {
        if (propertyChangeRegistry != null) {
            propertyChangeRegistry.remove(callback);
        }
    }

    public static class ResultsBean implements Observable {
        /**
         * _id : 5874bb17421aa9315bfbe852
         * createdAt : 2018-11-19T03:32:48.481Z
         * desc : 一个简单的干货集中营客户端。
         * images : ["https://ww1.sinaimg.cn/large/0073sXn7gy1fxd7y3928wj30a00hrq3a","https://ww1.sinaimg.cn/large/0073sXn7gy1fxd7y3k0ncj30a00hrq3e","https://ww1.sinaimg.cn/large/0073sXn7gy1fxd7y3t5xhj30a00hrdgb","https://ww1.sinaimg.cn/large/0073sXn7gy1fxd7y43m0hj30a00hraaf"]
         * publishedAt : 2018-11-19T00:00:00.0Z
         * source : web
         * type : App
         * url : https://github.com/SpiritMan/gank
         * used : true
         * who : yolo.cc
         */

        private String _id;
        private String createdAt;
        private String desc;
        private String publishedAt;
        private String source;
        private String type;
        private String url;
        private boolean used;
        private String who;
        private List<String> images;
        private transient PropertyChangeRegistry propertyChangeRegistry = new PropertyChangeRegistry();

        @Bindable
        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
            notifyChange(BR._id);
        }

        @Bindable
        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            notifyChange(BR.createdAt);
        }

        @Bindable
        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
            notifyChange(BR.desc);
        }

        @Bindable
        public String getPublishedAt() {
            return publishedAt;
        }

        @BindingAdapter({"image"})
        public static void imageLoader(ImageView imageView, String url) {
            Glide.with(MyApplication.Companion.getContext()).load(url).into(imageView);
        }

        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
            notifyChange(BR.publishedAt);
        }

        @Bindable
        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
            notifyChange(BR.source);
        }

        @Bindable
        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
            notifyChange(BR.type);
        }

        @Bindable
        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
            notifyChange(BR.url);
        }

        @Bindable
        public boolean isUsed() {
            return used;
        }

        public void setUsed(boolean used) {
            this.used = used;
            notifyChange(BR.used);
        }

        @Bindable
        public String getWho() {
            return who;
        }

        public void setWho(String who) {
            this.who = who;
            notifyChange(BR.who);
        }

        @Bindable
        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
            notifyChange(BR.images);
        }

        private synchronized void notifyChange(int propertyId) {
            if (propertyChangeRegistry == null) {
                propertyChangeRegistry = new PropertyChangeRegistry();
            }
            propertyChangeRegistry.notifyChange(this, propertyId);
        }

        @Override
        public synchronized void addOnPropertyChangedCallback(OnPropertyChangedCallback callback) {
            if (propertyChangeRegistry == null) {
                propertyChangeRegistry = new PropertyChangeRegistry();
            }
            propertyChangeRegistry.add(callback);

        }

        @Override
        public synchronized void removeOnPropertyChangedCallback(OnPropertyChangedCallback callback) {
            if (propertyChangeRegistry != null) {
                propertyChangeRegistry.remove(callback);
            }
        }
    }
}
