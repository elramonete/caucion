package com.solunion.caucion.shared.application;

import com.solunion.caucion.shared.domain.ClienteDTO;
import com.solunion.caucion.shared.domain.ClienteRepository;
import com.solunion.caucion.shared.application.mapper.ClienteMapper;
import com.solunion.caucion.shared.domain.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClienteUseCase {

    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private ClienteMapper clienteMapper;

    public ClienteDTO saveCliente(ClienteDTO clienteDTO) {
        Cliente cliente = clienteMapper.toEntity(clienteDTO);
        return clienteMapper.toDTO(clienteRepository.save(cliente));
    }


    public List<ClienteDTO> getAllClientes() {
        return clienteRepository.findAll().stream().map(clienteMapper::toDTO)
                .collect(Collectors.toList());
    }
}
