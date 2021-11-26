package com.attyuttam.fundmanager.events.fund;

import java.time.Instant;

public class RiskyMutualFunds extends Risky<MutualFunds>{
    public RiskyMutualFunds(Instant occurredOn, MutualFunds riskyInvestment){
        super(occurredOn, riskyInvestment);
    }
}