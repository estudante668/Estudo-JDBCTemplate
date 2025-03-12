package com.estudo.JDBCTemplate.modelo;

import org.springframework.data.annotation.Id;

import jakarta.validation.constraints.NotBlank;

public record Camisa(
		
		@Id
		Integer id, 
		String modelo, 
		String marca,
		@NotBlank
		String preco) {

}
