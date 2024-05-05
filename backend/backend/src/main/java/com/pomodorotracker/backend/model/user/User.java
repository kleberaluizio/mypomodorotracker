package com.pomodorotracker.backend.model.user;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.pomodorotracker.backend.model.project.Activity;
import jakarta.persistence.*;

import java.util.List;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

@NoArgsConstructor
@Getter
@Setter
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
