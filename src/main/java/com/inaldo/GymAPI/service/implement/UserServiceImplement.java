package com.inaldo.GymAPI.service.implement;

import com.inaldo.GymAPI.domain.model.User;
import com.inaldo.GymAPI.domain.repository.UserRepository;
import com.inaldo.GymAPI.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImplement implements UserService {

    private final UserRepository userRepository;

    public UserServiceImplement(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if (userRepository.existsByRegistration(userToCreate.getId())) {
            throw new IllegalArgumentException("Id de usuário já existente.");
        }
        return userRepository.save(userToCreate);
    }
}
