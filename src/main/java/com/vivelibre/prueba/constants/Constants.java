package com.vivelibre.prueba.constants;

public class Constants {
  private Constants() throws IllegalAccessException {
    throw new IllegalAccessException("Do not instantiate a utility class");
  }

  public static String AUTH_URL = "http://authService:8080/token";
  public static String USER = "auth-vivelibre";
  public static String PASS = "password";
  public static String CONTENT_TYPE = "Content-Type";
  public static String APP_JSON = "application/json";
  public static String DATE_PATTERN = "MMMM dd, yyyy";
}
