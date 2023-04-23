package com.refactoring.study.section6.combine;

import java.time.Month;
import java.time.Year;

public class Client3 extends ReadingClient {

    private double basicChargeAmount;

    public Client3(Reading reading) {
        this.basicChargeAmount = enrichReading(reading).baseCharge();
    }

    public double getBasicChargeAmount() {
        return basicChargeAmount;
    }
}
