package com.jcstudio.inmobiliaria.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.jcstudio.inmobiliaria.model.Propiedad;
import com.jcstudio.inmobiliaria.repository.PropiedadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin; // Importante añadir esto
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/propiedades")
public class PropiedadController {

    @Autowired
    private PropiedadRepository repository;

    @GetMapping
    public List<Propiedad> listarPropiedades() {
        return repository.findAll();
    }

   // @DeleteMapping("/{id}")
   // public void eliminarPropiedad(@PathVariable Long id) {
    //    repository.deleteById(id);AL RATO
   // }
}