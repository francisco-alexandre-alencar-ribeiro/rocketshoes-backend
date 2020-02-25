package com.spring.rocketshoesBackend.repository;

import com.spring.rocketshoesBackend.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by alexandre on 23/02/2020.
 */
public interface ProdutoRepository extends JpaRepository<Produto, Long> {}