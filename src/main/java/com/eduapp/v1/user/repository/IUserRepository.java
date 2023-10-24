package com.eduapp.v1.user.repository;

import com.eduapp.v1.user.entities.User;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
    
}
