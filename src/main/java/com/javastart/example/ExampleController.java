package com.javastart.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ExampleController {

    @RequestMapping("/first")
    @ResponseBody
    String first(){
        return "Napis z metody first()";
    }

    @RequestMapping("/second")
    @ResponseBody
    String second(){
        return "Napis z metody second()";
    }
}
