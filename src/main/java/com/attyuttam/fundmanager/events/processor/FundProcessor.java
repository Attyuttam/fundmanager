package com.attyuttam.fundmanager.events.processor;

import com.attyuttam.fundmanager.events.fund.Investment;

public interface FundProcessor<T extends Investment> {
    void processEvent(T event);
    Class<T> getSupportedEventClass();
}
