package com.eduapp.v1.user.repository;

import com.eduapp.v1.user.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Long> {
    
}
