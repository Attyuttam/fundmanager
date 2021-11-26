package com.attyuttam.fundmanager.events.processor;

import com.attyuttam.fundmanager.events.fund.MutualFunds;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class MutualFundsData implements FundData<MutualFunds>{

    @Override
    public void printFundData(MutualFunds mutualFunds) {
        log.info("The details of the Mutual Fund received: {}",mutualFunds);
    }
    
}
