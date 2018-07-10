package com.sskim.bookmanager.common.auth.service;

import java.util.List;

import com.sskim.bookmanager.common.auth.entity.UserEntity;

public interface AuthService {
	public void save(UserEntity userEntity);
	
	public List<UserEntity> list();
}
