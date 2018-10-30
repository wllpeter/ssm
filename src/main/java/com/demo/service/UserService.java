package com.demo.service;

import com.demo.pojo.User;

import java.util.List;

public interface UserService {
    User selectUser(long userId);

    Boolean addUser(User user);

    List<User> addAndSelect(User user);
}
