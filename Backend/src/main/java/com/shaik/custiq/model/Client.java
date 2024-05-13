package com.shaik.custiq.model;

import jakarta.persistence.*;
import jakarta.validation.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(unique = true)
	@NotBlank(message = "Name cannot be blank")
	private String name;

	@NotEmpty(message = "Phone cannot be empty")
	private String phone;

	@Email(message = "Email must be valid")
	@NotBlank(message = "Email cannot be blank")
	private String email;

	@NotBlank(message = "City cannot be blank")
	private String city;

	@NotBlank(message = "State cannot be blank")
	private String state;

	@NotBlank(message = "Zip Code cannot be blank")
	private String zipCode;

	@NotBlank(message = "Country cannot be blank")
	private String country;

	@OneToMany(mappedBy = "client", cascade = CascadeType.ALL, orphanRemoval = true)
	@Valid
	private List<Event> events;
}