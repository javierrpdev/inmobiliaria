package com.jcstudio.inmobiliaria.controller;

import com.jcstudio.inmobiliaria.model.Cliente;
import com.jcstudio.inmobiliaria.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/clientes")
public class ClienteControlador{

    @Autowired
    private ClienteRepository repository;

    @GetMapping
    public List<Cliente> listarClientes() {
        return repository.findAll();
    }
}