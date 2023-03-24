package com.basedatos.basededatos.controllers;

import com.basedatos.basededatos.models.RegisterModel;
import com.basedatos.basededatos.models.UserModel;
import com.basedatos.basededatos.services.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/register")
public class RegisterController {
    @Autowired
    RegisterService registerService;

    @GetMapping(value = "/getId/{id}")
    RegisterModel getUserById(@PathVariable("id") long id ){
        return registerService.get(id);
    }

    @PostMapping(value = "/create")
    RegisterModel createUser(@RequestBody RegisterModel registerModel){
        return registerService.register(registerModel);
    }
    @DeleteMapping(value = "/delete/{id}")
    void  deleteUserById(@PathVariable("id") long id){
        registerService.delete(id);
    }
}
