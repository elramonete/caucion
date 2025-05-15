package com.solunion.caucion.poliza.emitir.infrastructure;

import com.solunion.caucion.poliza.emitir.domain.Poliza;
import com.solunion.caucion.poliza.emitir.domain.PolizaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class PolizaJpaRepository implements PolizaRepository {

    @Autowired
    private SpringDataPolizaJpa springDataPolizaJpa;

    @Override
    public Poliza save(Poliza poliza) {
        return springDataPolizaJpa.save(poliza);
    }

    @Override
    public Optional<Poliza> findById(Long id) {
        return springDataPolizaJpa.findById(id);
    }
}
