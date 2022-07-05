package com.ulisses.mesquita.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
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
	@ResponseStatus(HttpStatus.OK)
	public List<Usuario> listar() {
		return usuarioService.listar();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario adicionarUsuario(@Valid @RequestBody Usuario usuario){
		return usuarioService.salvar(usuario);
	}

	@DeleteMapping("delete/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void deletarUsuario(@PathVariable @Valid Long id) {
		usuarioService.deletar(id);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(HttpStatus.OK)
	public void alterarUsuario(@PathVariable Long id, @RequestBody Usuario usuario){
		usuarioService.atualizar(id, usuario);
	}
}
