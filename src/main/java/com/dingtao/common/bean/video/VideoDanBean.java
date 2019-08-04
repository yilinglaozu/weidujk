package com.dingtao.common.bean.video;

/**
 * @Author：lenovo
 * @Date：2019/7/18 19:41
 * @Description：描述信息
 */
public class VideoDanBean {
    /**
     *  "content": "这个医生讲解的很专业",
     *             "id": 1
     */
    String content;
    int id;

    public VideoDanBean(String content, int id) {
        this.content = content;
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
