package com.attyuttam.fundmanager.events.processor;

import com.attyuttam.fundmanager.events.fund.Shares;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class SharesData implements FundData<Shares>{

    @Override
    public void printFundData(Shares shares) {
        log.info("The details of the Shares received: {}",shares);
    }
    
}
