package com.example.expenseTracker.repo;

import com.example.expenseTracker.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepo extends MongoRepository<User, String> {
       boolean existsByEmail(String email);
       Optional<User> findByEmail(String email);

    // Custom query methods can be defined here if needed
    // For example, findByUsername(String username);
}
