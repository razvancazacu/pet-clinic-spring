package com.spring.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ErrorController {
    static final String URL_ERROR = "/error";

    @GetMapping(URL_ERROR)
    public String triggerError(){
        throw new RuntimeException("Expected: Controller route for errors called");
    }
}
