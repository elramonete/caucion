package com.solunion.caucion.poliza.emitir.application;

import java.math.BigDecimal;
import java.util.Date;

public record EmitirPolizaCommand(
        Long clienteId,
        String tipo,
        BigDecimal prima,
        Date fechaEmision) {
}
