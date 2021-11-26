package com.attyuttam.fundmanager.events.processor;

import com.attyuttam.fundmanager.events.fund.Risky;
import com.attyuttam.fundmanager.events.fund.RiskyMutualFunds;
import com.attyuttam.fundmanager.events.fund.RiskyShares;
import com.attyuttam.fundmanager.events.fund.NonRisky;
import com.attyuttam.fundmanager.events.fund.NonRiskyMutualFunds;
import com.attyuttam.fundmanager.events.fund.NonRiskyShares;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FundProcessorConfig {
    @Bean
    public FundProcessor riskyMutualFundsProcessor(MutualFundsData mutualFundsData){
        return new RiskyFundDataProcessor<>(RiskyMutualFunds.class,mutualFundsData);
    }

    @Bean
    public FundProcessor nonRiskyMutualFundsProcessor(MutualFundsData mutualFundsData){
        return new NonRiskyFundDataProcessor<>(NonRiskyMutualFunds.class,mutualFundsData);
    }

    @Bean
    public FundProcessor riskySharesProcessor(SharesData sharesData){
        return new RiskyFundDataProcessor<>(RiskyShares.class,sharesData);
    }

    @Bean
    public FundProcessor nonRiskySharesProcessor(SharesData sharesData){
        return new NonRiskyFundDataProcessor<>(NonRiskyShares.class,sharesData);
    }
}
