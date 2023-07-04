package com.name.demo2.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class IndexControlller {
    @RequestMapping
    public String index(Model model){
        //添加属性
        model.addAttribute("msg","welcome spring boot"+new Date().toLocaleString());
        //返回的字符串代表templates的index,默认加上后缀.html
        return "index";
    }
}
