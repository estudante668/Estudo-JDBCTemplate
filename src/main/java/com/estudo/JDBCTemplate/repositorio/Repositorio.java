package com.estudo.JDBCTemplate.repositorio;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.estudo.JDBCTemplate.modelo.Camisa;

import jakarta.annotation.PostConstruct;
import jakarta.validation.Valid;

@Repository
public class Repositorio {

	List<Camisa> listaCamisa = new ArrayList<>();
	
	@PostConstruct
	public void inicio() {
		Camisa c = new Camisa(1,"Adidas","Tials","786.87");
		listaCamisa.add(c);
	}
	
	
	public List<Camisa> buscarCamisas(){
		return listaCamisa;
	}


	public Optional<Camisa> buscarListaId(Integer id) {
		return listaCamisa.stream().filter( obj -> obj.id().equals(id)).findFirst();
	}


	public void salvarProduto(@Valid Camisa camisa) {
		
		listaCamisa.add(camisa);
		
	}

	public boolean existeId(Integer id) {
		return listaCamisa.stream().filter(obj -> obj.id().equals(id)).count() == 1;
	}
	
}
