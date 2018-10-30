package com.demo.dao;

import com.demo.pojo.User;
import org.springframework.stereotype.Component;

@Component(value = "userDao")
public interface UserDao {
    User selectUser(long userId);

    Integer addUser(User user);
}
