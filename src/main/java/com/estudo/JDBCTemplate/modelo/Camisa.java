package com.estudo.JDBCTemplate.modelo;

import jakarta.validation.constraints.NotBlank;

public record Camisa(
		Integer id, 
		String modelo, 
		String marca,
		@NotBlank
		String preco) {

}
