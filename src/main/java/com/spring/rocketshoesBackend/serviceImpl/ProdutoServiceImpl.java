package com.spring.rocketshoesBackend.serviceImpl;

import com.spring.rocketshoesBackend.model.Produto;
import com.spring.rocketshoesBackend.repository.ProdutoRepository;
import com.spring.rocketshoesBackend.service.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by alexandre on 24/02/2020.
 */

@Service
public class ProdutoServiceImpl implements RestService {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Override
    public List<Produto> findAll() {
        return produtoRepository.findAll();
    }

    @Override
    public Produto findById(Long Id) {
        return produtoRepository.findById(Id).get();
    }

    @Override
    public Produto save(Produto produto) {
        return produtoRepository.save(produto);
    }
}