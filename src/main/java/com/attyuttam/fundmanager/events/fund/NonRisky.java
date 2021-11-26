package com.attyuttam.fundmanager.events.fund;

import java.time.Instant;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class NonRisky<T extends FundType> extends Investment<T>{
    private T nonRiskyInvestment;

    public NonRisky(Instant occurredOn, T nonRiskyInvestment){
        this.nonRiskyInvestment = nonRiskyInvestment;
    }
}
