package ru.ssau.seedbank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/articles")
public class ArticlesController {

    @GetMapping
    public String articles() {
        return "articles";
    }

}
