package com.pomodorotracker.backend.repository.user;

import com.pomodorotracker.backend.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer>
{
}
