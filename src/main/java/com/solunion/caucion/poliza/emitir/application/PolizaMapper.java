package com.solunion.caucion.poliza.emitir.application;

import com.solunion.caucion.shared.application.mapper.ClienteMapper;

import com.solunion.caucion.poliza.emitir.domain.Poliza;
import com.solunion.caucion.shared.domain.Cliente;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;


@Mapper(componentModel = "spring", uses = {ClienteMapper.class})
public interface PolizaMapper {
    PolizaMapper INSTANCE = Mappers.getMapper(PolizaMapper.class);

   /* @Mapping(source = "id", target = "id")
    @Mapping(source = "tipo", target = "tipo")
    @Mapping(source = "cliente", target = "cliente")
    @Mapping(source = "fechaEmision", target = "fechaEmision")
    @Mapping(source = "prima", target = "prima")
    PolizaDTO toDTO(Poliza poliza);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "tipo", target = "tipo")
    @Mapping(source = "cliente", target = "cliente")
    @Mapping(source = "fechaEmision", target = "fechaEmision")
    @Mapping(source = "prima", target = "prima")
    Poliza toEntity(PolizaDTO polizaDTO);*/

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "cliente", expression = "java(cliente)")  // inyectás el cliente manualmente
    Poliza toEntity(EmitirPolizaCommand command, Cliente cliente);

    @Mapping(source = "id", target = "id")
    EmitirPolizaResponse toResponse(Poliza poliza);
}
