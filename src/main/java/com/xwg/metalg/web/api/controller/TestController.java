package com.xwg.metalg.web.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ajax")
public class TestController {

    @RequestMapping("/hello")
    public String sayHello(){
        return "{'message1': 'SpringBoot你大爷','message2','SpringBoot你大爷2'}";
    }
}
