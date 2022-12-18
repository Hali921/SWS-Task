package com.sws.swstask.repositories;

import com.sws.swstask.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
