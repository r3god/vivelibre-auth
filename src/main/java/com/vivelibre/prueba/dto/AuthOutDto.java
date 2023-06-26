package com.vivelibre.prueba.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"token", "date"})
public class AuthOutDto {

    @JsonProperty("auth-vivelibre-token")
    private String token;
    private String date;
    
    public AuthOutDto(String token, String date) {
      this.token = token;
      this.date = date;
    }

    public String getDate() {
      return date;
    }

    public void setDate(String date) {
      this.date = date;
    }

    public String getToken() {
      return token;
    }

    public void setToken(String token) {
      this.token = token;
    }
}
