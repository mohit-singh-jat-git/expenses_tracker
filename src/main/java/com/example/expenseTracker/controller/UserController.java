package com.example.expenseTracker.controller;

import com.example.expenseTracker.dto.Response;
import com.example.expenseTracker.dto.UserDTO;
import com.example.expenseTracker.entity.User;
import com.example.expenseTracker.service.Imp.IUserServiceImp;
import com.example.expenseTracker.service.Interface.IUserSErvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private IUserServiceImp userServiceImp;
    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody User user){
        Response response = userServiceImp.registerUser(user);
        return ResponseEntity.ok(response);
    }




}
