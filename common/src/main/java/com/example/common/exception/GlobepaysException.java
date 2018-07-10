package com.example.common.exception;

import lombok.Data;
import org.springframework.core.NestedRuntimeException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * 全局异常
 */
@Data
@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class GlobepaysException extends NestedRuntimeException {
    private String errorMessage;

    public GlobepaysException(String errorMessage) {
        super(errorMessage);
        this.errorMessage = errorMessage;
    }
}
