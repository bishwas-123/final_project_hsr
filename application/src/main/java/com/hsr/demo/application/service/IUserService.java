package com.hsr.demo.application.service;


import com.hsr.demo.application.model.User;

import java.util.List;

public interface IUserService {
    List<User> findAll();
    User save(User user);
    User findById(Integer userId);
}
