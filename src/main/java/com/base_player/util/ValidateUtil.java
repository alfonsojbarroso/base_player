package com.base_player.util;

import org.apache.logging.log4j.util.Strings;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.base_player.constants.Constants;
import com.base_player.dto.PlayerDto;
import com.base_player.exception.BusinessException;

@Component
public class ValidateUtil {
    public void validateRequest(PlayerDto playerDto) throws BusinessException {
        if (Strings.isBlank(playerDto.getName())) {
            throw BusinessException.builder()
                    .message(Constants.EMPTY_NAME)
                    .httpStatus(HttpStatus.BAD_REQUEST)
                    .build();
        }
    }
}
