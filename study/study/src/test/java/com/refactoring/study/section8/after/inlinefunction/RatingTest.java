package com.refactoring.study.section8.after.inlinefunction;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RatingTest {

    @Test
    void rating() {
        Rating rating = new Rating();
        assertThat(rating.rating(new Driver(15))).isEqualTo(2);
        assertThat(rating.rating(new Driver(3))).isEqualTo(1);
    }
}