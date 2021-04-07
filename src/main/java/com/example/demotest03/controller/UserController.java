package com.example.demotest03.controller;

import com.example.demotest03.mapper.UserMapper;
import com.example.demotest03.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/queryUserList")
    public List<User> queryUserList(){
        List<User> userList = userMapper.queryUserList();
        for(User user:userList){
            System.out.println(user);
        }
        return userList;
    }

    @GetMapping("/addUser")
    public String addUser(){
        userMapper.addUser(new User(5,"Cherry","1234"));//爆红不用管，运行没有错误
        return "add ok";
    }

    @GetMapping("/updateUser")
    public String updateUser(){
       userMapper.updateUser(new User(5,"Cherry","2345"));
        return "update ok";
    }

    @GetMapping("/deleteUser")
    public String deleteUser(){
        userMapper.deleteUser(5);
        return "delete ok";
    }
}
