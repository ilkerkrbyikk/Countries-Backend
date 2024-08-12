package com.IlkerKarabiyik.Countries.exception;

import com.IlkerKarabiyik.Countries.service.interfaces.I18nMessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@RequiredArgsConstructor
public class GlobalExceptionHandler {

    private final I18nMessageService messageService;

    @ExceptionHandler({AlreadyExistException.class})
    public ResponseEntity<Object> handleAlreadyExistException(AlreadyExistException exception){
        String message = messageService.getMessage(exception.getMessage(), LocaleContextHolder.getLocale());
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(message);
    }
}
