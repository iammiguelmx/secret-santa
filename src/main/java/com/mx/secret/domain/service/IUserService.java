package com.mx.secret.domain.service;

import com.mx.secret.persistence.entity.User;
import java.util.List;

public interface IUserService {

    List<User> getAll();
    User saveUser(User user);

}
