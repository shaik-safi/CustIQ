package com.shaik.custiq.model;

import jakarta.persistence.*;
import jakarta.validation.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Event {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "Name cannot be blank")
	private String name;

	@NotNull(message = "Date cannot be null")
	private LocalDate date;

	@ManyToOne
	@JoinColumn(name = "client_id")
	@Valid
	private Client client;

	@OneToOne(mappedBy = "event", cascade = CascadeType.ALL, orphanRemoval = true)
	@Valid
	private Quotation quotation;

	@OneToOne(mappedBy = "event", cascade = CascadeType.ALL, orphanRemoval = true)
	@Valid
	private Invoice invoice;
}