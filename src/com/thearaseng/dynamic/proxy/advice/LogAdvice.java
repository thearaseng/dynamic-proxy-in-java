package com.thearaseng.dynamic.proxy.advice;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class LogAdvice implements InvocationHandler {

    private Object target;

    public LogAdvice(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {

        System.out.println("logging:before");

        method.invoke(target, args);

        System.out.println("logging:after");

        return null;
    }
}
