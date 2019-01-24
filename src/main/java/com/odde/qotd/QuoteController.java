package com.odde.qotd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quotes")
public class QuoteController {

    private final QuoteRepository repository;

    @Autowired
    public QuoteController(QuoteRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/today")
    @ResponseBody
    public Quote getQuoteOfTheDay(){
        return repository.getRandom();
    }
}
