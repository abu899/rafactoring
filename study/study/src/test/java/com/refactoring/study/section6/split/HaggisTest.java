package com.refactoring.study.section6.split;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class HaggisTest {

    @Test
    void distance() {
        Haggis haggis = new Haggis(10d, 20d, 10, 5);
        assertThat(haggis.distanceTravelled(10)).isEqualTo(50d);
        assertThat(haggis.distanceTravelled(20)).isEqualTo(125);
    }
}