package com.hoaxify.wsservice.repository;

import com.hoaxify.wsservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{
}
