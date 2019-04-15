package com.example.demo.controller;


import com.example.pojo.Result;
import com.example.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController  //@Controller +  @ResponseBody
//@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/getUser")
    public User getUser() {
        User u = new User();
        u.setName("333");

        return u;
    }

    @RequestMapping("/getUserJson")
    public Result getUserJson() {
        User u = new User();
        u.setName("3333");

        return Result.ok(u);
    }

}
