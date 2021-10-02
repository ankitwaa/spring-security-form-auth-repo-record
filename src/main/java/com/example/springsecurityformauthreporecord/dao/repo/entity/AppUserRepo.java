package com.example.springsecurityformauthreporecord.dao.repo.entity;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Table;
import java.util.Optional;

@Repository
public interface AppUserRepo extends CrudRepository<AppUser, String> {
    Optional<AppUser> findByUserName(String username);
}
