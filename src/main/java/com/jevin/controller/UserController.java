package com.jevin.controller;

import com.jevin.dao.UserRepository;
import com.jevin.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/*
 *  @项目名：  StudentInfoManger
 *  @包名：    com.jevin.controller
 *  @文件名:   UserController
 *  @创建者:   85169
 *  @创建时间:  2019/10/18 14:39
 *  @描述：    用户登录模块
 */
@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;


    @RequestMapping(value = "/dologin" , method = {RequestMethod.GET , RequestMethod.POST})
    public String dologin(User user , HttpServletRequest request , ModelMap modelMap){
        String page = "index";
        List<User> userList = userRepository.findUserByStudentId(user.getStudentId());
        if (userList.size() == 0) {
            //账号错误
            page = "login_fail";
        }else {
            if (!userList.get(0).getPassword().equals(user.getPassword())) {
                //密码错误
                page = "login_fail";
            }else {
                //登录成功
                User userLogin = userList.get(0);
                request.getSession().setAttribute("user", userLogin);
            }
            System.out.println("该账号已成功登录：" + userList.get(0));
        }
        modelMap.addAttribute("studentId", user.getStudentId());
        return page;
    }

}
