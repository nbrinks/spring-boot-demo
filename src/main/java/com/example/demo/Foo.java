package com.example.demo;

public class Foo {

  private String bar;
  private String baz;

  public Foo(String bar, String baz) {
    this.bar = bar;
    this.baz = baz;
  }

  public String getBar() {
    return bar;
  }

  public void setBar(String bar) {
    this.bar = bar;
  }

  public String getBaz() {
    return baz;
  }

  public void setBaz(String baz) {
    this.baz = baz;
  }

  public boolean isAwesome() {
    return bar.equals(baz);
  }
}
