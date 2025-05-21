package com.example.expenseTracker.service.Interface;

import com.example.expenseTracker.dto.Response;

public interface IUserSErvice {
    Response registerUser(String name, String email, String password);
    Response loginUser(String email, String password);
    Response getUserById(Long id);
    Response updateUser(Long id, String name, String email, String password);
    Response deleteUser(Long id);
    Response getAllUsers();
    Response getUserByEmail(String email);
    Response getUserByName(String name);

}
