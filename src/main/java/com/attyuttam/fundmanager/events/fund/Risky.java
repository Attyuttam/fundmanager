package com.attyuttam.fundmanager.events.fund;

import java.time.Instant;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class Risky<T extends FundType> extends Investment<T> {
    private T riskyInvestment;

    public Risky(Instant occurredOn, T riskyInvestment) {
        super(occurredOn);
        this.riskyInvestment = riskyInvestment;
    }

}
