package com.example.graphql.service.quote;

import com.example.graphql.service.quote.impl.QuoteServiceImpl;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;

public interface QuoteService {
  static QuoteService create(Vertx vertx) {
    return new QuoteServiceImpl(vertx);
  }

  public QuoteService getQuote(String id, Handler<AsyncResult<Quote>> handler);
}
