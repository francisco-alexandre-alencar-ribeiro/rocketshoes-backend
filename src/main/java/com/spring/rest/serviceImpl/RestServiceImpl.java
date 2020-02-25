package com.spring.rest.serviceImpl;

import com.spring.rest.model.Post;
import com.spring.rest.repository.PostRepository;
import com.spring.rest.service.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by alexandre on 24/02/2020.
 */

@Service
public class RestServiceImpl implements RestService {

    @Autowired
    private PostRepository postRepository;

    @Override
    public List<Post> findAll() {
        return postRepository.findAll();
    }

    @Override
    public Post findById(Long Id) {
        return postRepository.findById(Id).get();
    }

    @Override
    public Post save(Post post) {
        return postRepository.save(post);
    }
}