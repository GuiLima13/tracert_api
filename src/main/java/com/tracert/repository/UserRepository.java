package com.tracert.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tracert.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByUsername(String username);

}
