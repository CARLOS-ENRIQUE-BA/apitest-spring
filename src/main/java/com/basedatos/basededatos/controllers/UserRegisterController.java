package com.basedatos.basededatos.controllers;

import com.basedatos.basededatos.models.UserRegisterModel;
import com.basedatos.basededatos.services.UserRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/userRegister")
public class UserRegisterController {
    @Autowired
    UserRegisterService userRegisterService;

    @GetMapping("/getAll")
    List<UserRegisterModel> getAllUserRegister(){
        return userRegisterService.getAll();
    }
    @GetMapping(value = "/getId/{id}")
    UserRegisterModel getUserRegisterById(@PathVariable("id") long id ){
        return userRegisterService.get(id);
    }
    @PostMapping(value = "/create")
    UserRegisterModel createUserRegister(@RequestBody UserRegisterModel userRegisterModel){
        return userRegisterService.register(userRegisterModel);
    }
    @PutMapping(value = "/update/{id}")
    UserRegisterModel updateUserRegisterById(@RequestBody UserRegisterModel userRegisterModel ){
        return userRegisterService.update(userRegisterModel);
    }
    @DeleteMapping(value = "/delete/{id}")
    void  deleteURById(@PathVariable("id") long id){
        userRegisterService.delete(id);
    }
}
