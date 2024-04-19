package com.pomodorotracker.backend.repository.project;

import com.pomodorotracker.backend.model.project.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityRepository extends JpaRepository<Activity, Integer>
{
}
