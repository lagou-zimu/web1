package com.lagou.service;


import com.lagou.dao.UserDao;
import com.lagou.dao.UserDaoImpl;
import com.lagou.domain.User;

import java.sql.SQLException;


public class UserServiceImpl implements UserService {

    /*
        根据用户密码查询用户信息
     */
    @Override
    public User login(String username, String password) throws SQLException {

        UserDao userDao = new UserDaoImpl();
        User user = userDao.login(username, password);
        return user;
    }

    @Override
    public void addUser(User user) throws SQLException {
        UserDao userDao = new UserDaoImpl();
          userDao.addUser(user);
    }
}
