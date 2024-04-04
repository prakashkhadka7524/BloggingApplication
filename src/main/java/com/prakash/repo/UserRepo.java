package com.prakash.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prakash.entity.User;

public interface UserRepo  extends JpaRepository<User, Long>{

}
