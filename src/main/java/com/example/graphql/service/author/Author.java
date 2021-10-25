package com.example.graphql.service.author;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Author {
  private String id;
  private String firstName;
  private String lastName;
  private String favoriteQuote;

  public Author(String id, String firstName, String lastName, String quote) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.favoriteQuote = quote;
  }
}
