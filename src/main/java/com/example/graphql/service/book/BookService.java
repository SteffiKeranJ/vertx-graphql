package com.example.graphql.service.book;

import com.example.graphql.service.book.impl.BookServiceImpl;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;

import java.util.List;

public interface BookService {

  static BookService create(Vertx vertx) {
    return new BookServiceImpl(vertx);
  }

  public BookService getBookById(String id, Handler<AsyncResult<Book>>handler);
  public BookService getBooks(Handler<AsyncResult<List<Book>>>handler);

}
