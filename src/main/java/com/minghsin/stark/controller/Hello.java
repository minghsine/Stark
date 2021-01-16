package com.minghsin.stark.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class Hello {


    @ResponseBody
    @RequestMapping("/world")
    public String hello(){
        return "hello,world";
    }
}
