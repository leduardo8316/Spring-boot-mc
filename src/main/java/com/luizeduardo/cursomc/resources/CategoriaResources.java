package com.luizeduardo.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.luizeduardo.cursomc.domain.Categoria;
import com.luizeduardo.cursomc.services.CategoriaService;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResources {

	@Autowired
	private CategoriaService categoriaService;
	
	@RequestMapping(value="/{salvarcategoria}", method = RequestMethod.POST)
	public void SalveAll(@PathVariable Categoria salvarcategoria) {
		categoriaService.salvar(salvarcategoria);
	}

	@RequestMapping(value = "/{idcategoria}", method = RequestMethod.GET)
	public ResponseEntity<?> findbyId(@PathVariable Integer idcategoria) {
		Categoria ojb = categoriaService.buscar(idcategoria);
		return ResponseEntity.ok().body(ojb);
	}

}
