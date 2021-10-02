package com.example.springsecurityformauthreporecord.auth;

import com.example.springsecurityformauthreporecord.dao.repo.entity.AppUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class CustomUserDetailsService implements UserDetailsService {

    private AppUserRepo appUserRepo;

    @Autowired
    public void setAppUserRepo(AppUserRepo appUserRepo) {
        this.appUserRepo = appUserRepo;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return appUserRepo.findByUserName(s).orElseThrow(() -> new UsernameNotFoundException("user with given name does not exist -" + s));
    }
}
