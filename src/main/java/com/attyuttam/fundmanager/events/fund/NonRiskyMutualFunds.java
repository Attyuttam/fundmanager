package com.attyuttam.fundmanager.events.fund;

import java.time.Instant;

public class NonRiskyMutualFunds extends NonRisky<MutualFunds>{
    NonRiskyMutualFunds(Instant occurredOn, MutualFunds nonRiskyInvestment){
        super(occurredOn, nonRiskyInvestment);
    }
}
