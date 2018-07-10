package com.sskim.bookmanager.common.auth.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sskim.bookmanager.common.auth.dao.AuthDao;
import com.sskim.bookmanager.common.auth.entity.UserEntity;
import com.sskim.bookmanager.common.auth.service.AuthService;

@Service
public class AuthServiceImpl implements AuthService {

   @Autowired
   private AuthDao authDao;

   @Transactional
   public void save(UserEntity userEntity) {
      authDao.save(userEntity);
   }

   @Transactional(readOnly = true)
   public List<UserEntity> list() {
      return authDao.list();
   }

}