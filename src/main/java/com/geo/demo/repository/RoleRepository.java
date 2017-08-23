package com.geo.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.geo.demo.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
