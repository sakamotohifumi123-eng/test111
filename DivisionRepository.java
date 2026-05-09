package com.example.blog.repository;

import com.example.blog.entity.Division;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DivisionRepository
        extends JpaRepository<Division, Integer> {

    Optional<Division> findByDivisionName(String divisionName);

}
