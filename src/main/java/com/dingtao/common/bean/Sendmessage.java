package com.dingtao.common.bean;

/**
 * 作者;路鹏
 * 时间：$date$ $time$
 * 详细信息：
 */
public class Sendmessage {

    /**
     * askTime : 1564063224000
     * content : 666
     * direction : 1
     * doctorHeadPic : http://172.17.8.100/images/health/doctor/image_pic/%s/%s
     * msgType : 1
     * userHeadPic : http://172.17.8.100/images/health/user/head_pic/default/default_head_3.jpg
     */

    private long askTime;
    private String content;
    private int direction;
    private String doctorHeadPic;
    private int msgType;
    private String userHeadPic;

    public long getAskTime() {
        return askTime;
    }

    public void setAskTime(long askTime) {
        this.askTime = askTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public String getDoctorHeadPic() {
        return doctorHeadPic;
    }

    public void setDoctorHeadPic(String doctorHeadPic) {
        this.doctorHeadPic = doctorHeadPic;
    }

    public int getMsgType() {
        return msgType;
    }

    public void setMsgType(int msgType) {
        this.msgType = msgType;
    }

    public String getUserHeadPic() {
        return userHeadPic;
    }

    public void setUserHeadPic(String userHeadPic) {
        this.userHeadPic = userHeadPic;
    }
}
