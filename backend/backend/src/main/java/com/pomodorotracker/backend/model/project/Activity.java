package com.pomodorotracker.backend.model.project;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.pomodorotracker.backend.model.user.User;
import jakarta.persistence.*;
import java.time.Duration;
import java.util.List;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Activity
{
    @Id
    @GeneratedValue
    private Integer id;

    private String title;

    private Duration targetTime;

    private Duration spentTime;

    @ManyToOne
    @JoinColumn(name="user_id")
    @JsonBackReference
    private User user;

    @ManyToOne
    @JoinColumn(name = "project_id")
    @JsonBackReference
    private Project project;

    public Activity(){}

    public Activity(String title, Project project, User user){
        this.title = title;
        this.user = user;
        this.project = project;
    }
}
