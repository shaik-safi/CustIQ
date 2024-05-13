package com.shaik.custiq.dto;

import lombok.*;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuotationDTO {
	private Long id;
	private Date date;
	private List<ProductDetailsDTO> productsList;
	private Long event_id;
}