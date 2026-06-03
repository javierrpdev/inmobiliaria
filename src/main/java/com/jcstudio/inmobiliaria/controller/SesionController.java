package com.jcstudio.inmobiliaria.controller;

import com.jcstudio.inmobiliaria.model.Sesion;
import com.jcstudio.inmobiliaria.repository.SesionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/sesiones")
public class SesionController {

    @Autowired
    private SesionRepository sesionRepository;

    @GetMapping
    public List<Sesion> listar() {
        return sesionRepository.findAll();
    }
}