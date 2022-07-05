package com.ulisses.mesquita.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ulisses.mesquita.model.Usuario;
import com.ulisses.mesquita.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;


	public List<Usuario> listar(){
		return usuarioRepository.findAll();
	}
	

	public Usuario salvar(Usuario usuario) {
		return usuarioRepository.save(usuario);
	};

	public void deletar(Long id) {
		usuarioRepository.deleteById(id);
	};
	

	public void atualizar(Long id, Usuario usuario) {
		Usuario usuarioTeste = usuarioRepository.getReferenceById(id);
		
		usuarioTeste.setEmail(usuario.getEmail());
		usuarioTeste.setPassword(usuario.getPassword());
		
	}


}
