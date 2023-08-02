package com.me.course_flow.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.me.course_flow.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
