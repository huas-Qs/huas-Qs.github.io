package com.aqisheng.blog.service;

import com.aqisheng.blog.po.User;

public interface UserService {

    User checkUser(String username, String password);
}
