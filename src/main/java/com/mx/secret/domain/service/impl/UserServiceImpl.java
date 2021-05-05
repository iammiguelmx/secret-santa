package com.mx.secret.domain.service.impl;

import com.mx.secret.domain.service.IUserService;
import com.mx.secret.persistence.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserService iUserService;

    public List<User> getAll() {
        return iUserService.getAll();
    }

    public User saveUser(User user) {
        return iUserService.saveUser(user);
    }
}
