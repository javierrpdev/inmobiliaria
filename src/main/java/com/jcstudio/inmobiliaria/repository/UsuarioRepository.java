package com.jcstudio.inmobiliaria.repository;

import com.jcstudio.inmobiliaria.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    // Spring crea esta consulta automáticamente basándose en el nombre del método
    Optional<Usuario> findByEmail(String email);
}