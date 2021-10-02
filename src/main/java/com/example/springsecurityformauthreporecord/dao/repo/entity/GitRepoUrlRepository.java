package com.example.springsecurityformauthreporecord.dao.repo.entity;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface GitRepoUrlRepository extends CrudRepository<GitRepoDetail, String> {
    Optional<List<GitRepoDetail>> findByUsername(String username);
}
