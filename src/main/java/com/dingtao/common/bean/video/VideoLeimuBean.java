package com.dingtao.common.bean.video;

/**
 * @Author：lenovo
 * @Date：2019/7/12 14:18
 * @Description：描述信息
 */
public class VideoLeimuBean {
    int id;
    String name;
    int textcolor = 0xff333333;

    public VideoLeimuBean(int textcolor) {
        this.textcolor = textcolor;
    }

    public int getTextcolor() {
        return textcolor;
    }

    public void setTextcolor(int textcolor) {
        this.textcolor = textcolor;
    }

    public VideoLeimuBean(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
