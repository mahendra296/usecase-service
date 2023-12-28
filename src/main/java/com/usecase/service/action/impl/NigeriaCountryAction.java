package com.usecase.service.action.impl;

import com.usecase.context.UseCase;
import com.usecase.enums.Country;
import com.usecase.service.action.CountryActions;

@UseCase
public class NigeriaCountryAction implements CountryActions {
    @Override
    public String process(String message) {
        return message + " " + Country.nigeria.name();
    }

    @Override
    public Country getCountry() {
        return Country.nigeria;
    }
}
