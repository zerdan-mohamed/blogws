package com.zm.blogws.repository;

import com.zm.blogws.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long>{
}
