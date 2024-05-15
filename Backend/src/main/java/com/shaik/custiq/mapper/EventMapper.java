package com.shaik.custiq.mapper;

import com.shaik.custiq.dto.EventDTO;
import com.shaik.custiq.model.Event;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {ClientMapper.class, QuotationMapper.class, InvoiceMapper.class})
public interface EventMapper {

    @Mapping(source = "client", target = "clientDTO")
    @Mapping(source = "quotation", target = "quotationDTO")
    @Mapping(source = "invoice", target = "invoiceDTO")
    EventDTO toDTO(Event event);

    @Mapping(source = "clientDTO", target = "client")
    @Mapping(source = "quotationDTO", target = "quotation")
    @Mapping(source = "invoiceDTO", target = "invoice")
    Event toEntity(EventDTO eventDTO);
}
