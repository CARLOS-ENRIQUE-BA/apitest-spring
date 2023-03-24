package com.basedatos.basededatos.dao;

import com.basedatos.basededatos.models.RegisterModel;

import java.util.List;

public interface RegisterDao {
    RegisterModel get(long id);
    RegisterModel getR( long id);
    RegisterModel registerR( RegisterModel registerModel);
    void delete(  long id);
}
