package com.solunion.caucion.shared.application.mapper;


import com.solunion.caucion.shared.domain.Cliente;
import com.solunion.caucion.shared.domain.ClienteDTO;
import org.mapstruct.Mapper;

import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ClienteMapper {
    com.solunion.caucion.shared.application.mapper.ClienteMapper INSTANCE = Mappers.getMapper(com.solunion.caucion.shared.application.mapper.ClienteMapper.class);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "nombre", target = "nombre")
    @Mapping(source = "direccion", target = "direccion")
    @Mapping(source = "telefono", target = "telefono")
    ClienteDTO toDTO(Cliente cliente);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "nombre", target = "nombre")
    @Mapping(source = "direccion", target = "direccion")
    @Mapping(source = "telefono", target = "telefono")
    Cliente toEntity(ClienteDTO clienteDTO);
}

