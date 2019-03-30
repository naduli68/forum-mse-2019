package com.mse.forum.implementations;

import org.springframework.stereotype.Service;

import com.mse.forum.dto.UserDTO;
import com.mse.forum.mappers.UserMapper;
import com.mse.forum.persistance.UserRepository;
import com.mse.forum.persistance.entities.UserEntity;
import com.mse.forum.services.UserService;
@Service
public class UserServiceImpl implements UserService {

	UserMapper mapper;
	UserRepository repository;
	
	@Override
	public boolean saveUser(UserDTO dto) {
		UserEntity entity=mapper.toEntity(dto);
		repository.save(entity);
		
		return true;
	}
	

}
