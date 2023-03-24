package com.basedatos.basededatos.services;

import com.basedatos.basededatos.dao.GasolineraDao;
import com.basedatos.basededatos.models.GasolineraModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
@Service
@CrossOrigin
public class GasolineraService {
    @Autowired
    GasolineraDao gasolineraDao;

    public List<GasolineraModel> getAll(){
        return gasolineraDao.getGAll();
    }
    public GasolineraModel register( GasolineraModel gasolineraModel){
        return gasolineraDao.registerG(gasolineraModel);
    }
    public void delete(@PathVariable long id){
        gasolineraDao.delete(id);
    }
}
