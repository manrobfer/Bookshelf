package br.com.livros.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/")
    public String getMessage(){
        return "welcome to Jenkins deployment projects \n this is just a new line I have added";
    }
}
