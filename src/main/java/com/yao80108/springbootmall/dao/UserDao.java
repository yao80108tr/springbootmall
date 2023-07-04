package com.yao80108.springbootmall.dao;

import com.yao80108.springbootmall.dto.UserLoginRequest;
import com.yao80108.springbootmall.dto.UserRegisterRequest;
import com.yao80108.springbootmall.model.User;

public interface UserDao {
    Integer createUser(UserRegisterRequest userRegisterRequest);
    User getUserById(Integer userId);
    User getUserByEmail(String email);
}
