package com.leandrosilvaferreira.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leandrosilvaferreira.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
