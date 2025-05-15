package com.solunion.caucion.poliza.emitir.domain;

import org.springframework.stereotype.Repository;

import java.util.Optional;


public interface PolizaRepository {
    Poliza save(Poliza poliza);
    Optional<Poliza> findById(Long id);
}
