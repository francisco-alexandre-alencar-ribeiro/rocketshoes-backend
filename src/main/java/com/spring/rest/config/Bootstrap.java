package com.spring.rest.config;

import com.spring.rest.model.Post;
import com.spring.rest.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

/**
 * Created by alexandre on 24/02/2020.
 */

@Component
public class Bootstrap {

    @Autowired
    PostRepository postRepository;

    @PostConstruct
    public void init() {

        if(postRepository.count() == 0) {
            Post post = new Post();
            post.setAutor("Alexandre Alencar");
            post.setData(new Date());
            post.setTitulo("Titulo 1");
            post.setTexto("Texto 2");
            postRepository.save(post);

            post = new Post();
            post.setAutor("Francisco Ribeiro");
            post.setData(new Date());
            post.setTitulo("Titulo 2");
            post.setTexto("Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto");
            postRepository.save(post);
        }
    }
}
