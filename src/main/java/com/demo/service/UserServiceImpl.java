package com.demo.service;

import com.demo.dao.UserDao;
import com.demo.pojo.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService{

    @Resource
    private UserDao userDao;

    @Transactional
    public User selectUser(long userId) {
        return userDao.selectUser(userId);
    }

    @Override
    public Boolean addUser(User user) {
        return userDao.addUser(user)>0;
    }

    @Override
    @Transactional
    public List<User> addAndSelect(User user) {
        userDao.addUser(user);
        return userDao.selectAllUser();
    }
}
