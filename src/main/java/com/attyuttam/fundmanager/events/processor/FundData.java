package com.attyuttam.fundmanager.events.processor;

import com.attyuttam.fundmanager.events.fund.FundType;


public interface FundData<T extends FundType> {
    void printFundData(T fundType);
}
