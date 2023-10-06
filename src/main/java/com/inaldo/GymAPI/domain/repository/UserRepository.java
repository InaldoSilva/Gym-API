package com.inaldo.GymAPI.domain.repository;

import com.inaldo.GymAPI.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByRegistration(Long registration);
}
