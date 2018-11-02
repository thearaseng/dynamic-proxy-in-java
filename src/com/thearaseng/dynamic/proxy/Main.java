package com.thearaseng.dynamic.proxy;

import com.thearaseng.dynamic.proxy.advice.LogAdvice;
import com.thearaseng.dynamic.proxy.service.UserService;
import com.thearaseng.dynamic.proxy.service.impl.UserServiceImpl;

import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) {

        UserService userService = new UserServiceImpl();

        LogAdvice userServiceLogAdvice = new LogAdvice(userService);

        UserService proxiedUserService = (UserService) Proxy.newProxyInstance(Main.class.getClassLoader(), new Class[] {UserService.class}, userServiceLogAdvice);

        proxiedUserService.save("Theara Seng");
    }
}
