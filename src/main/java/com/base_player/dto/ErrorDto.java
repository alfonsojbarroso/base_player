package com.base_player.dto;

import org.springframework.http.HttpStatus;

public record ErrorDto(String message, HttpStatus httpStatus) {

}
