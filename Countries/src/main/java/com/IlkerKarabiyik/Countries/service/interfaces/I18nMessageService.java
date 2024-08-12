package com.IlkerKarabiyik.Countries.service.interfaces;

import java.util.Locale;
import java.util.Objects;

public interface I18nMessageService {

    String getMessage(String code, Locale locale, Objects... args);
}
