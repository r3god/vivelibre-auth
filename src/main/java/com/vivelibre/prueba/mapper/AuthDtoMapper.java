package com.vivelibre.prueba.mapper;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Component;

import com.vivelibre.prueba.constants.Constants;
import com.vivelibre.prueba.dto.AuthOutDto;
import com.vivelibre.prueba.model.AuthResponse;

@Component
public class AuthDtoMapper {
  
  public AuthOutDto authRespToDto(AuthResponse token) {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(Constants.DATE_PATTERN);
    return new AuthOutDto(
        token.getToken(), 
        simpleDateFormat.format(new Date()));
  }
}
