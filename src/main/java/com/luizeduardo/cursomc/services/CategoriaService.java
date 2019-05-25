package com.luizeduardo.cursomc.services;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luizeduardo.cursomc.domain.Categoria;
import com.luizeduardo.cursomc.exceptions.ObjectNotFoundException;
import com.luizeduardo.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository categoriaRepository;

	public void salvar(Categoria categoria) {
		categoriaRepository.saveAll(Arrays.asList(categoria));
	}

	public Categoria buscar(Integer id) {
		Optional<Categoria> categoriaobj = categoriaRepository.findById(id);
		return categoriaobj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + " , " + "Tipo: " + Categoria.class.getName()));

		/*
		 * metodo orElseThrow retorna a excessão caso o objeto não tenha sido encontrado, caso
		 * tenha sido encontrado retorna o categoriaobj
		 * 
		 */
	}
}
