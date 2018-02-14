package com.nidigitalstudio.aulawebpablo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nidigitalstudio.aulawebpablo.domain.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{
	
}
