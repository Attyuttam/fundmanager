package com.attyuttam.fundmanager.events.fund;

import java.time.Instant;

public class RiskyShares extends Risky<Shares>{
    public RiskyShares(Instant occurredOn, Shares riskyInvestment){
        super(occurredOn, riskyInvestment);
    }
}
