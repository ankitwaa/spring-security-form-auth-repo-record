package com.example.springsecurityformauthreporecord.controller;

import com.example.springsecurityformauthreporecord.dao.repo.entity.GitRepoUrlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MyNotebookController {

    private GitRepoUrlRepository gitRepoUrlRepository;

    @Autowired
    public void setGitRepoUrlRepository(GitRepoUrlRepository gitRepoUrlRepository) {
        this.gitRepoUrlRepository = gitRepoUrlRepository;
    }

    @GetMapping("/secure/resource")
    public String hello(){
        return "main.html";
    }

    @GetMapping("/main")
    public String homw(Model model, Authentication authentication){
        model.addAttribute("username", authentication.getName());
        model.addAttribute("products", this.gitRepoUrlRepository.findByUsername(authentication.getName()).get());
        return "main.html";
    }
}
