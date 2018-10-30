package com.demo.service;

import com.demo.pojo.User;

public interface UserService {
    User selectUser(long userId);

    Boolean addUser(User user);
}
