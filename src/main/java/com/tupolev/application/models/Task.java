package com.tupolev.application.models;

import javax.persistence.*;


@Entity
public class Task {
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Id
    private int taskId;

    private String taskDiscription;

    private String taskPlace;

    private String filename;

    private String taskTag;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User author;

    public Task(String taskDiscription, String taskPlace, String taskTag, User author) {
        this.taskDiscription = taskDiscription;
        this.taskPlace = taskPlace;
        this.taskTag = taskTag;
        this.author = author;
    }

    public String getAuthorName(){
        return author != null ? author.getFullName() : "<none>";
    }

    public Task() {
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTaskDiscription() {
        return taskDiscription;
    }

    public String getTaskPlace() {
        return taskPlace;
    }

    public String getTaskTag() {
        return taskTag;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User autor) {
        this.author = autor;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
}
