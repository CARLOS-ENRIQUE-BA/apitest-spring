package com.basedatos.basededatos.services;

import com.basedatos.basededatos.dao.RegisterDao;
import com.basedatos.basededatos.models.RegisterModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
@CrossOrigin
public class RegisterService {
    @Autowired
    RegisterDao registerDao;
    public RegisterModel get(long id){
        return registerDao.get(id);
    }
    public RegisterModel register( RegisterModel registerModel){
        return registerDao.registerR(registerModel);
    }
    public void delete(@PathVariable long id){
        registerDao.delete(id);
    }
}
