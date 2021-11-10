package com.payphone.day2.controller;

import org.springframework.stereotype.Controller;

@Controller
public class NotFound {

    //    @RequestMapping("*")
    public String notFound() {
        return "404";
    }
}
