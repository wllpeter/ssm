package com.demo.controller;

import com.demo.pojo.User;
import com.demo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping(value = "/showUser.do",method = RequestMethod.GET)
    @ResponseBody
    public User selectUser(@RequestParam(value = "id")Long id)  {
        return userService.selectUser(id);
    }


}
