package com.solunion.caucion.shared.api;


import com.solunion.caucion.shared.application.ClienteUseCase;
import com.solunion.caucion.shared.domain.ClienteDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/caucion")
public class ClienteController {
    @Autowired
    private ClienteUseCase clienteService;

    @PostMapping("/clientes")
    public ResponseEntity<ClienteDTO> saveCliente(@RequestBody ClienteDTO clienteDTO){
        return  ResponseEntity.ok(clienteService.saveCliente(clienteDTO));
    }

    @GetMapping("/clientes")
    public ResponseEntity<List<ClienteDTO>> geAllCliente(){
        return  ResponseEntity.ok(clienteService.getAllClientes());
    }

}
