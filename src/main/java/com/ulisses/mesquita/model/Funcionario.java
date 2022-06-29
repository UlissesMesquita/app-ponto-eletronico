package com.ulisses.mesquita.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.lang.Nullable;

import lombok.Data;

@Entity
@Data
public class Funcionario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private String sobrenome;
	
	@Nullable
	private Long idDigital;
	@Nullable
	private Long cod_localizacaoX;
	@Nullable
	private Long cod_localizacaoY;
	
}
