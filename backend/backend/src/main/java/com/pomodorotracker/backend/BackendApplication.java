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
			var user = urepo.findById(52);
			var activities = arepo.findAllByUser(user.get());
			System.out.println("teste");
			//user.ifPresent(arepo::findAllByUser);
		};
	}
//	@Bean
//	public CommandLineRunner commandLineRunner (UserRepository urepo, ActivityRepository arepo, ProjectRepository prepo){
//		return args -> {
//			var newProject = prepo.findById(52);
//
//			var newUser = urepo.findById(52);
//
//			var newActivity = new Activity("Metodologia da Pesquisa", newProject.get(), newUser.get());
//			arepo.save(newActivity);
//		};
//	}
}
