package com.basedatos.basededatos.controllers;

import com.basedatos.basededatos.models.UserModel;
import com.basedatos.basededatos.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/getAll")
    List<UserModel> getAllUser(){
        return userService.getAll();
    }

    @GetMapping(value = "/getId/{id}")
     UserModel getUserById(@PathVariable("id") long id ){
        return userService.get(id);
    }

    @PostMapping(value = "/create")
     UserModel createUser(@RequestBody UserModel userModel){
     return userService.register(userModel);
    }

    @PutMapping(value = "/update/{id}")
     UserModel updateUserById(@RequestBody UserModel userModel ){
        return userService.update(userModel);
    }

    @DeleteMapping(value = "/delete/{id}")
    void  deleteUserById(@PathVariable("id") long id){
        userService.delete(id);
    }
}
