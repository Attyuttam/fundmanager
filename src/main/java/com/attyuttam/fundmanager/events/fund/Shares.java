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
@JsonTypeName("Shares")
@ToString
public class Shares implements FundType {
    private String id;
    private String sharesName;
    private Integer sharesAum;
}
