package com.jcstudio.inmobiliaria.repository;

import com.jcstudio.inmobiliaria.model.Sesion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface SesionRepository extends JpaRepository<Sesion, Long> {
    // Útil para buscar una sesión activa mediante el token
    Optional<Sesion> findByToken(String token);
}