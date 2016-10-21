package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by cdyoue on 2016/10/21.
 */
@Controller
public class WebController {

    @RequestMapping(value = "/",method = RequestMethod.GET )
    public String index(){
        return "index";
    }
    @RequestMapping(value = "/loginPage",method = RequestMethod.GET)
    public String loginPage(){
        return "login";
    }
    @RequestMapping(value = "/userInfo",method = RequestMethod.GET)
    public String userInfo(){
        return "/user/userInfo";
    }

}
