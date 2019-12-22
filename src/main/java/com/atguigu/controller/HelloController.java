package com.atguigu.controller;

import com.atguigu.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 **/
@Controller
class HelloController {

    @Autowired
    HelloService helloService;

    @ResponseBody
    @RequestMapping("/hello")
    public String hello()
    {
        String hello=helloService.sayHello("tomcat...");
        return hello;
    }

    @RequestMapping("/success")
    public String success()
    {
        return "success";
    }

}
