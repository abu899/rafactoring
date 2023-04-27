package com.refactoring.study.section9.after;

public class Bill {

    private ElectricityUsage electricityUsage;

    private GasUsage gasUsage;

    public double calculateBill() {
        return electricityUsage.getElectricityBill() + gasUsage.getGasBill();
    }
}
