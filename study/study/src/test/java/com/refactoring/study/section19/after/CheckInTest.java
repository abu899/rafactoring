package com.refactoring.study.section19.after;

import org.junit.jupiter.api.Test;

import static java.time.LocalDate.of;
import static org.assertj.core.api.Assertions.assertThat;

class CheckInTest {

    @Test
    void isFastPass() {
        assertThat(new Ticket(of(2023, 5, 1), true).isFastPass()).isTrue();
        assertThat(new Ticket(of(2023, 5, 1), false).isFastPass()).isFalse();
        assertThat(new Ticket(of(2023, 6, 2), true).isFastPass()).isFalse();
    }
}