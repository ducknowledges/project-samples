package com.github.ducknowledges.lib;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LibraryTest {

  private final Library library = new Library();

  @Test
  @DisplayName("should add two numbers")
  void shouldAddTwoNumber() {
    assertThat(library.add(2, 2)).isEqualTo(4);
  }
}
