package com.example.jpa.repository;

import com.example.jpa.entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<Login, Long> {
    Login findByUserName(String userName);

    boolean existsByUserName(String userName);
}
