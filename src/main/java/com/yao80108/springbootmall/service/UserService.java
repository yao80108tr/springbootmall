package com.yao80108.springbootmall.service;

import com.yao80108.springbootmall.dto.UserLoginRequest;
import com.yao80108.springbootmall.dto.UserRegisterRequest;
import com.yao80108.springbootmall.model.User;

public interface UserService {
    Integer register(UserRegisterRequest userRegisterRequest);
    User getUserById(Integer userId);
    User login(UserLoginRequest userLoginRequest);
}
