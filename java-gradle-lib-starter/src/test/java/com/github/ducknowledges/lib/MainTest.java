package com.github.ducknowledges.lib;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MainTest {

  @Test
  @DisplayName("print hello world")
  void shouldPrintHelloWorldToConsole() {
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    System.setOut(new PrintStream(out));
    Main.main(null);
    assertThat(out.toString()).isEqualTo("Hello world!\n");
  }
}
