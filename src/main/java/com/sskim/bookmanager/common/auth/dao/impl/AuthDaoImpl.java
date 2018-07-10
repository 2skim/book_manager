package com.sskim.bookmanager.common.auth.dao.impl;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sskim.bookmanager.common.auth.dao.AuthDao;
import com.sskim.bookmanager.common.auth.entity.UserEntity;

@Repository
public class AuthDaoImpl implements AuthDao {

   @Autowired
   private SessionFactory sessionFactory;

   @Override
   public void save(UserEntity userEntity) {
      sessionFactory.getCurrentSession().save(userEntity);
   }

   @Override
   public List<UserEntity> list() {
      @SuppressWarnings("unchecked")
      TypedQuery<UserEntity> query = sessionFactory.getCurrentSession().createQuery("from UserEntity");
      return query.getResultList();
   }

}