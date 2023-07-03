package com.yao80108.springbootmall.service.impl;

import com.yao80108.springbootmall.dao.UserDao;
import com.yao80108.springbootmall.dto.UserRegisterRequest;
import com.yao80108.springbootmall.model.User;
import com.yao80108.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }
}
