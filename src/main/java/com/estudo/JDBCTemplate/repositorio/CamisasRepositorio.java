package com.estudo.JDBCTemplate.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import com.estudo.JDBCTemplate.modelo.Camisa;

public interface CamisasRepositorio extends ListCrudRepository<Camisa, Integer> {
	
}
