package com.jevin.pojo;

/*
 *  @项目名：  StudentInfoManger
 *  @包名：    com.jevin.pojo
 *  @文件名:   Teacher
 *  @创建者:   85169
 *  @创建时间:  2019/10/17 8:56
 *  @描述：    老师信息
 */
public class Teacher {

    private String teacherId;
    private String TclassId;
    private String teacherName;

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getTclassId() {
        return TclassId;
    }

    public void setTclassId(String tclassId) {
        TclassId = tclassId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
}
