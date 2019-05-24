package com.hsr.demo.application.service;

import com.hsr.demo.application.model.User;
import com.hsr.demo.application.repository.IUserRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {

    private IUserRepository userRepository;
    public UserService(IUserRepository userRepository){
        this.userRepository=userRepository;
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll(Sort.by("firstName"));
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public User findById(Integer userId) {
        return userRepository.findById(userId).orElse(null);
    }
}
