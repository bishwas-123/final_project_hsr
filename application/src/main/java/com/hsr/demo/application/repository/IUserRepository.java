package com.hsr.demo.application.repository;

import com.hsr.demo.application.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Integer> {
}
