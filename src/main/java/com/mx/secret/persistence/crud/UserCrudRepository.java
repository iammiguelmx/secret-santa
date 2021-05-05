package com.mx.secret.persistence.crud;

import com.mx.secret.persistence.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserCrudRepository extends CrudRepository<User, Integer> {


}
