package com.sciencepublish.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.sciencepublish.model.User;
import com.sciencepublish.mapper.UserMapper;

@Service
public class UserService
{

    @Autowired
    private UserMapper userMapper;

    public int insert(User pojo)
    {
        return userMapper.insert(pojo);
    }

    public int insertSelective(User pojo)
    {
        return userMapper.insertSelective(pojo);
    }

    public int insertList(List<User> pojos)
    {
        return userMapper.insertList(pojos);
    }

    public int update(User pojo)
    {
        return userMapper.update(pojo);
    }

    public  List<User> getAllUser()
    {
        return userMapper.getAllUser();
    }
}
