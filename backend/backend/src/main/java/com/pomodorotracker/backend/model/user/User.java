package com.pomodorotracker.backend.model.user;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.pomodorotracker.backend.model.project.Activity;
import jakarta.persistence.*;

import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Data
@ToString
@Entity
public class User {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonManagedReference
    private List<Activity> activities;

}
