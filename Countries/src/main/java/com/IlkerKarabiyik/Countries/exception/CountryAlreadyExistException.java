package com.IlkerKarabiyik.Countries.exception;

import com.IlkerKarabiyik.Countries.util.constants.I18N.I18NConstants;

public class CountryAlreadyExistException extends AlreadyExistException{
    public CountryAlreadyExistException(String message) {
        super(I18NConstants.COUNTRY_ALREADY_EXISTS);
    }
}
