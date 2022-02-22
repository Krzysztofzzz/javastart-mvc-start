package com.javastart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class WelcomeController {

    @GetMapping("/hello")
    @ResponseBody
    String hello(HttpServletRequest request){
        String name = request.getParameter("name");
        return "Hello " + name;
    }
}
