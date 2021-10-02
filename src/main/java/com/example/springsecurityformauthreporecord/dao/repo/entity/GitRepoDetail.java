package com.example.springsecurityformauthreporecord.dao.repo.entity;

import javax.persistence.*;

@Table(name = "git_repo", schema = "mynotebook")
@Entity
public class GitRepoDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private String id;
    @Column(name = "username")
    private String username;
    @Column(name="subject")
    private String subject;
    @Column(name="topic")
    private String topic;
    @Column(name="description")
    private String description;
    @Column(name="git_repo_url")
    private String gitRepoUrl;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGitRepoUrl() {
        return gitRepoUrl;
    }

    public void setGitRepoUrl(String gitRepoUrl) {
        this.gitRepoUrl = gitRepoUrl;
    }
}
