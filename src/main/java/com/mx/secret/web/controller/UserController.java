package com.mx.secret.web.controller;


import com.mx.secret.domain.service.IUserService;
import com.mx.secret.persistence.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private IUserService iUserService;

    @PostMapping("/addUser")
    public ResponseEntity<User> add(@RequestBody User user) {
        return new ResponseEntity<>(iUserService.saveUser(user), HttpStatus.CREATED);
    }

}
