package com.luizeduardo.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luizeduardo.cursomc.domain.Categoria;
import com.luizeduardo.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository categoriaRepository;

	public Categoria buscar(Integer id) {
		Optional<Categoria> categoriaobj = categoriaRepository.findById(id);
		return categoriaobj.orElse(null); // metodo orElse retorna null caso o objeto não tenha sido encontrado, caso tenha sido encontrado retorna o categoriaobj
	}
}
