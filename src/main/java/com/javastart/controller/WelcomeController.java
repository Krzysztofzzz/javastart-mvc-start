package com.javastart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
public class WelcomeController {

    @GetMapping("/hello")
    @ResponseBody
    String hello(@RequestParam String name){
        return "Hello " + name;
    }
}
