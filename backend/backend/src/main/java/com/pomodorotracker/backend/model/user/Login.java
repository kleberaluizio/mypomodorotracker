package com.pomodorotracker.backend.model.user;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;


public class Login
{

	private Integer id;
	private String password;
	private String email;

}
