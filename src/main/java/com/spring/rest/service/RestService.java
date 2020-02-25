package com.spring.rest.service;

import com.spring.rest.model.Post;

import java.util.List;

/**
 * Created by alexandre on 24/02/2020.
 */
public interface RestService {

    public List<Post> findAll();
    public Post findById(Long Id);
    public Post save(Post post);
}