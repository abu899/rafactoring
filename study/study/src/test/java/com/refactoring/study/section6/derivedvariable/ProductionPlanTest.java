package com.refactoring.study.section6.derivedvariable;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ProductionPlanTest {

    @Test
    void production() {
        ProductionPlan productionPlan = new ProductionPlan();
        productionPlan.applyAdjustment(10);
        productionPlan.applyAdjustment(20);
        assertThat(productionPlan.getProduction()).isEqualTo(30);
    }
}