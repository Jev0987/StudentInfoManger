package com.jevin.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

/*
 *  @项目名：  StudentInfoManger
 *  @包名：    com.jevin.pojo
 *  @文件名:   student
 *  @创建者:   85169
 *  @创建时间:  2019/10/16 20:31
 *  @描述：    学生信息
 */
@Entity
public class Student {

    @Id
    private String schid;
    private String name;
    private String sex;
    private String born;
    private String nation;
    private String email;
    private String ComeFrom;
    private String liveWhere;
    private String QQ;
    private String weChat;
    private String SClass;
    private String EschoolDate;
    private int schlength;
    private String major;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchid() {
        return schid;
    }

    public void setSchid(String schid) {
        this.schid = schid;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBorn() {
        return born;
    }

    public void setBorn(String born) {
        this.born = born;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getComeFrom() {
        return ComeFrom;
    }

    public void setComeFrom(String comeFrom) {
        ComeFrom = comeFrom;
    }

    public String getLiveWhere() {
        return liveWhere;
    }

    public void setLiveWhere(String liveWhere) {
        this.liveWhere = liveWhere;
    }

    public String getQQ() {
        return QQ;
    }

    public void setQQ(String QQ) {
        this.QQ = QQ;
    }

    public String getWeChat() {
        return weChat;
    }

    public void setWeChat(String weChat) {
        this.weChat = weChat;
    }

    public String getSClass() {
        return SClass;
    }

    public void setSClass(String SClass) {
        this.SClass = SClass;
    }

    public String getEschoolDate() {
        return EschoolDate;
    }

    public void setEschoolDate(String eschoolDate) {
        EschoolDate = eschoolDate;
    }

    public int getSchlength() {
        return schlength;
    }

    public void setSchlength(int schlength) {
        this.schlength = schlength;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
