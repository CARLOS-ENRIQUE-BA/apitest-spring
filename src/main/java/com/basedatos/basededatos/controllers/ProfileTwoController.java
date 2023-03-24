package com.basedatos.basededatos.controllers;

import com.basedatos.basededatos.models.ProfileTwoModel;
import com.basedatos.basededatos.services.ProfileTwoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profile")
public class ProfileTwoController {
    @Autowired
    ProfileTwoService profileTwoService;

    @GetMapping("/getAll")
    List<ProfileTwoModel> getAllProfile(){
        return profileTwoService.getAll();
    }

    @PostMapping(value = "/create")
    ProfileTwoModel createUser(@RequestBody ProfileTwoModel profileTwoModel){
        return profileTwoService.register(profileTwoModel);
    }
}
