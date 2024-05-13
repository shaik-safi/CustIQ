package com.shaik.custiq.model;

import jakarta.persistence.*;
import jakarta.validation.*;
import jakarta.validation.constraints.*;
import lombok.*;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull(message = "Units cannot be null")
	private Integer units;

	@NotNull(message = "Price cannot be null")
	private Integer price;

	@ManyToOne
	@JoinColumn(name = "product_id")
	@Valid
	private Product product;

	@ManyToOne
	@JoinColumn(name = "invoice_id")
	@Valid
	private Invoice invoice;

	@ManyToOne
	@JoinColumn(name = "quotation_id")
	@Valid
	private Quotation quotation;
}