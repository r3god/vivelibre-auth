package com.vivelibre.prueba.model;

public class AuthBody {
    private String username;
    private String password;
    
    public AuthBody(String username, String password) {
      this.username = username;
      this.password = password;
    }

    public String getUsername() {
      return username;
    }
    public void setUsername(String username) {
      this.username = username;
    }
    public String getPassword() {
      return password;
    }
    public void setPassword(String password) {
      this.password = password;
    }
}
