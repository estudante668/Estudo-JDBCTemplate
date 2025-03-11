package com.estudo.JDBCTemplate.repositorio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.estudo.JDBCTemplate.modelo.Camisa;

import jakarta.annotation.PostConstruct;

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
	
}
