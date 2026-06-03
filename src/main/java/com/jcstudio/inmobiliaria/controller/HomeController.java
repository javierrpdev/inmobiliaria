package com.jcstudio.inmobiliaria.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class HomeController {

    @GetMapping("/")
    public String inicio() {
        return "/public/index"; // Buscará en templates/public/index.html
    }

    @GetMapping("/login")
    public String login() {
        return "login"; // O "public/login" si él metió el login.html a la carpeta public
    }






}