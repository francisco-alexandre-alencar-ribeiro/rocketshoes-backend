package com.spring.rocketshoesBackend.config;

import com.spring.rocketshoesBackend.model.Produto;
import com.spring.rocketshoesBackend.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Date;

/**
 * Created by alexandre on 24/02/2020.
 */

@Component
public class Bootstrap {

    @Autowired
    ProdutoRepository produtoRepository;

    @PostConstruct
    public void init() {

        if(produtoRepository.count() == 0) {
            Produto produto = new Produto();
            produto.setAutor("Alexandre Alencar");
            produto.setData(new Date());
            produto.setTitulo("Titulo 1");
            produto.setTexto("Texto 2");
            produtoRepository.save(produto);

            produto = new Produto();
            produto.setAutor("Francisco Ribeiro");
            produto.setData(new Date());
            produto.setTitulo("Titulo 2");
            produto.setTexto("Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto");
            produtoRepository.save(produto);
        }
    }
}
