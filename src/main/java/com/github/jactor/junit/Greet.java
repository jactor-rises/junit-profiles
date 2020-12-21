package com.github.jactor.junit;

public class Greet {

  private final String name;

  public Greet() {
    this("World");
  }

  public Greet(String name) {
    this.name = name;
  }

  public String sayHello() {
    return String.format("Hello %s!", name);
  }
}
