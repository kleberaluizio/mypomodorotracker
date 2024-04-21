package com.pomodorotracker.backend.repository.project;

import com.pomodorotracker.backend.model.project.Activity;
import com.pomodorotracker.backend.model.user.User;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityRepository extends JpaRepository<Activity, Integer>
{
	List<Activity> findAllByUser(User user);
}
