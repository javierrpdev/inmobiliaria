package com.jcstudio.inmobiliaria.controller;


import com.jcstudio.inmobiliaria.model.Contrato;
import com.jcstudio.inmobiliaria.service.ContratoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contratos")
public class ContratoController {
    @Autowired
    private ContratoService contratoService;

    @PostMapping
    public ResponseEntity<Contrato> crear(@RequestBody Contrato contrato) {
        return ResponseEntity.ok(contratoService.guardar(contrato));
    }
}