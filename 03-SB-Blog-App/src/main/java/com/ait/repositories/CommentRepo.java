package com.ait.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ait.entity.Comments;
import com.ait.entity.User;

public interface CommentRepo extends JpaRepository<Comments,Integer>{

}
