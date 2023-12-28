package com.usecase.controller;

import com.usecase.service.CountryService;
import com.usecase.utils.ResponseUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static com.usecase.utils.ResponseUtils.successResponseWithBody;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class TestController {

    private final CountryService countryService;

    @GetMapping("/hello")
    public ResponseEntity<Object> getHello() {
        return successResponseWithBody("Hello");
    }

    @GetMapping("/Object")
    public ResponseEntity<Object> getObject(@RequestParam("country") String country) {
        return successResponseWithBody(countryService.getCountryMessage(country, "This message is from"));
    }
}
