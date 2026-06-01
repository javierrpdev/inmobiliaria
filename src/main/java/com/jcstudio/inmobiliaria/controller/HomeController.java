package com.jcstudio.inmobiliaria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {

    @GetMapping("/") // Esto le dice a Java que responda cuando entres a localhost:8080
    public String inicio() {
        // Le dice a Thymeleaf que busque en templates/publico/index.html
        return "public/index";
    }
}
