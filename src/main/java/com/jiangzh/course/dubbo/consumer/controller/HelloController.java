package com.jiangzh.course.dubbo.consumer.controller;

import com.jiangzh.course.dubbo.service.HelloServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author HanBin_Yang
 * @since 2022/7/31 10:42
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    private HelloServiceAPI helloServiceAPI;

    @GetMapping("/sayHello")
    public String sayHello() {
        String res = helloServiceAPI.sayHello("xiaoming");
        return res;
    }
}
