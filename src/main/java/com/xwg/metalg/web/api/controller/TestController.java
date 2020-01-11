package com.xwg.metalg.web.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ajax")
public class TestController {

    @RequestMapping("/hello")
    public String sayHello() {
        String property = System.getProperty("name");
        return "{'message1': '" + property + "','message2','SpringBoot呵呵'}";
    }
}
