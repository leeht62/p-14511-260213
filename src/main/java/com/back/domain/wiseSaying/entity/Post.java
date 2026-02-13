package com.back.domain.wiseSaying.entity;

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

  public Post(String title,String content){
    this.content=content;
    this.title=title;
  }
}

