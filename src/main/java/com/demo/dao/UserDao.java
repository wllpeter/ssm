package com.demo.dao;

import com.demo.pojo.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component(value = "userDao")
public interface UserDao {
    User selectUser(long userId);

    Integer addUser(User user);

    List<User> selectAllUser();
}
