package com.prakash.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prakash.entity.Role;

public interface RoleRepo  extends JpaRepository<Role, Long>{

}
