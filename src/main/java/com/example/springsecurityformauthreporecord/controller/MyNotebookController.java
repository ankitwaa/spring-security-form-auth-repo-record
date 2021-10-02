package com.example.springsecurityformauthreporecord.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MyNotebookController {

    @GetMapping("/secure/resource")
    public String hello(){
        return "main.html";
    }

    @GetMapping("/main")
    public String homw(){
        return "main.html";
    }
}
