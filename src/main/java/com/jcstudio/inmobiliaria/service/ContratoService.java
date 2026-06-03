package com.jcstudio.inmobiliaria.service;

import com.jcstudio.inmobiliaria.model.Contrato;             // <--- IMPORTANTE
import com.jcstudio.inmobiliaria.repository.ContratoRepository; // <--- IMPORTANTE
import org.springframework.stereotype.Service;             // <--- IMPORTANTE
import org.springframework.beans.factory.annotation.Autowired; // <--- IMPORTANTE

@Service
public class ContratoService {
    @Autowired
    private ContratoRepository contratoRepository;

    public Contrato guardar(Contrato contrato) {
        return contratoRepository.save(contrato);
    }
}