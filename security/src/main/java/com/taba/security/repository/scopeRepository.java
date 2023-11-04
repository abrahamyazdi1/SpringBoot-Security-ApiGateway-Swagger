package com.taba.security.repository;

import com.taba.security.model.Scope;
import com.taba.security.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface scopeRepository extends JpaRepository<Scope, Integer> {
    Optional<Scope> findByName(String name);
}
