package com.refactoring.study.section15.after;

import com.refactoring.study.section15.Reservation;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ReservationTest {

    @Test
    void reservation() {
        Reservation reservation = new Reservation(
                "tennis",
                LocalDateTime.of(2023, 4, 29, 18, 40),
                LocalDateTime.of(2023, 4, 29, 20, 40));
        reservation.setAlarmBefore(30);

        assertThat(reservation.getAlarm()).isEqualTo(LocalDateTime.of(2023, 4, 29, 18, 10));
    }
}