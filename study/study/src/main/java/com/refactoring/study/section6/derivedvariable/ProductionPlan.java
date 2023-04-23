package com.refactoring.study.section6.derivedvariable;

import java.util.ArrayList;
import java.util.List;

public class ProductionPlan {
    private List<Double> adjustments = new ArrayList<>();

    public void applyAdjustment(double adjustment) {
        this.adjustments.add(adjustment);
    }

    public double getProduction() {
//        return this.adjustments.stream().reduce(0d, Double::sum);
        return this.adjustments.stream().mapToDouble(Double::valueOf).sum();
    }
}
