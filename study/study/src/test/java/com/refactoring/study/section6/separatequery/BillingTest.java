package com.refactoring.study.section6.separatequery;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class BillingTest {
    @Test
    void billing() {
        Billing billing = new Billing(
                new Customer("brett",
                        List.of(new Invoice(20), new Invoice(30)))
                , new EmailGateway());
        assertThat(billing.getTotalOutstanding()).isEqualTo(50d);

        billing.sendBill();
    }
}