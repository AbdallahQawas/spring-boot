package com.example.spring.repository;

import com.example.spring.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositroy extends JpaRepository<User, Long> {
}
