package com.dingtao.common.bean;

/**
 * 作者;路鹏
 * 时间：$date$ $time$
 * 详细信息：
 */
public class VideoItem {
    private String id;
    private String name;

    public VideoItem(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
