package com.thenestedpearl.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by omsairam on 2/28/2017.
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public String home(){
        return "index";

    }
}
