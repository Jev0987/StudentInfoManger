package com.jevin.dao;

import org.springframework.stereotype.Repository;

import java.lang.reflect.Field;

/*
 *  @项目名：  StudentInfoManger
 *  @包名：    com.jevin.dao
 *  @文件名:   CommonRepository
 *  @创建者:   85169
 *  @创建时间:  2019/10/17 9:42
 *  @描述：    根据对象生成sql
 */
@Repository
public class CommonRepository<T> {
    //根据对象，返回sql语句
    public StringBuffer getFiledValues(T t , int pagenum) throws IllegalAccessException {

        String table = t.getClass().toString().substring(t.getClass().toString().lastIndexOf(".") + 1);

        StringBuffer stringBuffer = new StringBuffer("SELECT * FROM " + table + " WHERE ");

        StringBuffer sql = new StringBuffer();

        if (t != null) {
            Class tClass = t.getClass();
            //getDeclaredFields()获取类中声明的所有的字段（属性）(public、protected、default、private),但不包括继承的属性，返回Field对象的一个数组
            Field[] fields = tClass.getDeclaredFields();
            int cout = 0;
            for (int i = 0; i < fields.length; i++) {
                String buf = "";
                //Java的反射机制提供的setAccessible()方法可以取消java的权限控制检查   private属性。
                fields[i].setAccessible(true);
                //判断返回指定对象t上此Field表示的字段的值是否为空
                if (fields[i].get(t) != null) {
                    if (fields[i].getType().toString().equals("int") && fields[i].getInt(t) != 0) {
                        if (cout == 0) {
                            buf = fields[i].getName() + " LIKE " + "'%" + fields[i].get(t) + "%'";
                        }else {
                            buf += " AND ";
                            buf += fields[i].getName() + " LIKE " + "'%" + fields[i].get(t) + "%'";
                        }
                        sql.append(buf);
                        cout++;
                    } else if (fields[i].getType().toString().equals("class java.lang.String")) {
                        if (cout == 0) {
                            buf = fields[i].getName() + " LIKE " + "'%" + fields[i].get(t) + "%'";
                        }else {
                            buf += " AND ";
                            buf += fields[i].getName() + " LIKE " + "'%" + fields[i].get(t) + "%'";
                        }
                        sql.append(buf);
                        cout++;
                    }
                }
            }
            stringBuffer.append(sql);
        }else {
            return new StringBuffer("");
        }
        return stringBuffer;
    }
}
