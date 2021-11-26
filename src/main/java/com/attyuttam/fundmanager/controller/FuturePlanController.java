package com.attyuttam.fundmanager.controller;

import com.attyuttam.fundmanager.events.fund.FuturePlan;
import com.attyuttam.fundmanager.events.processor.FuturePlanProcessor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class FuturePlanController {
    private final FuturePlanProcessor futurePlanProcessor;
    @PostMapping("/process/future-plan")
    public void processFuturePlan(@RequestBody FuturePlan futurePlan){
        futurePlanProcessor.processFuturePlan(futurePlan);
    }
}
