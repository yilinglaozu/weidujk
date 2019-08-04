package com.dingtao.common.bean.ShouYe;

/**
 * @Author：刘京源
 * @E-mail： 1179348728@qq.com
 * @Date： 2019/7/12 21:53
 * @Description：描述信息
 */
public class ShouYeWenZhen {

    public  long createTime;
    public  int id;
    public  String pic;
    public  int rank;
    public  String departmentName;
    private   int textColor = 0xff000000;
    private   int background = 0xffffffff;

    public int getTextColor() {
        return textColor;
    }

    public void setTextColor(int textColor) {
        this.textColor = textColor;
    }

    public int getBackground() {
        return background;
    }

    public void setBackground(int background) {
        this.background = background;
    }

    //    "createTime":1547021902000,
//            "departmentName":"内科 ",
//            "id":7,
//            "pic":"http://172.17.8.100/images/health/department_pic/nk.jpg",
//            "rank":1

}
