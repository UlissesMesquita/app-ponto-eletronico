package com.ulisses.mesquita.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.Data;

@Entity
@Data
public class Horario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long id_funcionario;
	
	private LocalDate startTime;
	private LocalDate LaunchStartTime;
	private LocalDate LauchTFinalTime;
	private LocalDate FinalTime;
	private LocalDate StartExtraTime;
	private LocalDate FinalExtraTime;
	private LocalDate StartSobreAvisoTime;
	private LocalDate FinalSobreAvisoTime;
	
}
