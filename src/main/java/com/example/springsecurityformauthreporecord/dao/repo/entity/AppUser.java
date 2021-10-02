package com.example.springsecurityformauthreporecord.dao.repo.entity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Table(name = "users", schema = "mynotebook")
@Entity
public class AppUser implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private String id;
    @Column(name = "password")
    private String password;
    @Column(name = "username")
    private String username;
    @Column(name = "authority")
    @OneToMany(mappedBy = "username", fetch = FetchType.EAGER)
    private List<UserAuthorities> authority;
    @Column(name = "enabled")
    private boolean enabled;
    @Column(name = "account_not_expired")
    private boolean accountNotExpired;
    @Column(name ="account_not_locked")
    private boolean accountNotLocked;
    @Column(name = "credential_not_expired")
    private boolean credentialNotExpired;
    @Column(name = "algorithm")
    private boolean algorithm;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
