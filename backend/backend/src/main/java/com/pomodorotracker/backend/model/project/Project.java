package com.pomodorotracker.backend.model.project;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.time.Duration;
import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
public class Project {

    @Id
    @GeneratedValue
    private Integer id;
    private String title;
    private Duration targetTime;
    private Duration spentTime;
    @OneToMany(mappedBy = "project", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonManagedReference
    private List<Activity> activities;

    public Project(String title)
    {
        this.title = title;
    }
}

