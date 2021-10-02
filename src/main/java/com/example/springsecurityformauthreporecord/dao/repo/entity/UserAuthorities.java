package com.example.springsecurityformauthreporecord.dao.repo.entity;

import javax.persistence.*;

@Table(name = "authorities", schema = "mynotebook")
@Entity
public class UserAuthorities {
    @Id
    @GeneratedValue
    private String id;
    @Column
    private String username;
    @Column
    private String authority;
}
