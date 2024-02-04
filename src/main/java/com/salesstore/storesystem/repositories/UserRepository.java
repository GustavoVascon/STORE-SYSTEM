package com.salesstore.storesystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesstore.storesystem.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
