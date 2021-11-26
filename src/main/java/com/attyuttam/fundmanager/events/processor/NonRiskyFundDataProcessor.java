package com.attyuttam.fundmanager.events.processor;

import com.attyuttam.fundmanager.events.fund.FundType;
import com.attyuttam.fundmanager.events.fund.NonRisky;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@Slf4j
public class NonRiskyFundDataProcessor<E extends NonRisky<D>,D extends FundType> implements FundProcessor<E> {
    @Getter
    private final Class<E> supportedEventClass;
    private final FundData<D> fundData;

    @Override
    public void processEvent(E event) {
        log.info("Processing non risky investment of supportedEventClass: {}", supportedEventClass);
        fundData.printFundData(event.getNonRiskyInvestment());
    }


    
}

