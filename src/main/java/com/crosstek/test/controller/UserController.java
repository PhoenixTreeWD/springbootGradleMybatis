package com.crosstek.test.controller;

import com.crosstek.test.pojo.User;
import com.crosstek.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by WuDi on 2017/7/3 0003.
 */
@Controller
@RequestMapping(value={"/home","/reward","/user"})
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/test")
    @ResponseBody
    public User test(){
        return userService.selectUserById();
    }
    @RequestMapping("/demo")
    @ResponseBody
    public String demo(){
        return "aaaaa";
    }
}
