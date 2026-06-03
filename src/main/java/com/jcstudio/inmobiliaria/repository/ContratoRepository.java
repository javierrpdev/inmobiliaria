package com.jcstudio.inmobiliaria.repository;


import com.jcstudio.inmobiliaria.model.Contrato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContratoRepository extends JpaRepository<Contrato, Long> {
}