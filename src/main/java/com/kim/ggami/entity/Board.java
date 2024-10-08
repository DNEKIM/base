package com.kim.ggami.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Board {

@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

private String title;

private String content;

@ManyToOne
@JoinColumn(name = "user_id")
private User user;

    @OneToMany(mappedBy = "board", orphanRemoval = true,cascade = CascadeType.ALL)
    private List<Comment> comments;
}
