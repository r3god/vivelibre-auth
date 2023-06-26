package com.vivelibre.prueba.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.vivelibre.prueba.constants.Constants;
import com.vivelibre.prueba.model.AuthBody;
import com.vivelibre.prueba.model.AuthResponse;

@Service
public class HttpService {
  
  private final RestTemplate restTemplate = new RestTemplate();

  public AuthResponse getToken() throws RestClientException {
    var entity = new HttpEntity<>(buildBody(), buildHeader());
    ResponseEntity<AuthResponse> response = restTemplate.exchange(Constants.AUTH_URL, HttpMethod.POST, entity, AuthResponse.class);
    return response.getBody();
  }

  private AuthBody buildBody() {
    return new AuthBody(Constants.USER, Constants.PASS);
  }

  private MultiValueMap<String, String> buildHeader() {
    var header = new LinkedMultiValueMap<String, String>();
    header.add(Constants.CONTENT_TYPE, Constants.APP_JSON);
    return header; 
  }
}
