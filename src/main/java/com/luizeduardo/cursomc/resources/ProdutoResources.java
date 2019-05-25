package com.luizeduardo.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.luizeduardo.cursomc.domain.Produto;
import com.luizeduardo.cursomc.services.ProdutoService;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutoResources {

	@Autowired
	private ProdutoService produtoService;

	@RequestMapping(value = "/{idproduto}", method = RequestMethod.GET)
	public ResponseEntity<?> findById(@PathVariable Integer idproduto) {
		Produto produto = produtoService.buscar(idproduto);
		return ResponseEntity.ok().body(produto);
	}
}
