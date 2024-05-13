package com.shaik.custiq.model;

import jakarta.persistence.*;
import jakarta.validation.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Quotation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull(message = "Date cannot be null")
	private LocalDate date;

	@OneToMany(mappedBy = "quotation", cascade = CascadeType.ALL, orphanRemoval = true)
	@Valid
	private List<ProductDetails> productsList;

	@OneToOne
	@JoinColumn(name = "event_id")
	@Valid
	private Event event;
}