package com.attyuttam.fundmanager.events.processor;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.attyuttam.fundmanager.events.fund.FuturePlan;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class FuturePlanProcessor {
    private final Map<Class<?>,FundProcessor> fundProcessorMap;
    
    public FuturePlanProcessor(List<FundProcessor> fundProcessorList){
        fundProcessorMap = fundProcessorList.stream().collect(Collectors.toMap(FundProcessor::getSupportedEventClass, Function.identity()));
    }

    public void processFuturePlan(FuturePlan futurePlan){
        futurePlan.getInvestments().forEach(investment->{
            fundProcessorMap.get(investment.getClass()).processEvent(investment);
        });
    }
}
