package com.basedatos.basededatos.dao.imp;

import com.basedatos.basededatos.dao.UserRegisterDao;
import com.basedatos.basededatos.models.UserRegisterModel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class UserRegisterDaoImp implements UserRegisterDao {
    @PersistenceContext
    EntityManager entityManager;
    @Transactional
    @Override
    public List<UserRegisterModel> getURAll(){
        String hql = "FROM UserModel as u";
        return (List<UserRegisterModel>) entityManager.createQuery(hql).getResultList();
    }
    @Transactional
    @Override
    public UserRegisterModel getUR( long id){
        return entityManager.find(UserRegisterModel.class, id);

    }
    @Transactional
    @Override
    public UserRegisterModel registerUR( UserRegisterModel userRegisterModel){
        entityManager.merge(userRegisterModel);
        return userRegisterModel;
    }
    @Transactional
    @Override
    public UserRegisterModel updateUR( UserRegisterModel userRegisterModel){
        entityManager.merge(userRegisterModel);
        return userRegisterModel;
    }
    @Transactional
    @Override
    public void deleteUR(  long id){
        UserRegisterModel userRegisterModel = getUR(id);
        entityManager.remove(userRegisterModel);
    }
}
