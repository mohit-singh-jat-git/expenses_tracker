package com.example.expenseTracker.service.Imp;

import com.example.expenseTracker.dto.Response;
import com.example.expenseTracker.dto.UserDTO;
import com.example.expenseTracker.entity.User;
import com.example.expenseTracker.repo.UserRepo;
import com.example.expenseTracker.service.Interface.IUserSErvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IUserServiceImp implements IUserSErvice {
    @Autowired
    private IUserSErvice userService;
//    @Autowired
//    private Response response;
    @Autowired
    private UserDTO userDTO;
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private User user;

    @Override
    public Response registerUser(User user) {
        Response response = new Response();
        User userSaved = userRepo.save(user);
        if (userSaved != null) {
            response.setStatusCode(200);
            response.setMessage("User registered successfully");
            response.setName(userSaved.getName());
            response.setEmail(userSaved.getEmail());
            userDTO.setName(userSaved.getName());
            userDTO.setEmail(userSaved.getEmail());
            response.setUserDTO(userDTO);
        } else {
            response.setStatusCode(500);
            response.setMessage("User registration failed");
        }
        return response;
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
