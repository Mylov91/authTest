package ru.mylov.springcourse.FirstSecurityApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {
    @GetMapping("/hello")
    public String sayHello() {
        return "hello";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
