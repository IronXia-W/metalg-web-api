package com.xwg.metalg.web.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping
    public String sayHello(){
        System.err.println("fanfan");
        return "hello! world";
    }
}
