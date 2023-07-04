package com.name.demo2.controller;

import com.name.demo2.entity.User;
import com.name.demo2.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class UserController{
    @Resource
    private UserService userService;
    //http://localhost:9000/login?username=xxx&password=yyy  页面没有内容
    //http://localhost:9000/login?username=admin&password=123456 {"id":100,"username":"admin","password":"123456"}
    @RequestMapping("login")
    //@ResponseBody告诉spring返回对象使用json输出
    //{"id":100,"username":"admin","password":"123456"}
    @ResponseBody
    public User login(User user){
        return  userService.findbylogin(user);
    }
}
