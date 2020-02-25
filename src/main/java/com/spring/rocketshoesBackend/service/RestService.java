package com.spring.rocketshoesBackend.service;

import com.spring.rocketshoesBackend.model.Produto;

import java.util.List;

/**
 * Created by alexandre on 24/02/2020.
 */
public interface RestService {

    public List<Produto> findAll();
    public Produto findById(Long Id);
    public Produto save(Produto produto);
}