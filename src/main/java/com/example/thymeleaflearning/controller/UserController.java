package com.example.thymeleaflearning.controller;

import com.example.thymeleaflearning.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    //http://localhost:8080/variable-expression
    @GetMapping("/variable-expression")
    public String variableExpression(Model model){
        User user = new User("Pepe", "pepe@gmail.com", "director","male");
        model.addAttribute("user", user);
        return "variable-expression";
    }

    //handles method to handle selection-expression
    //http://localhost:8080/selection-expression
    @GetMapping("/selection-expression")
    public String selectionExpression(Model model){
        User user = new User("Romero", "rom@gmail.com", "profesor","male");
        model.addAttribute("user", user);
        return "selection-expression";
    }

    //handles method to handle message-expression
    //http://localhost:8080/message-expression
    @GetMapping("/message-expression")
    public String messageExpression(Model model) {
        return "message-expression";
    }

}
