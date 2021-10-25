package com.example.graphql.service.author;

import com.example.graphql.service.author.impl.AuthorServiceImpl;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;

public interface AuthorService {

  static AuthorService create(Vertx vertx) {
    return new AuthorServiceImpl(vertx);
  }

  public AuthorService getAuthor(String id, Handler<AsyncResult<Author>> handler);

}
