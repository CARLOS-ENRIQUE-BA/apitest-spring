package com.basedatos.basededatos.dao.imp;

import com.basedatos.basededatos.dao.GasolineraDao;
import com.basedatos.basededatos.models.GasolineraModel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
@Transactional
public class GasolineraImp implements GasolineraDao {
    @PersistenceContext
    EntityManager entityManager;
    @Transactional
    @Override
    public List<GasolineraModel> getGAll(){
        String hql = "FROM GasolineraModel as u";
        return (List<GasolineraModel>) entityManager.createQuery(hql).getResultList();
    }

    @Transactional
    @Override
    public GasolineraModel getG( long id){
        return entityManager.find(GasolineraModel.class, id);
        // TODO: find -> Select * from where id = id (Modelo, id)

    }
    @Transactional
    @Override
    public GasolineraModel registerG( GasolineraModel gasolineraModel){
        entityManager.merge(gasolineraModel); // TODO: merge => INSERT
        return gasolineraModel;
    }
    @Transactional
    @Override
    public void delete(  long id){
        GasolineraModel gasolineraModel = getG(id);
        entityManager.remove(gasolineraModel); // TODO: remove(modelo) => delete
    }
}
