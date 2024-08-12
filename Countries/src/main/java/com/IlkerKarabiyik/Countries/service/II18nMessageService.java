package com.IlkerKarabiyik.Countries.service;

import com.IlkerKarabiyik.Countries.service.interfaces.I18nMessageService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import java.util.Locale;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class II18nMessageService implements I18nMessageService {

    private final MessageSource  messageSource;

    @Override
    public String getMessage(String code, Locale locale, Objects... args) {
        return messageSource.getMessage(code,args,locale);
    }
}
