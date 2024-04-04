package com.prakash.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prakash.entity.Category;

public interface CategoryRepo extends JpaRepository<Category, Long> {

}
