package com.jevin.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
 *  @项目名：  StudentInfoManger
 *  @包名：    com.jevin.pojo
 *  @文件名:   TClass
 *  @创建者:   85169
 *  @创建时间:  2019/10/17 9:21
 *  @描述：    课程信息
 */
@Entity
public class Tcrouse {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String CName;//课程名称
    private String Cid;//课程id
    private String MaxNumber;//最多容纳学生数
    private String Tname;//老师名
    private String Tid;//老师id
    private String Tlocation;//授课地点

    @Override
    public String toString() {
        return "Tcrouse{" +
                "id=" + id +
                ", CName='" + CName + '\'' +
                ", Cid='" + Cid + '\'' +
                ", MaxNumber='" + MaxNumber + '\'' +
                ", Tname='" + Tname + '\'' +
                ", Tid='" + Tid + '\'' +
                ", Tlocation='" + Tlocation + '\'' +
                '}';
    }

    public String getCid() {
        return Cid;
    }

    public void setCid(String cid) {
        Cid = cid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCName() {
        return CName;
    }

    public void setCName(String CName) {
        this.CName = CName;
    }

    public String getMaxNumber() {
        return MaxNumber;
    }

    public void setMaxNumber(String maxNumber) {
        MaxNumber = maxNumber;
    }

    public String getTname() {
        return Tname;
    }

    public void setTname(String tname) {
        Tname = tname;
    }

    public String getTlocation() {
        return Tlocation;
    }

    public void setTlocation(String tlocation) {
        Tlocation = tlocation;
    }

    public String getTid() {
        return Tid;
    }

    public void setTid(String tid) {
        Tid = tid;
    }
}
