package com.refactoring.study.section24.after;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void discountRate() {
        Customer customer = new Customer();
        customer.setDiscountRate(-10d);
    }
}