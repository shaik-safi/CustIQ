package com.shaik.custiq.mapper;

import com.shaik.custiq.dto.QuotationDTO;
import com.shaik.custiq.model.Quotation;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = ProductDetailsMapper.class)
public interface QuotationMapper {

    @Mapping(source = "productsList", target = "productDetailsDTOList")
    @Mapping(source = "event", target = "eventDTO")
    QuotationDTO toDTO(Quotation quotation);

    @Mapping(source = "productDetailsDTOList", target = "productsList")
    @Mapping(source = "eventDTO", target = "event")
    Quotation toEntity(QuotationDTO quotationDTO);
}
