package com.pomodorotracker.backend.model.project;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.pomodorotracker.backend.model.user.User;
import jakarta.persistence.*;
import java.time.Duration;
import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
public class Activity
{
    @Id
    @GeneratedValue
    private Integer id;

    private String title;

    private Duration targetTime;

    private Duration spentTime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    @JsonIgnore
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_id")
    @JsonBackReference
    private Project project;

    public Activity(){}

    public Activity(String title, Project project, User user){
        this.title = title;
        this.project = project;
        this.user = user;
    }
}
