package com.basedatos.basededatos.dao;

import com.basedatos.basededatos.models.GasolineraModel;

import java.util.List;

public interface GasolineraDao {
    List<GasolineraModel> getGAll();
    GasolineraModel getG( long id);
    GasolineraModel registerG( GasolineraModel gasolineraModel);
    void delete(  long id);
}
