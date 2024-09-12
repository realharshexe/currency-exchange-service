package com.harsh.microservice.currency_exchange_service.controller;

import com.harsh.microservice.currency_exchange_service.CurrencyExchangeDao;
import com.harsh.microservice.currency_exchange_service.entity.CurrencyExchange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyExchangeController {

    @Autowired
    private CurrencyExchangeDao currencyExchangeDao;

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyExchange getCurrencyValue(@PathVariable String from, @PathVariable String to){
        CurrencyExchange currencyExchange = currencyExchangeDao.findByFromAndTo(from, to) ;
        if(currencyExchange == null){
            throw new RuntimeException("Unable to find data");
        }
        currencyExchange.setEnvironment("8080");
        return currencyExchange;
    }
}
