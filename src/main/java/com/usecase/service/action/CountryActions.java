package com.usecase.service.action;

import com.usecase.enums.Country;

public interface CountryActions {

    String process(String message);

    Country getCountry();
}
