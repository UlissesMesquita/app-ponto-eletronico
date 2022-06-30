package com.ulisses.mesquita.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ulisses.mesquita.model.Usuario;
import com.ulisses.mesquita.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@GetMapping
	public List<Usuario> listarUsuarios(){
		return usuarioRepository.findAll();
	}
	
	@PostMapping
	public Usuario adicionarUsuario(@RequestBody Usuario usuario){
		return usuarioRepository.save(usuario);
	}
	
	@DeleteMapping("usuario/delete/{id}")
	public void deletarUsuario(@PathVariable Long id ) {
		usuarioRepository.deleteById(id);
	}
	
	@PutMapping("{id}")
	public Usuario alterarUsuario(@PathVariable Long id, @RequestBody Usuario usuario){
		Usuario usuarioTeste = usuarioRepository.getReferenceById(id);
		
		usuarioTeste.setEmail(usuario.getEmail());
		usuarioTeste.setPassword(usuario.getPassword());
		
		return   usuarioRepository.save(usuarioTeste);
	}
}
