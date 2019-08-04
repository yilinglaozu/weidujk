package com.dingtao.common.bean;


import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class LoginBean {

    @Id
    public Long id;
    public String sessionId;
    public String nickName;
    public String userName;
    public String jiGuangPwd;
    public String headPic;
    public int sex;
    public String age;
    public String height;
    public String weight;
    public String email;
    public String whetherBingWeChat;
    public String invitationCode;
    public int status=0;
    @Generated(hash = 1319757199)
    public LoginBean(Long id, String sessionId, String nickName, String userName,
            String jiGuangPwd, String headPic, int sex, String age, String height,
            String weight, String email, String whetherBingWeChat,
            String invitationCode, int status) {
        this.id = id;
        this.sessionId = sessionId;
        this.nickName = nickName;
        this.userName = userName;
        this.jiGuangPwd = jiGuangPwd;
        this.headPic = headPic;
        this.sex = sex;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.email = email;
        this.whetherBingWeChat = whetherBingWeChat;
        this.invitationCode = invitationCode;
        this.status = status;
    }
    @Generated(hash = 1112702939)
    public LoginBean() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getSessionId() {
        return this.sessionId;
    }
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }
    public String getNickName() {
        return this.nickName;
    }
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    public String getUserName() {
        return this.userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getJiGuangPwd() {
        return this.jiGuangPwd;
    }
    public void setJiGuangPwd(String jiGuangPwd) {
        this.jiGuangPwd = jiGuangPwd;
    }
    public String getHeadPic() {
        return this.headPic;
    }
    public void setHeadPic(String headPic) {
        this.headPic = headPic;
    }
    public int getSex() {
        return this.sex;
    }
    public void setSex(int sex) {
        this.sex = sex;
    }
    public String getAge() {
        return this.age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public String getHeight() {
        return this.height;
    }
    public void setHeight(String height) {
        this.height = height;
    }
    public String getWeight() {
        return this.weight;
    }
    public void setWeight(String weight) {
        this.weight = weight;
    }
    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getWhetherBingWeChat() {
        return this.whetherBingWeChat;
    }
    public void setWhetherBingWeChat(String whetherBingWeChat) {
        this.whetherBingWeChat = whetherBingWeChat;
    }
    public String getInvitationCode() {
        return this.invitationCode;
    }
    public void setInvitationCode(String invitationCode) {
        this.invitationCode = invitationCode;
    }
    public int getStatus() {
        return this.status;
    }
    public void setStatus(int status) {
        this.status = status;
    }


}
