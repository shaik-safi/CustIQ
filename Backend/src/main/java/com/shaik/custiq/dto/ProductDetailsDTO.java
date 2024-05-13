package com.shaik.custiq.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDetailsDTO {
    private Long id;
    private Integer units;
    private Integer price;
    private Long productId;
    private Long invoiceId;
    private Long quotationId;
}
