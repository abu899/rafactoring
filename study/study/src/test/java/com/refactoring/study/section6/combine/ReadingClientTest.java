package com.refactoring.study.section6.combine;

import org.junit.jupiter.api.Test;

import java.time.Month;
import java.time.Year;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ReadingClientTest {
    @Test
    void client1() {
        Client1 client1 = new Client1(acquireRead());
        assertThat(client1.getBaseCharge()).isEqualTo(100d);
    }

    @Test
    void client2() {
        Client2 client2 = new Client2(acquireRead());
        assertThat(client2.getBase()).isEqualTo(100d);
        assertThat(client2.getTaxableCharge()).isEqualTo(95d);
    }

    @Test
    void client3() {
        Client3 client3 = new Client3(acquireRead());
        assertThat(client3.getBasicChargeAmount()).isEqualTo(100d);
    }

    private Reading acquireRead() {
        return new Reading("brett", 10, Month.MARCH, Year.of(2023));
    }
}