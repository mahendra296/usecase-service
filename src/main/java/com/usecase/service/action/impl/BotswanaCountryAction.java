package com.usecase.service.action.impl;

import com.usecase.context.UseCase;
import com.usecase.enums.Country;
import com.usecase.service.action.CountryActions;
import org.springframework.stereotype.Component;

@UseCase
public class BotswanaCountryAction implements CountryActions {
    @Override
    public String process(String message) {
        return message + " " + Country.botswana.name();
    }

    @Override
    public Country getCountry() {
        return Country.botswana;
    }
}
