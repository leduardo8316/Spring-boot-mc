package com.luizeduardo.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luizeduardo.cursomc.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
