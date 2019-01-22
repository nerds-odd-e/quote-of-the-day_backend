package com.odde.qotd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quotes")
public class QuoteController {
    @GetMapping("/today")
    @ResponseBody
    public Quote getQuoteOfTheDay(){
        return new Quote();
    }
}
