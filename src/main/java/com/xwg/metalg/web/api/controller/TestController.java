package com.xwg.metalg.web.api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ajax")
public class TestController {

    Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping("/hello")
    public String sayHello() {
        String property = System.getProperty("name");
        logger.error("property", property);
        logger.error("property:" + property);
        return "{'message1': '" + property + "','message2','SpringBoot呵呵'}";
    }
}
