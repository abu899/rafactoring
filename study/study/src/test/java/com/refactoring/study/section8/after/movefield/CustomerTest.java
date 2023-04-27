package com.refactoring.study.section8.after.movefield;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void applyDiscount() {
        Customer customer = new Customer("brett", 0.5);
        assertThat(customer.applyDiscount(100)).isEqualTo(50);

        customer.becomePreferred();
        assertThat(customer.applyDiscount(100)).isEqualTo(47);
    }
}