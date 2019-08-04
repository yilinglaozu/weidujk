package com.dingtao.common.bean;

/**
 * 作者;路鹏
 * 时间：$date$ $time$
 * 详细信息：
 */
public class Video {
    private String id;
    private String categoryId;
    private String title;
    private String shearUrl;
    private String abstracts;
    private String originalUrl;
    private double price;
    private String duration;
    private String whetherCollection;
    private String whetherPay;
    private String buyNum;

    public Video(String id, String categoryId, String title, String shearUrl, String abstracts, String originalUrl, double price, String duration, String whetherCollection, String whetherPay, String buyNum) {
        this.id = id;
        this.categoryId = categoryId;
        this.title = title;
        this.shearUrl = shearUrl;
        this.abstracts = abstracts;
        this.originalUrl = originalUrl;
        this.price = price;
        this.duration = duration;
        this.whetherCollection = whetherCollection;
        this.whetherPay = whetherPay;
        this.buyNum = buyNum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getShearUrl() {
        return shearUrl;
    }

    public void setShearUrl(String shearUrl) {
        this.shearUrl = shearUrl;
    }

    public String getAbstracts() {
        return abstracts;
    }

    public void setAbstracts(String abstracts) {
        this.abstracts = abstracts;
    }

    public String getOriginalUrl() {
        return originalUrl;
    }

    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getWhetherCollection() {
        return whetherCollection;
    }

    public void setWhetherCollection(String whetherCollection) {
        this.whetherCollection = whetherCollection;
    }

    public String getWhetherPay() {
        return whetherPay;
    }

    public void setWhetherPay(String whetherPay) {
        this.whetherPay = whetherPay;
    }

    public String getBuyNum() {
        return buyNum;
    }

    public void setBuyNum(String buyNum) {
        this.buyNum = buyNum;
    }
}
