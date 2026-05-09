package com.example.blog.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tag")
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer tagId;

    @Column(length = 20, nullable = false, unique = true)
    private String tagName;

    @ManyToMany(mappedBy = "tags")
    private List<Blog> blogs;

    public Tag() {
    }
}