package com.andresMoreno96.amt.services;

import ch.heigvd.amt.framework.api.IService;
import ch.heigvd.amt.framework.exceptions.InvalidOperationException;

import java.util.List;

public class TotoService implements IService {
  public static final String SERVICE_NAME = "TotoService";
  public static final String OPERATION_TELL = "toto";

  @Override
  public String execute(String operationName, List<String> parameterValues) throws InvalidOperationException {
    switch (operationName) {
      case OPERATION_TELL:
        return "It's the story of the use of toto instead of momo.";
      default:
        throw new InvalidOperationException("Operation " + operationName + " is not valid.");
    }
  }

  @Override
  public String getHelpMessage() {
    return "service: " + this.getClass().getCanonicalName() + "\r\n"
      + " operation: " + OPERATION_TELL + " (no arguments)";
  }
}
