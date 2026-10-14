package com.base_player.exception.handler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

import com.base_player.dto.ErrorDto;
import com.base_player.exception.BusinessException;

@ControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(BusinessException.class)
    public ResponseEntity<?> hanldeBusinessException(BusinessException businessException) {
        ErrorDto errorDto = new ErrorDto(businessException.getMessage(), businessException.getHttpStatus());
        return new ResponseEntity<>(errorDto, errorDto.httpStatus());
    }

}
