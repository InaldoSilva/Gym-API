package com.inaldo.GymAPI.service;

import com.inaldo.GymAPI.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
