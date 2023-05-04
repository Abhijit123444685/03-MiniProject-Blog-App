package com.ait.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ait.entity.BlogPost;

public interface BlogPostRepo extends JpaRepository<BlogPost,Integer> {

}
