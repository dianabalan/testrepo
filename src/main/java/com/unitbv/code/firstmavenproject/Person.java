package com.unitbv.code.firstmavenproject;

public class Person {

  private String name;
  private int age;
  private String email;
  public Person(final String name, final int age, final String email) {
    super();
    this.name = name;
    this.age = age;
    this.email = email;
  }
  public int getAge() {
    return age;
  }
  public String getEmail() {
    return email;
  }
  public String getName() {
    return name;
  }
  public void setAge(final int age) {
    this.age = age;
  }
  public void setEmail(final String email) {
    this.email = email;
  }
  public void setName(final String name) {
    this.name = name;
  }

}
