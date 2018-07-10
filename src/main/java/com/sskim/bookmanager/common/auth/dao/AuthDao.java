package com.sskim.bookmanager.common.auth.dao;

import java.util.List;

import com.sskim.bookmanager.common.auth.entity.UserEntity;

public interface AuthDao {
	public void save(UserEntity userEntity);
	public List<UserEntity> list();
}
