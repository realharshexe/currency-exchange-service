package com.harsh.microservice.currency_exchange_service.controller;

import com.harsh.microservice.currency_exchange_service.entity.CurrencyExchange;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyExchangeController {

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyExchange getCurrencyValue(@PathVariable String from, @PathVariable String to){

        CurrencyExchange currencyExchange = new CurrencyExchange(
                200L, "USD", "INR", BigDecimal.valueOf(80));

        currencyExchange.setEnvironment("8080");
        return currencyExchange;
    }
}
