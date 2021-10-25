package com.example.graphql.service.book.impl;

import com.example.graphql.service.book.Book;
import com.example.graphql.service.book.BookService;
import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookServiceImpl implements BookService {

  private Map<String, Book> bookMap;
  public BookServiceImpl(Vertx vertx){
    this.bookMap = new HashMap<>();
    bookMap.put("1", new Book("1", "Sorcer's Stone", "author1", 112));
    bookMap.put("2", new Book("2","Chambers of Secrets", "author2", 112));
    bookMap.put("3", new Book("3","Azkaban", "author3", 112));
    bookMap.put("4", new Book("4","Goblet of Fire", "author4", 112));
    bookMap.put("5", new Book("5","Order of Pheonix", "author1", 112));
  }

  public BookService getBooks(Handler<AsyncResult<List<Book>>> handler) {
    handler.handle(Future.succeededFuture(new ArrayList<>(bookMap.values())));
    return this;
  }

  public BookService getBookById(String id, Handler<AsyncResult<Book>> handler) {
    handler.handle(Future.succeededFuture(bookMap.get(id)));
    return this;
  }
}
