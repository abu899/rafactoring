package com.refactoring.study.section7.splitphase;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PriceOrderTest {

    @Test
    void priceOrder_discountedFee() {
        PriceOrder priceOrder = new PriceOrder();
        double price = priceOrder.priceOrder(new Product(10, 2, 0.5),
                4,
                new ShippingMethod(20, 1, 5));

        assertThat(price).isEqualTo(34);
    }

    @Test
    void priceOrder_feePerCase() {
        PriceOrder priceOrder = new PriceOrder();
        double price = priceOrder.priceOrder(new Product(10, 2, 0.5),
                2,
                new ShippingMethod(20, 1, 5));

        assertThat(price).isEqualTo(30);
    }
}