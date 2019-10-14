package com.wasabi.amt.services;

import ch.heigvd.amt.framework.api.IService;
import ch.heigvd.amt.framework.exceptions.InvalidOperationException;

import java.util.List;

public class JokesService implements IService {
  public static final String SERVICE_NAME = "jokesService";
  public static final String OPERATION_TELL_JOKE = "tellJoke";

  @Override
  public String execute(String operationName, List<String> parameterValues) throws InvalidOperationException {
    switch (operationName) {
      case OPERATION_TELL_JOKE:
        return "It's the story of paf the dog.";
      default:
        throw new InvalidOperationException("Operation " + operationName + " is not valid.");
    }
  }

  @Override
  public String getHelpMessage() {
    return "service: " + this.getClass().getCanonicalName() + "\r\n"
      + " operation: " + OPERATION_TELL_JOKE + " (no arguments)";
  }
}
