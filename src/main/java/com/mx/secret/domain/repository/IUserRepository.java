package com.mx.secret.domain.repository;

import com.mx.secret.persistence.entity.User;

import java.util.List;

public interface IUserRepository {

    List<User> getAll();
    User saveUser(User user);
}
