package com.luizeduardo.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.luizeduardo.cursomc.domain.Categoria;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResources {

	@RequestMapping(method = RequestMethod.GET)
	public List<Categoria> teste() {
		Categoria cat1 = new Categoria(1, "Informática");
		Categoria cat2 = new Categoria(2, "Diversos");

		List<Categoria> list = new ArrayList<Categoria>();
		list.add(cat1);
		list.add(cat2);

		return list;
	}

}
