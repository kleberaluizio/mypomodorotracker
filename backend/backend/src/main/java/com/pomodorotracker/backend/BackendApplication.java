package com.pomodorotracker.backend;

import com.pomodorotracker.backend.model.project.Activity;
import com.pomodorotracker.backend.model.project.Project;
import com.pomodorotracker.backend.model.user.User;
import com.pomodorotracker.backend.repository.project.ActivityRepository;
import com.pomodorotracker.backend.repository.project.ProjectRepository;
import com.pomodorotracker.backend.repository.user.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner (UserRepository urepo, ActivityRepository arepo, ProjectRepository prepo){
		return args -> {
			var user = urepo.findById(1);
			user.ifPresent(arepo::findAllByUser);
		};
	}
//	@Bean
//	public CommandLineRunner commandLineRunner (UserRepository urepo, ActivityRepository arepo, ProjectRepository prepo){
//		return args -> {
//			var newProject = new Project();
//			newProject.setTitle("Semestre 2024,1");
//			prepo.save(newProject);
//
//			var newUser = new User();
//			newUser.setName("Kleber Aluizio");
//			urepo.save(newUser);
//
//			var newActivity = new Activity("Estruturas de dados", newProject, newUser);
//			arepo.save(newActivity);
//		};
//	}
}
