package com.attyuttam.fundmanager.events.fund;

import com.fasterxml.jackson.annotation.JsonTypeName;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonTypeName("MutualFunds")
@ToString
public class MutualFunds implements FundType {
    private String id;
    private String mutualFundsName;
    private String mutualFundManager;
    private Integer mutualFundAum;
	
}
