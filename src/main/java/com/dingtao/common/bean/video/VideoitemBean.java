package com.dingtao.common.bean.video;

/**
 * @Author：lenovo
 * @Date：2019/7/14 21:04
 * @Description：描述信息
 */
public class VideoitemBean {
    /**
     *   "abstracts": "小孩贫血的检查方法，应该是根据孩子贫血的.分类来进行的",
     *             "buyNum": 1,
     *             "categoryId": 1,
     *             "duration": 95,
     *             "id": 1,
     *           原始视频url  "originalUrl": "http://172.17.8.100/video/health/original/ek/ek1.mp4",
     *             "price": 100,
     *
     * 剪切视频url(试看)  "shearUrl": "http://172.17.8.100/video/health/cut/ek/ek1.mp4",
     *             "title": "小儿贫血的检查方法有哪些",
     *             "whetherBuy": 2,
     *             "whetherCollection": 2
     */
    String abstracts;
    int buyNum;
    int categoryId;
    int duration;
    int id;
    String originalUrl;
    int price;
    String shearUrl;
    String title;
    int whetherBuy;
    int whetherCollection;

    public VideoitemBean(String abstracts, int buyNum, int categoryId, int duration, int id, String originalUrl, int price, String shearUrl, String title, int whetherBuy, int whetherCollection) {
        this.abstracts = abstracts;
        this.buyNum = buyNum;
        this.categoryId = categoryId;
        this.duration = duration;
        this.id = id;
        this.originalUrl = originalUrl;
        this.price = price;
        this.shearUrl = shearUrl;
        this.title = title;
        this.whetherBuy = whetherBuy;
        this.whetherCollection = whetherCollection;
    }

    public String getAbstracts() {
        return abstracts;
    }

    public void setAbstracts(String abstracts) {
        this.abstracts = abstracts;
    }

    public int getBuyNum() {
        return buyNum;
    }

    public void setBuyNum(int buyNum) {
        this.buyNum = buyNum;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOriginalUrl() {
        return originalUrl;
    }

    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getShearUrl() {
        return shearUrl;
    }

    public void setShearUrl(String shearUrl) {
        this.shearUrl = shearUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getWhetherBuy() {
        return whetherBuy;
    }

    public void setWhetherBuy(int whetherBuy) {
        this.whetherBuy = whetherBuy;
    }

    public int getWhetherCollection() {
        return whetherCollection;
    }

    public void setWhetherCollection(int whetherCollection) {
        this.whetherCollection = whetherCollection;
    }
}
