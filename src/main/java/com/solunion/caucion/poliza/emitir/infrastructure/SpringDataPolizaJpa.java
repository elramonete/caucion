package com.solunion.caucion.poliza.emitir.infrastructure;

import com.solunion.caucion.poliza.emitir.domain.Poliza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataPolizaJpa extends JpaRepository<Poliza, Long> {
}
