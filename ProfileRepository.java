package com.example.blog.repository;

import com.example.blog.entity.Profile;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProfileRepository
        extends JpaRepository<Profile, Integer> {

    Optional<Profile> findByMailAddress(String mailAddress);

    Optional<Profile> findByName(String name);

}
