package com.org.generation.blogpessoal_1.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.org.generation.blogpessoal_1.Model.Usuario;


@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	
	
	public Optional<Usuario> findByUsuario(String usuario);

	
}
