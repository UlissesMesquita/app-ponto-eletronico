package com.ulisses.mesquita.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ulisses.mesquita.model.Usuario;
import com.ulisses.mesquita.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	UsuarioRepository usuarioRepository;
	
	@GetMapping
	public List<Usuario> listarUsuarios(){
		return usuarioRepository.findAll();
	}
	
	@PostMapping
	public Usuario adcionarUsuario(@RequestBody Usuario usuario){
		return usuarioRepository.save(usuario);
	}
	

}
