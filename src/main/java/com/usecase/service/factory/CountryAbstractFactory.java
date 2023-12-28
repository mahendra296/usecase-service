package com.usecase.service.factory;

import com.usecase.context.UseCase;
import com.usecase.enums.Country;
import com.usecase.exceptions.InternalServerException;
import com.usecase.service.action.CountryActions;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@UseCase
@RequiredArgsConstructor
public class CountryAbstractFactory {

    private final List<CountryActions> countryActions;

    private Map<Country, CountryActions> countryActionsMap = new HashMap<>();

    @PostConstruct
    public void init() {
        countryActionsMap = countryActions.stream().collect(Collectors.toMap(CountryActions::getCountry, Function.identity()));
    }

    public CountryActions load(Country country) {
        CountryActions countryActions = countryActionsMap.get(country);
        if (countryActions == null) {
            throw new InternalServerException(country + "implementation not available");
        }
        return countryActions;
    }
}
