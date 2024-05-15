package com.shaik.custiq.mapper;

import com.shaik.custiq.dto.ProductDetailsDTO;
import com.shaik.custiq.model.ProductDetails;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {ProductMapper.class, InvoiceMapper.class, QuotationMapper.class})
public interface ProductDetailsMapper {

    @Mapping(source = "product", target = "productDTO")
    @Mapping(source = "invoice", target = "invoiceDTO")
    @Mapping(source = "quotation", target = "quotationDTO")
    ProductDetailsDTO toDTO(ProductDetails productDetails);

    @Mapping(source = "productDTO", target = "product")
    @Mapping(source = "invoiceDTO", target = "invoice")
    @Mapping(source = "quotationDTO", target = "quotation")
    ProductDetails toEntity(ProductDetailsDTO productDetailsDTO);
}

