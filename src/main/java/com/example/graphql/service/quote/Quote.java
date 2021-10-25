package com.example.graphql.service.quote;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.vertx.core.json.JsonObject;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Quote {
  @JsonIgnore
  private String id;
  private String quote;

  public Quote(JsonObject jsonObject) {
    this.id = jsonObject.getString("id");
    this.quote = jsonObject.getString("quote");
  }
}
