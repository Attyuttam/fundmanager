package com.attyuttam.fundmanager.events.fund;

import java.time.Instant;

public class NonRiskyShares extends NonRisky<Shares>{
    public NonRiskyShares(Instant occurredOn, Shares nonRiskyInvestment){
        super(occurredOn, nonRiskyInvestment);
    }
}
