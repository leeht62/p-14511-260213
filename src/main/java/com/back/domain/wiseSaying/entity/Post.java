package com.back.wiseSaying.entity;

import jakarta.persistence.*;

@Entity
public class Post {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column(length = 100, nullable = false)
  private String title;

  @Column(length = 50, nullable = false)
  private String content;
}

