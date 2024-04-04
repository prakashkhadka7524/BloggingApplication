package com.prakash.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prakash.entity.Comment;

public interface CommentRepo extends JpaRepository<Comment, Long> {

}
