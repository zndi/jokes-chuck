package com.zndi.jokeschuck.controller;


import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JokeChuckController {

    @Autowired
    private ChuckNorrisQuotes chuckNorrisQuotes;

    @GetMapping({"/", ""})
    public String getJoke(Model model) {
        model.addAttribute("joke", chuckNorrisQuotes.getRandomQuote());
        return "index";
    }
}
