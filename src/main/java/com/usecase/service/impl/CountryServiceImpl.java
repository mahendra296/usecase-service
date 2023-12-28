package com.usecase.service.impl;

import com.usecase.enums.Country;
import com.usecase.service.CountryService;
import com.usecase.service.factory.CountryAbstractFactory;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class CountryServiceImpl implements CountryService {

    private final CountryAbstractFactory countryAbstractFactory;
    @Override
    public String getCountryMessage(String country, String message) {
        return countryAbstractFactory.load(Country.valueOf(country)).process(message);
    }
}
