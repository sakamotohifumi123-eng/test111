package com.example.blog.repository;

import com.example.blog.entity.Project;

import com.example.blog.entity.Division;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProjectRepository
        extends JpaRepository<Project, Integer> {

    Optional<Project> findByProjectName(String projectName);

    List<Project> findByDivision(Division division);

}
