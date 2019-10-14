package com.andresMoreno96.amt.services;

import ch.heigvd.amt.framework.api.ServiceTest;
import ch.heigvd.amt.framework.exceptions.InvalidOperationException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TotoServiceTest extends ServiceTest {

  @BeforeEach
  void setupService() {
    service = new TotoService();
  }

  @Test
  void itOperation() throws InvalidOperationException {
    String value = service.execute(TotoService.OPERATION_TELL, null);
    assertNotNull(value);
  }

}