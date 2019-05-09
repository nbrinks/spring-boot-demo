package com.example.demo;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

public class FooTest {

  @Test
  public void getBar() {
    Foo foo = new Foo("abc", "def");
    assertThat(foo.getBar()).isEqualTo("abc");
  }

  @Test
  public void getBaz() {
    Foo foo = new Foo("abc", "def");
    assertThat(foo.getBaz()).isEqualTo("def");
  }
}
