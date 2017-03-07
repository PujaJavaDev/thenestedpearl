package com.thenestedpearl.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by omsairam on 03/06/2017.
 */
@Controller
public class CopyController {

    @RequestMapping("/about")
    public String about() {
        return "copy/about";
    }
}
