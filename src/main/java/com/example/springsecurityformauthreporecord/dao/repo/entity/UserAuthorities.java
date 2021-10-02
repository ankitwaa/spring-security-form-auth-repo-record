package com.example.springsecurityformauthreporecord.dao.repo.entity;

import org.springframework.security.jackson2.SimpleGrantedAuthorityMixin;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

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
