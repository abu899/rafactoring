package com.refactoring.study.section6.split;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    @Test
    void discount() {
        Order order = new Order();
        assertThat(order.discount(50d, 100)).isEqualTo(50d);
        assertThat(order.discount(51d, 100)).isEqualTo(51d - 2);
        assertThat(order.discount(50d, 101)).isEqualTo(50d - 1);
        assertThat(order.discount(51d, 101)).isEqualTo(51d - 2 - 1);
    }
}