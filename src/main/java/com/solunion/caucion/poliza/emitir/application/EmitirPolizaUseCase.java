package com.solunion.caucion.poliza.emitir.application;

import com.solunion.caucion.shared.domain.ClienteRepository;
import com.solunion.caucion.poliza.emitir.domain.Poliza;
import com.solunion.caucion.poliza.emitir.domain.PolizaRepository;
import com.solunion.caucion.shared.domain.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmitirPolizaUseCase {
    @Autowired
    private PolizaRepository polizaRepository;
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private PolizaMapper  polizaMapper;

    public EmitirPolizaResponse emitir(EmitirPolizaCommand command) {
        Cliente cliente = clienteRepository.findById(command.clienteId())
                .orElseThrow(() -> new IllegalArgumentException("Cliente no encontrado"));

        Poliza poliza = polizaMapper.toEntity(command, cliente);
        poliza = polizaRepository.save(poliza);

        return polizaMapper.toResponse(poliza);
    }

}
