package com.example.expenseTracker.service;

import com.example.expenseTracker.exception.OurException;
import com.example.expenseTracker.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CoustomUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepo userRepo;
@Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Here you can implement your logic to fetch user details from the database
        // For example, using a UserRepository to find the user by username
        // If user is not found, throw new UsernameNotFoundException("User not found");
        return userRepo.findByEmail(username).orElseThrow(()-> new OurException("Username/MailID not found")) ; // Replace with actual user details
    }
}
