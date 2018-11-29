package com.myway.seat.api.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.myway.seat.api.mapper.UserMapper;
import com.myway.seat.api.model.entity.User;
import com.myway.seat.api.service.UserService;

/**
 * 클래스에 대한 설명을 여기에 쓴다.
 * 
 * @author 	sjc0502
 * @since 	2018. 11. 26.
 * @version 1.0
 * @see <pre>
 *  == 개정이력(Modification Information) ==
 *   
 *   수정일			수정자				수정내용
 *  ---------------------------------------------------------------------------------
 *   2018. 11. 26.		sjc0502				최초생성
 * 
 * </pre>
 */

@Service
public class UserServiceImpl implements UserService {
	
	private final UserMapper userMapper;	

	public UserServiceImpl(UserMapper userMapper) {
		super();
		this.userMapper = userMapper;
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userMapper.findAll();
	}

	@Override
	public User findUserById(String accountId) {
		// TODO Auto-generated method stub
		return Optional
				.ofNullable(userMapper.findUserByAccountId(accountId))
				.orElseGet(User::new);
	}
	
	@Override
	public User findUserByIdXml(String accountId) {
		// TODO Auto-generated method stub
		return Optional
				.ofNullable(userMapper.findUserByAccountIdXml(accountId))
				.orElseGet(User::new);	
	}

}
