package com.basedatos.basededatos.dao;

import com.basedatos.basededatos.models.UserRegisterModel;

import java.util.List;

public interface UserRegisterDao {
    List<UserRegisterModel> getURAll();
    UserRegisterModel getUR( long id);
    UserRegisterModel registerUR( UserRegisterModel userRegisterModel);
    UserRegisterModel updateUR( UserRegisterModel userRegisterModel);
    void deleteUR(  long id);
}
