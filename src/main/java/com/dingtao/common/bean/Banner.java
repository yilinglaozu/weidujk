package com.dingtao.common.bean;

import android.content.Context;
import android.net.Uri;

import java.io.File;
import java.math.BigDecimal;
import java.net.URLConnection;

/**
 * @author dingtao
 * @date 2019/1/2 15:00
 * qq:1940870847
 */
public class Banner {


    public String imageUrl;
    public String jumpUrl;
    public String rank;
    public String title;

    public Banner(String imageUrl, String jumpUrl, String rank, String title) {
        this.imageUrl = imageUrl;
        this.jumpUrl = jumpUrl;
        this.rank = rank;
        this.title = title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getJumpUrl() {
        return jumpUrl;
    }

    public void setJumpUrl(String jumpUrl) {
        this.jumpUrl = jumpUrl;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    //   	"imageUrl": "https://n1.hdfimg.com/g1/M03/A5/00/wYYBAFz10_WAd9DRAAEzaplfqDM541.jpg",
//            "jumpUrl": "http://www.crha.cn/yxyjdt.html",
//            "rank": 1,
//            "title": "医研究动态学"
}
