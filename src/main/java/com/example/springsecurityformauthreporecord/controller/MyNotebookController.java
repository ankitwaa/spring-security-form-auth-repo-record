package com.example.springsecurityformauthreporecord.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyNotebookController {

    @GetMapping("/secure/resource")
    public String hello(){
        return "hello";
    }
}
