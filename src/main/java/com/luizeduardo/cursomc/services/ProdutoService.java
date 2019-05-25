package com.luizeduardo.cursomc.services;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luizeduardo.cursomc.domain.Produto;
import com.luizeduardo.cursomc.repositories.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;

	public void salvar(Produto produto) {
		produtoRepository.saveAll(Arrays.asList(produto));
	}

	public Produto buscar(Integer id) {
		Optional<Produto> produtosObj = produtoRepository.findById(id);
		return produtosObj.orElse(null);
	}
}
