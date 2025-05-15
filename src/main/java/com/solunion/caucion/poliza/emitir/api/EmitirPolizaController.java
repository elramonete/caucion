package com.solunion.caucion.poliza.emitir.api;

import com.solunion.caucion.poliza.emitir.application.EmitirPolizaCommand;
import com.solunion.caucion.poliza.emitir.application.EmitirPolizaResponse;
import com.solunion.caucion.poliza.emitir.application.EmitirPolizaUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/polizas")
public class EmitirPolizaController {

    @Autowired
    private EmitirPolizaUseCase useCase;

    /*public EmitirPolizaController(EmitirPolizaUseCase useCase) {
        this.useCase = useCase;
    }*/

    @PostMapping("/emitir")
    public ResponseEntity<EmitirPolizaResponse> emitir(@RequestBody EmitirPolizaCommand command) {
        return ResponseEntity.ok(useCase.emitir(command));
    }
}
