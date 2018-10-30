package com.jk.service;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public void getUserInfo() {
        System.out.println("username=admin");
    }
}
