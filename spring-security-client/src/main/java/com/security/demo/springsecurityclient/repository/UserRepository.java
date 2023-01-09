package com.security.demo.springsecurityclient.repository;

import com.security.demo.springsecurityclient.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
