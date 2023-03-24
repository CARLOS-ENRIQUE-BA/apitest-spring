package com.basedatos.basededatos.controllers;

import com.basedatos.basededatos.models.GasolineraModel;
import com.basedatos.basededatos.services.GasolineraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/gasolinera")
public class GasolineraController {
    @Autowired
    GasolineraService gasolineraService;

    @GetMapping("/getAll" )
    List<GasolineraModel> getAllGasolinera(){
        return gasolineraService.getAll();
    }

    @PostMapping(value = "/create")
    GasolineraModel createUser(@RequestBody GasolineraModel gasolineraModel){
        return gasolineraService.register(gasolineraModel);
    }
    @DeleteMapping(value = "/delete/{id}")
    void  deleteUserById(@PathVariable("id") long id){
        gasolineraService.delete(id);
    }
}
