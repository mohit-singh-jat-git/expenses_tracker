package com.example.expenseTracker.service.Imp;

import com.example.expenseTracker.dto.Response;
import com.example.expenseTracker.dto.UserDTO;
import com.example.expenseTracker.service.Interface.IUserSErvice;
import org.springframework.beans.factory.annotation.Autowired;

public class IUserServiceImp implements IUserSErvice {
    @Autowired
    private IUserSErvice userService;
    @Autowired
    private Response response;
    @Autowired
    private UserDTO userDTO;

    @Override
    public Response registerUser(String name, String email, String password) {
        return null;
    }

    @Override
    public Response loginUser(String email, String password) {
        return null;
    }

    @Override
    public Response getUserById(Long id) {
        return null;
    }

    @Override
    public Response updateUser(Long id, String name, String email, String password) {
        return null;
    }

    @Override
    public Response deleteUser(Long id) {
        return null;
    }

    @Override
    public Response getAllUsers() {
        return null;
    }

    @Override
    public Response getUserByEmail(String email) {
        return null;
    }

    @Override
    public Response getUserByName(String name) {
        return null;
    }
}
