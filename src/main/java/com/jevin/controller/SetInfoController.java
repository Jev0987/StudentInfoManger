package com.jevin.controller;

import com.jevin.pojo.Student;
import com.jevin.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/*
 *  @项目名：  StudentInfoManger
 *  @包名：    com.jevin.controller
 *  @文件名:   SetInfoController
 *  @创建者:   85169
 *  @创建时间:  2019/10/17 9:40
 *  @描述：    TODO
 */
@Controller
public class SetInfoController {

    @RequestMapping("/setInfo")
    public String turnInfo(){

        /**
         * 如果有学生数据，记得显示
         */


        return "/setInfo";
    }

    @RequestMapping("/student-setInfo")
    public String setInfo(Student student , ModelMap modelMap , HttpServletRequest request){
        String page = "setInfo";
        User user = (User) request.getSession().getAttribute("studentId");
        if (user == null) {
            return "login_fail";
        }


        return page;
    }

}
