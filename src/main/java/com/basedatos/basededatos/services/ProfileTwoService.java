package com.basedatos.basededatos.services;

import com.basedatos.basededatos.dao.ProfileTwoDao;
import com.basedatos.basededatos.models.ProfileTwoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@Service
@CrossOrigin
public class ProfileTwoService {
    @Autowired
    ProfileTwoDao profileTwoDao;

    public List<ProfileTwoModel> getAll(){
        return profileTwoDao.getPAll();
    }
    public ProfileTwoModel register( ProfileTwoModel profileTwoModel){
        return profileTwoDao.registerP(profileTwoModel);
    }


}
