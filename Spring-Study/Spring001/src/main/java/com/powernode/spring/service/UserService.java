package com.powernode.spring.service;

import com.powernode.spring.dao.UserDao;

public class UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
        System.out.println("setUserDao执行了");
    }
}
