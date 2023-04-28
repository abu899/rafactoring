package com.refactoring.study.section11.after.object;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class OrderProcessorTest {
    @Test
    void priority() {
        OrderProcessor orderProcessor = new OrderProcessor();
        long highPriorityOrders = orderProcessor.numberOfHighPriorityOrders(
                List.of(new Order("low"),
                        new Order("normal"),
                        new Order("high"),
                        new Order("rush")));

        assertThat(highPriorityOrders).isEqualTo(2);
    }
}