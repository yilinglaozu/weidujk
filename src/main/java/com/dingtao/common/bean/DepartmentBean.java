package com.dingtao.common.bean;

public class DepartmentBean {

    public int id;
    public int rank;
    public String departmentName;
    public String pic;
    public boolean isChecked;

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
