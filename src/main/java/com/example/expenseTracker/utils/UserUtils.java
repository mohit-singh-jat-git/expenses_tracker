package com.example.expenseTracker.utils;

import com.example.expenseTracker.dto.Response;
import com.example.expenseTracker.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

public class UserUtils {
    public Response mapUserResponse(User user) {
        Response response = new Response();
        response.setStatusCode(200);
        response.setMessage("User Created successfully");
//    response.setUserDTO(user);
        return response;


    }
}
