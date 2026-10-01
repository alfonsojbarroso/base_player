package com.base_player.exception.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

import com.base_player.dto.ErrorDto;
import com.base_player.exception.BusinessException;

@ControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(BusinessException.class)
    public ResponseEntity<?> hanldeBusinessException(BusinessException businessException) {
        ErrorDto errorDto = new ErrorDto(businessException.getMessage(), HttpStatus.BAD_REQUEST.toString());
        return new ResponseEntity<>(errorDto, HttpStatus.BAD_REQUEST);
    }

}
