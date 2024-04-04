package com.prakash.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prakash.entity.Post;

public interface PostRepo extends JpaRepository<Post, Long> {

}
