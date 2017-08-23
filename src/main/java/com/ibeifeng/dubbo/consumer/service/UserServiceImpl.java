package com.ibeifeng.dubbo.consumer.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibeifeng.dubbo.consumer.dao.demo.IUserDao;


@Service(value="userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    IUserDao userDao;
    
    public List<Map<String, Object>> seletAllUsers() {
        return userDao.seletAllUsers();
    }

    public Long seletCountAllUsers() {
        return userDao.seletCountAllUsers();
    }

}
