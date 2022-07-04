package com.ulisses.mesquita.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Data
@Table(name = "usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty
	@NotBlank(message = "The email cannot be a blank field")
	@NotNull(message = "The email cannot be empty")
	@Column(nullable = false)
	private String email;
	
	@NotEmpty
	@NotBlank(message = "The password cannot be a blank field")
	@NotNull(message = "The password cannot be empty")
	@Column(nullable = false)
	private String password;
	
	
	
	
	
	
	
	
	
	
}
