package com.schoolofnet.Helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.schoolofnet.Helpdesk.models.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
