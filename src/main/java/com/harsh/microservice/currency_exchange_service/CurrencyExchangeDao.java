package com.harsh.microservice.currency_exchange_service;

import com.harsh.microservice.currency_exchange_service.entity.CurrencyExchange;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyExchangeDao extends JpaRepository<CurrencyExchange, Long>
{
   CurrencyExchange findByFromAndTo(String from, String to);
}
