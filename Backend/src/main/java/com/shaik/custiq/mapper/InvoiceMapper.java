package com.shaik.custiq.mapper;

import com.shaik.custiq.dto.InvoiceDTO;
import com.shaik.custiq.model.Invoice;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = ProductDetailsMapper.class)
public interface InvoiceMapper {

    @Mapping(source = "productsList", target = "productDetailsDTOList")
    @Mapping(source = "event", target = "eventDTO")
    InvoiceDTO toDTO(Invoice invoice);

    @Mapping(source = "productDetailsDTOList", target = "productsList")
    @Mapping(source = "eventDTO", target = "event")
    Invoice toEntity(InvoiceDTO invoiceDTO);
}
