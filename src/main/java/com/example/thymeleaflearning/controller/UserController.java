package com.example.thymeleaflearning.controller;

import com.example.thymeleaflearning.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {

    //http://localhost:8080/variable-expression
    @GetMapping("/variable-expression")
    public String variableExpression(Model model){
        User user = new User("Pepe", "pepe@gmail.com", "director","male");
        model.addAttribute("user", user);
        return "variable-expression";//this is the name of the template
    }

    //handles method to handle selection-expression
    //http://localhost:8080/selection-expression
    @GetMapping("/selection-expression")
    public String selectionExpression(Model model){
        User user = new User("Romero", "rom@gmail.com", "profesor","male");
        model.addAttribute("user", user);
        return "selection-expression";//this is the name of the template
    }

    //handles method to handle message-expression
    //http://localhost:8080/message-expression
    @GetMapping("/message-expression")
    public String messageExpression(Model model) {
        return "message-expression";//this is the name of the template
    }

    //handles method to handle link-expression
    //http://localhost:8080/link-expression
    @GetMapping("/link-expression")
    public String linkExpression(Model model) {
        model.addAttribute("id", 1);
        return "link-expression";//this is the name of the template
    }

    //handles method to handle fragment-expression
    //http://localhost:8080/fragment-expression
    @GetMapping("/fragment-expression")
    public String fragmentExpression() {
        return "fragment-expression";//this is the name of the template
    }

    //handles method to handle selection-expression
    //http://localhost:8080/users
    @GetMapping("/users")
    public String users(Model model){
        List<User> listUser = List.of(new User("Romero", "rom@gmail.com", "profesor","male"),new User("Rmadesh", "rams@gmail.com", "auxiliar","male"),new User("Mina", "mina@gmail.com", "admin","female"));
        model.addAttribute("users", listUser);
        return "users";//this is the name of the template
    }

}
