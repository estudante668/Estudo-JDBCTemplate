package com.estudo.JDBCTemplate.Controle;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.estudo.JDBCTemplate.modelo.Camisa;
import com.estudo.JDBCTemplate.repositorio.Repositorio;

import jakarta.validation.Valid;

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
	
	@GetMapping("/{id}")
	public Optional<Camisa> buscarListaId(@PathVariable Integer id){
		return repositorio.buscarListaId(id);
	}
	
	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping 
	public void inserir(@Valid @RequestBody Camisa camisa) {
		repositorio.salvarProduto(camisa);
	}
	
	@PutMapping("/{id}")
	public void atualizar(@RequestBody Camisa camisa, @PathVariable Integer id ) {
		if(!repositorio.existeId(id)) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Conteudo não encotrado");
		}
		repositorio.salvarProduto(camisa);
	}
}
