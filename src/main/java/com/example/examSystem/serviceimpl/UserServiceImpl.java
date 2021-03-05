package com.example.examSystem.serviceimpl;

import com.example.examSystem.entity.User;
import com.example.examSystem.mapper.UserMapper;
import com.example.examSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userMapper.findAll();
	}

	@Override
	public User findById(Integer id) {
		// TODO Auto-generated method stub
		return userMapper.findById(id);
	}

	@Override
	public int deleteById(int id) {
		// TODO Auto-generated method stub
		return userMapper.deleteById(id);
	}

	@Override
	public int update(User user) {
		// TODO Auto-generated method stub
		return userMapper.update(user);
	}

	@Override
	public int add(User user) {
		// TODO Auto-generated method stub
		return userMapper.add(user);
	}

	@Override
	public String login(String username, String password) {
		// TODO Auto-generated method stub
		User user = userMapper.login(username,password);
		if(user == null) {
			return "fail";
		}else {
			return "success";
		}
	}


}
