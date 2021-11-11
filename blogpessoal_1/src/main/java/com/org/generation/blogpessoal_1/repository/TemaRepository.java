package com.org.generation.blogpessoal_1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.generation.blogpessoal_1.Model.Tema;

public interface TemaRepository extends JpaRepository<Tema, Long> {
	
public List<Tema> findAllByDescricaoContainingIgnoreCase (String descricao);	

}
