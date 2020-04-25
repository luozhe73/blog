package com.cvicse.blog.service;

import com.cvicse.blog.po.User;

public interface UserService {

    User checkUser(String username,String password);
}
