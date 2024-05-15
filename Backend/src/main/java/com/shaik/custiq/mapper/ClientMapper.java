package com.shaik.custiq.mapper;

import com.shaik.custiq.dto.ClientDTO;
import com.shaik.custiq.model.Client;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = EventMapper.class)
public interface ClientMapper {

    @Mapping(source = "events", target = "eventDTOList")
    ClientDTO toDTO(Client client);

    @Mapping(source = "eventDTOList", target = "events")
    Client toEntity(ClientDTO clientDTO);
}
