package com.example.graphql.service.author.impl;

import com.example.graphql.service.author.Author;
import com.example.graphql.service.author.AuthorService;
import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.ext.web.client.WebClient;

import java.util.HashMap;
import java.util.Map;

public class AuthorServiceImpl implements AuthorService {
  private Map<String, Author> authorMap;
  public AuthorServiceImpl(Vertx vertx) {
    this.authorMap = new HashMap<>();
    authorMap.put("author1", new Author("author1","Joanne","Rowling", "Fear not"));
    authorMap.put("author2", new Author("author2","Ruskin","Bond", "Stay Happy"));
    authorMap.put("author3", new Author("author3","William","Shakespeare", "Dare to dream"));
    authorMap.put("author4", new Author("author4","John","Gresham", "Do what you cant"));
  }

  public AuthorService getAuthor(String id, Handler<AsyncResult<Author>> handler) {
    System.out.println("Fetching author detail");
    handler.handle(Future.succeededFuture(authorMap.get(id)));
    return this;
  }
}
