package com.example.examSystem.service;

import com.example.examSystem.entity.User;

import java.util.List;

public interface UserService{

    public List<User> findAll();

    public User findById(Integer id);

    public int deleteById(int id);

    public int update(User user);

    public int add(User user);
    
    public String login(String username,String password);
}
