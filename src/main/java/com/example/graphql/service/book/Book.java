package com.example.graphql.service.book;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {
  private String id;
  private String name;
  private String author;
  private Integer count;

  public Book(String id, String name, String author, Integer count) {
    this.id = id;
    this.name = name;
    this.author = author;
    this.count = count;
  }
}
