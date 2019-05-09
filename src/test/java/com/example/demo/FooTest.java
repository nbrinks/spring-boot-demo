package com.example.demo;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

public class FooTest {

  @Test
  public void getBar() {
    Foo foo = new Foo("abc", "def");
    assertThat(foo.getBar()).isEqualTo("abc");
    foo.setBar("xyz");
    assertThat(foo.getBar()).isNotEqualTo("abc");
  }

  @Test
  public void getBaz() {
    Foo foo = new Foo("abc", "def");
    assertThat(foo.getBaz()).isEqualTo("def");
    foo.setBaz("xyz");
    assertThat(foo.getBaz()).isNotEqualTo("def");
  }

  @Test
  public void isAwesome() {
    Foo foo = new Foo("abc", "def");
    assertThat(foo.isAwesome()).isFalse();
    foo.setBaz("abc");
    assertThat(foo.isAwesome()).isTrue();
  }
}
