package com.thearaseng.dynamic.proxy.service.impl;

import com.thearaseng.dynamic.proxy.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public void save(String name) {
        System.out.println("Saving user : ".concat(name));
    }
}
