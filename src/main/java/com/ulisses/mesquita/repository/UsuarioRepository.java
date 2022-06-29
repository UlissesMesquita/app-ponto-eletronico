package com.ulisses.mesquita.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ulisses.mesquita.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
