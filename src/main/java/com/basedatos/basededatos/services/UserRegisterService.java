package com.basedatos.basededatos.services;

import com.basedatos.basededatos.dao.UserRegisterDao;
import com.basedatos.basededatos.models.UserRegisterModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@CrossOrigin
public class UserRegisterService {
    @Autowired
    UserRegisterDao userRegisterDao;

    public List<UserRegisterModel> getAll(){
        return userRegisterDao.getURAll();
    }

    public UserRegisterModel get( long id){

        return userRegisterDao.getUR(id);
    }

    public UserRegisterModel register( UserRegisterModel userModel){
        return userRegisterDao.registerUR(userModel);
    }

    public UserRegisterModel update(@RequestBody UserRegisterModel userModel){
        return userRegisterDao.updateUR(userModel);
    }

    public void delete(@PathVariable long id){
        userRegisterDao.deleteUR(id);
    }
}
