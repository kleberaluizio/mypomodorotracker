package com.pomodorotracker.backend.repository.project;

import com.pomodorotracker.backend.model.project.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Integer>
{
}
