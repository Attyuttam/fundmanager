package com.attyuttam.fundmanager.events.fund;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

@JsonTypeInfo(use = Id.NAME, include = As.PROPERTY, property = "fundType")
@JsonSubTypes({ @Type(Shares.class), @Type(MutualFunds.class) })
public interface FundType {
    String getId();

    void setId(String id);
    
}
