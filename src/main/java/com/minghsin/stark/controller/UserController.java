package com.minghsin.stark.controller;


import com.minghsin.stark.entity.User;
import com.minghsin.stark.mapper.UserMapper;
import com.minghsin.stark.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author minghsin
 * @since 2021-01-17
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    @ResponseBody
    public List<User> index(){
        return userService.list();
    }

}

