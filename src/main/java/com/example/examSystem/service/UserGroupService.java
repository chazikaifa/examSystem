package com.example.examSystem.service;

import com.example.examSystem.entity.UserGroup;

import java.util.List;

public interface UserGroupService{

    public List<UserGroup> findAll();

    public UserGroup findById(Integer id);
 
    public UserGroup findByDesp(String desp);
}
