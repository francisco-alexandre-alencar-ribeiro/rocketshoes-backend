package com.spring.rest.repository;

import com.spring.rest.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by alexandre on 23/02/2020.
 */
public interface PostRepository extends JpaRepository<Post, Long> {}