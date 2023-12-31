package com.taba.security.repository;

import com.taba.security.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUsername(String name);
    Optional<User> findById(long userId);
    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
}
