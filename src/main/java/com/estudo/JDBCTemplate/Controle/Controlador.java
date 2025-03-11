package com.estudo.JDBCTemplate.Controle;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estudo.JDBCTemplate.modelo.Camisa;
import com.estudo.JDBCTemplate.repositorio.Repositorio;

@RestController 
@RequestMapping("/api/camisas")
public class Controlador {

	
	Repositorio repositorio;
		
	public Controlador(Repositorio repositorio) {
		this.repositorio = repositorio;
	}

	@GetMapping
	public List<Camisa> ListaCamisas() {
		return repositorio.buscarCamisas();	
	}
}
