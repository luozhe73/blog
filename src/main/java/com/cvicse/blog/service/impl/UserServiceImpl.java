package com.cvicse.blog.service.impl;

import com.cvicse.blog.dao.UserRepository;
import com.cvicse.blog.po.User;
import com.cvicse.blog.service.UserService;
import com.cvicse.blog.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User checkUser(String username, String password) {
        User user = userRepository.findByUsernameAndPassword(username, MD5Utils.code(password));
        return user;
    }
}
