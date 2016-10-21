package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by cdyoue on 2016/10/21.
 */
@Controller
public class webController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
