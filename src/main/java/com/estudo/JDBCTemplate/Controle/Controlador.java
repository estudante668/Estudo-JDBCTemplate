package com.estudo.JDBCTemplate.Controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/api/camisas")
public class Controlador {

	@GetMapping
	public String mensagem() {
		return "Ola Controlador";
	}
}
