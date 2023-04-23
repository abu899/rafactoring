package com.refactoring.study.section6.derivedvariable;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class DiscountTest {

    @Test
    void discount() {
        Discount discount = new Discount(100);
//        assertThat(discount.getDiscountedTotal()).isEqualTo(0);
        assertThat(discount.getDiscountedTotal()).isEqualTo(100);

        discount.setDiscount(10);
        assertThat(discount.getDiscountedTotal()).isEqualTo(90);
    }
}