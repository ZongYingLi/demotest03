package com.example.demotest03.mapper;

import com.example.demotest03.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper   //加这个注解表明是Mybatis下mapper类：Dao层
@Repository
public interface UserMapper {
    List<User> queryUserList();//查询所有用户
    User queryUserById(int id);
    int addUser(User user);
    int updateUser(User user);
    int deleteUser(int id);
}
