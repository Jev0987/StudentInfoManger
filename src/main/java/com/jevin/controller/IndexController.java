package com.jevin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/*
 *  @项目名：  StudentInfoManger
 *  @包名：    com.jevin.controller
 *  @文件名:   indexController
 *  @创建者:   85169
 *  @创建时间:  2019/10/17 9:40
 *  @描述：    TODO
 */
@Controller
public class IndexController {

    @GetMapping("/")
    public String login(){
        return "login";
    }

    @GetMapping("/getIndex")
    public String getIndex(){

        return "index";
    }

}
