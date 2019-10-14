package com.wasabi.amt.services;

import ch.heigvd.amt.framework.api.ServiceTest;
import ch.heigvd.amt.framework.exceptions.InvalidOperationException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class JokesServiceTest extends ServiceTest {

  @BeforeEach
  void setupService() {
    service = new JokesService();
  }

  @Test
  void itShouldProvideATellJokeOperation() throws InvalidOperationException {
    String value = service.execute(JokesService.OPERATION_TELL_JOKE, null);
    assertNotNull(value);
  }

}