package com.vivelibre.prueba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;

import com.vivelibre.prueba.dto.AuthOutDto;
import com.vivelibre.prueba.mapper.AuthDtoMapper;
import com.vivelibre.prueba.model.AuthResponse;
import com.vivelibre.prueba.service.HttpService;

@RestController
public class AuthController {
  
  @Autowired
  private HttpService httpService;

  @Autowired
  private AuthDtoMapper authDtoMapper;

  @GetMapping("/get-token")
  public ResponseEntity<Object> getToken() {
    try {
      AuthResponse resp = httpService.getToken();
      AuthOutDto outDto = authDtoMapper.authRespToDto(resp);
      return ResponseEntity.ok(outDto);
    } catch( RestClientException ex ) {
      return ResponseEntity.internalServerError().body(ex.getMessage());
    }
  }
}
