package com.example.expenseTracker.service.Interface;

import com.example.expenseTracker.dto.Response;
import com.example.expenseTracker.dto.UserDTO;
import com.example.expenseTracker.entity.User;

public interface IUserSErvice {
    Response registerUser(User user);
    Response loginUser(String email, String password);
    Response getUserById(Long id);
    Response updateUser(Long id, String name, String email, String password);
    Response deleteUser(Long id);
    Response getAllUsers();
    Response getUserByEmail(String email);
    Response getUserByName(String name);

}
