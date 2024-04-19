package com.pomodorotracker.backend.model.project;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
    @OneToMany(mappedBy = "project")
    private List<Activity> activities;

    public Project(String title)
    {
        this.title = title;
    }
}

