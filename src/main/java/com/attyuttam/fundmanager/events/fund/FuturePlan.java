package com.attyuttam.fundmanager.events.fund;

import java.time.Instant;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.ToString;

@Data
@AllArgsConstructor
@Builder
@ToString
public class FuturePlan {
    private String eventId;
    private Instant timestamp;
    
    @Singular
    private List<Investment> investments;
}
