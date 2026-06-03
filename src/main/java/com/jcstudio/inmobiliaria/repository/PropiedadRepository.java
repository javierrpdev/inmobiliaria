package com.jcstudio.inmobiliaria.repository;

import com.jcstudio.inmobiliaria.model.Propiedad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropiedadRepository extends JpaRepository<Propiedad, Long> {
    // Aquí no necesitas escribir nada más.
    // JpaRepository ya trae incluidos métodos como:
    // .findAll() -> Trae todos los registros
    // .findById() -> Busca por ID
    // .save() -> Guarda un registro nuevo o actualiza uno existente
}