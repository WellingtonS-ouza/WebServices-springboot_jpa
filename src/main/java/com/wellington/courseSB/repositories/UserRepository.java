package com.wellington.courseSB.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wellington.courseSB.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
