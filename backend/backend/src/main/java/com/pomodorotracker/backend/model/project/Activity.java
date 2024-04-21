package com.pomodorotracker.backend.model.project;

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
    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;

    private Activity(){}
    public Activity(String title, Project project, User user){
        this.title = title;
        this.project = project;
        this.user = user;
    }
}
