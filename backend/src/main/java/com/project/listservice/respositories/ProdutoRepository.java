package com.project.listservice.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.listservice.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	

}
