package com.unitbv.code.firstmavenproject;

import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class App {

  public static void main(final String[] args) {
    final Gson gson = new Gson();
    final Person person = new Person("ion", 20, "ion@mail.com");
    System.out.println(gson.toJson(person));
  }
}
