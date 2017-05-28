package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by shuai on 2017/5/28.
 */
@Controller
@RequestMapping(value = "/api/v1/demo")
public class DemoController {

    @RequestMapping(value = "/welcome")
    public String demoReturnSuccess(){
        return "welcome";
    }
}
