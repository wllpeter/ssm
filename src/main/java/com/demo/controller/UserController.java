package com.demo.controller;

import com.demo.pojo.User;
import com.demo.service.UserService;
import com.demo.util.Response;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping(value = "/showUser",method = RequestMethod.GET)
    @ResponseBody
    public Response selectUser(@RequestParam(value = "id")Long id)  {
        return Response.success(userService.selectUser(id));
    }

    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    @ResponseBody
    public Response addUser(@RequestBody User user )  {
        return Response.success(userService.addUser(user));
    }


}
