package com.jevin.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
 *  @项目名：  StudentInfoManger
 *  @包名：    com.jevin.pojo
 *  @文件名:   Cclass
 *  @创建者:   85169
 *  @创建时间:  2019/10/17 9:34
 *  @描述：    选课信息
 */
@Entity
public class Ccrouse {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String StudName;//学生姓名
    private int totalNum;//所有人数
    private int thisNum;//已选人数
    private String Cid;//课程id
    private String tName;//老师名
    private String Cname;//课程名


    @Override
    public String toString() {
        return "Ccrouse{" +
                "id=" + id +
                ", StudName='" + StudName + '\'' +
                ", totalNum=" + totalNum +
                ", thisNum=" + thisNum +
                ", Cid='" + Cid + '\'' +
                ", tName='" + tName + '\'' +
                ", Cname='" + Cname + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudName() {
        return StudName;
    }

    public void setStudName(String studName) {
        StudName = studName;
    }

    public int getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(int totalNum) {
        this.totalNum = totalNum;
    }

    public int getThisNum() {
        return thisNum;
    }

    public void setThisNum(int thisNum) {
        this.thisNum = thisNum;
    }

    public String getCid() {
        return Cid;
    }

    public void setCid(String cid) {
        Cid = cid;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String getCname() {
        return Cname;
    }

    public void setCname(String cname) {
        Cname = cname;
    }
}
