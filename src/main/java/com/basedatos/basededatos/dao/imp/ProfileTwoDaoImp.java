package com.basedatos.basededatos.dao.imp;

import com.basedatos.basededatos.dao.ProfileTwoDao;
import com.basedatos.basededatos.models.ProfileTwoModel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class ProfileTwoDaoImp implements ProfileTwoDao {
    @PersistenceContext
    EntityManager entityManager;
    @Transactional
    @Override
    public List<ProfileTwoModel> getPAll(){
        String hql = "FROM ProfileTwoModel as u";
        return (List<ProfileTwoModel>) entityManager.createQuery(hql).getResultList();
    }

    @Transactional
    @Override
    public ProfileTwoModel getP( long id){
        return entityManager.find(ProfileTwoModel.class, id);
        // TODO: find -> Select * from where id = id (Modelo, id)

    }
    @Transactional
    @Override
    public ProfileTwoModel registerP( ProfileTwoModel profileTwoModel){
        entityManager.merge(profileTwoModel); // TODO: merge => INSERT
        return profileTwoModel;
    }
    @Transactional
    @Override
    public ProfileTwoModel updateP( ProfileTwoModel profileTwoModel){
        entityManager.merge(profileTwoModel);
        return profileTwoModel;
    }
    @Transactional
    @Override
    public void deleteP(  long id){
        ProfileTwoModel profileTwoModel = getP(id);
        entityManager.remove(profileTwoModel); // TODO: remove(modelo) => delete
    }
}
