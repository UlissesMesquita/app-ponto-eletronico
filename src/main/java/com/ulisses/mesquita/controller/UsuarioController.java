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
import com.ulisses.mesquita.services.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	//private UsuarioRepository usuarioRepository;
	private UsuarioService usuarioService;
	
	@GetMapping
	public List<Usuario> listar() {
		return usuarioService.listar();
	}
	
	@PostMapping
	public Usuario adicionarUsuario(@RequestBody Usuario usuario){
		return usuarioService.salvar(usuario);
	}
	
	@DeleteMapping("delete/{id}")
	public void deletarUsuario(@PathVariable Long id) {
		usuarioService.deletar(id);
	}
	
	@PutMapping("{id}")
	public void alterarUsuario(@PathVariable Long id, @RequestBody Usuario usuario){
		usuarioService.atualizar(id, usuario);
	}
}
