package com.example.blog.repository;

import com.example.blog.entity.Blog;
import com.example.blog.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BlogRepository
        extends JpaRepository<Blog, Integer> {

    List<Blog> findByUser(User user);

    List<Blog> findByBlogTitleContaining(String keyword);

    List<Blog> findAllByOrderByCreateTimeDesc();

}
