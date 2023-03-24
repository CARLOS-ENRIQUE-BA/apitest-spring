package com.basedatos.basededatos.dao.imp;

import com.basedatos.basededatos.dao.RegisterDao;
import com.basedatos.basededatos.models.RegisterModel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class RegisterDaoImp implements RegisterDao {
    @PersistenceContext
    EntityManager entityManager;
    @Transactional
    @Override
    public RegisterModel get(long id){
        return entityManager.find(RegisterModel.class, id);

    }

    @Transactional
    @Override
    public RegisterModel getR( long id){
        return entityManager.find(RegisterModel.class, id);
        // TODO: find -> Select * from where id = id (Modelo, id)

    }
    @Transactional
    @Override
    public RegisterModel registerR( RegisterModel registerModel){
        entityManager.merge(registerModel); // TODO: merge => INSERT
        return registerModel;
    }
    @Transactional
    @Override
    public void delete(  long id){
        RegisterModel registerModel = getR(id);
        entityManager.remove(registerModel); // TODO: remove(modelo) => delete
    }
}
