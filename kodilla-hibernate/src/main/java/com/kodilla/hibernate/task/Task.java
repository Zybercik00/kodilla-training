package com.kodilla.hibernate.task;

import com.kodilla.hibernate.tasklist.TaskList;
import org.springframework.lang.NonNull;

import jakarta.persistence.*;
import java.util.Date;

@NamedQueries({@NamedQuery(name = "Task.retrieveLongTasks", query = "FROM Task WHERE duration >10"), @NamedQuery(name = "Task.retrieveShortTasks", query = "FROM Task WHERE duration <= 10")})
@NamedNativeQuery(name = "Task.retrieveTasksWithEnoughTime", query = "SELECT * FROM TASKS" + " WHERE DATEDIFF(DATE_ADD(CREATED, INTERVAL DURATION DAY), NOW()) > 5", resultClass = Task.class)
@Entity
@Table(name = "TASKS")
public final class Task {

    private int id;
    private String description;
    private Date created;
    private int duration;
    private TaskList taskList;
    private TaskFinancialDetails taskFinancialDetails;

    public Task() {

    }
    public Task(String description, int duration) {
        this.description = description;
        this.created = new Date();
        this.duration = duration;
        this.taskList = new TaskList();
    }

    @Id
    @GeneratedValue
    @NonNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    @Column(name = "CREATED")
    @NonNull
    public Date getCreated() {
        return created;
    }

    @Column(name = "DURATION")
    public int getDuration() {
        return duration;
    }

    @ManyToOne
    @JoinColumn(name = "TASKLIST_ID")
    public TaskList getTaskList() {
        return taskList;
    }

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "TASKS_FINANCIALS_ID")
    public TaskFinancialDetails getTaskFinancialDetails() {
        return taskFinancialDetails;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setTaskList(TaskList taskList) {
        this.taskList = taskList;
    }

    public void setTaskFinancialDetails(TaskFinancialDetails taskFinancialDetails) {
        this.taskFinancialDetails = taskFinancialDetails;
    }
}
