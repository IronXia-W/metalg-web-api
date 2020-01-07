package com.xwg.metalg.web.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test2")
public class Test2Controller {

    @RequestMapping(value = "/hello")
    public ModelAndView sayHello() {
        ModelAndView mav = new ModelAndView();
        mav.addObject("message", "SpringBoot 大爷你好！");
        mav.setViewName("templates/helloWorld.ftl");
        return mav;
    }
}
