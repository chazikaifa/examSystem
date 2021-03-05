package com.example.examSystem.controller;

import com.example.examSystem.entity.User;
import com.example.examSystem.entity.ApiResult;
import com.example.examSystem.serviceimpl.UserServiceImpl;
import com.example.examSystem.util.ApiResultHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    private UserServiceImpl userService;
    @Autowired
    public UserController(UserServiceImpl userService){
        this.userService = userService;
    }

    @GetMapping("/users")
    public ApiResult findAll(){
        System.out.println("查询全部");
        return ApiResultHandler.success(userService.findAll());
    }

    @GetMapping("/users/{userId}")
    public ApiResult findById(@PathVariable("userId") Integer userId){
        System.out.println("根据ID查找");
        return ApiResultHandler.success(userService.findById(userId));
    }

    @GetMapping("/user/delete/{userId}")
    public ApiResult deleteById(@PathVariable("userId") Integer userId){
        userService.deleteById(userId);
        return ApiResultHandler.success();
    }

    @PostMapping("/user/update/{userId}")
    public ApiResult update(@PathVariable("userId") Integer userId, User user){
        return ApiResultHandler.success(userService.update(user));
    }

    @PostMapping("/user/add")
    public ApiResult add(User user){
        return ApiResultHandler.success(userService.add(user));
    }
    
    @RequestMapping("/user/login")
    public ApiResult login(String username,String password) {
		return ApiResultHandler.success(userService.login(username,password));
    }
}
