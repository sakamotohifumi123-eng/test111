package com.example.blog.repository;

import com.example.blog.entity.Rank;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RankRepository
        extends JpaRepository<Rank, Integer> {

    Optional<Rank> findByRankName(String rankName);

}
