package com.attyuttam.fundmanager.events.fund;

import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonTypeInfo(use = Id.NAME, include = As.PROPERTY, property = "investmentType")
@JsonSubTypes({ @Type(RiskyMutualFunds.class), @Type(RiskyShares.class), @Type(NonRiskyMutualFunds.class),
        @Type(NonRiskyShares.class) })
public abstract class Investment<T extends FundType> {
    private Instant occurredOn;
}
