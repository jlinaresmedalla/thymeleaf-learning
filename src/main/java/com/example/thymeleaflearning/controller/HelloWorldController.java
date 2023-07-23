package com.example.thymeleaflearning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

    //handles GET requests for /hello-world
    //http://localhost:8080/hello-world
    @GetMapping("/hello-world")
    public String helloWorld(Model model) {
        model.addAttribute("message", "Hello World!");
        return "hello-world";
    }

}
