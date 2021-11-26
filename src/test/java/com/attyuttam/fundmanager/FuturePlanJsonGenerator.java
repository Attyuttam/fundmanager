package com.attyuttam.fundmanager;

import java.io.IOException;
import java.time.Instant;
import java.util.List;

import com.attyuttam.fundmanager.events.fund.FuturePlan;
import com.attyuttam.fundmanager.events.fund.FuturePlan.FuturePlanBuilder;
import com.attyuttam.fundmanager.events.fund.MutualFunds;
import com.attyuttam.fundmanager.events.fund.RiskyMutualFunds;
import com.attyuttam.fundmanager.events.fund.RiskyShares;
import com.attyuttam.fundmanager.events.fund.Shares;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JSR310Module;

import org.assertj.core.util.Lists;

public class FuturePlanJsonGenerator {
    public static void main(String args[]) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JSR310Module());
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

        List<Shares> shares = getShares();
        List<MutualFunds> mutualFunds = getMutualFunds();
        FuturePlan.FuturePlanBuilder futurePlanBuilderUpdate = FuturePlan.builder().eventId("abcd-123")
                .timestamp(Instant.now());
        shares.stream().map(share -> new RiskyShares(Instant.now(), share))
                .forEach(futurePlanBuilderUpdate::investment);
        mutualFunds.stream().map(mutualFund -> new RiskyMutualFunds(Instant.now(), mutualFund))
                .forEach(futurePlanBuilderUpdate::investment);
        printFuturePlanJson(objectMapper, futurePlanBuilderUpdate);
    }

    private static void printFuturePlanJson(ObjectMapper objectMapper, FuturePlanBuilder futurePlanBuilderUpdate)
            throws IOException {
        FuturePlan futurePlan = futurePlanBuilderUpdate.build();
        final String jsonString = objectMapper.writeValueAsString(futurePlan);
        System.out.println(jsonString);
    }

    private static List<MutualFunds> getMutualFunds() {
        return Lists.newArrayList(mf("1", "ICICI Direct Growth", "Attyuttam Saha", 1650000),
                mf("2", "HDFC Direct Growth", "Sraddha Chakraborty", 8650000));
    }

    private static MutualFunds mf(String mfId, String mfName, String mfManager, Integer mfAum) {
        return MutualFunds.builder().id(mfId).mutualFundsName(mfName).mutualFundManager(mfManager).mutualFundAum(mfAum)
                .build();
    }

    private static List<Shares> getShares() {
        return Lists.newArrayList(sh("1", "Paytm", 160000), sh("1", "Swiggy", 156300), sh("3", "Zomato", 234000));
    }

    private static Shares sh(String shId, String shName, Integer shAum) {
        return Shares.builder().id(shId).sharesName(shName).sharesAum(shAum).build();
    }
}
