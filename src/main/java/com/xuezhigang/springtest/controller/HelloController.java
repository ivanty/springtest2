package com.xuezhigang.springtest.controller;

import com.xuezhigang.springtest.bean.User;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


//@RestController
@Controller
@EnableAutoConfiguration
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    private String index() {
        return "Hello";
    }
    @GetMapping("/getUser")
    @ResponseBody
    private User getUser(){
        User user=new User();
        user.setUsername("小明2");
        user.setPassword("xxxx");
        return user;

    }

    @GetMapping("/hello/interesting")
    private String indexoflast() {
        return "/getUser";
    }

}
