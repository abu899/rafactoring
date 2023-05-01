package com.refactoring.study.section18.after.superclass;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static java.time.LocalDate.of;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ScrollTest {

    @Test
    void daysSinceLastCleaning() {
        Scroll scroll = new Scroll(1, "brett", null, of(2023, 4, 30));
        assertThat(scroll.daysSinceLastCleaning(of(2022, 4, 30))).isEqualTo(5);
    }

}