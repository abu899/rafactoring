package com.refactoring.study.section6.split;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void updateGeometry() {
        Rectangle rect = new Rectangle();
        rect.updateGeometry(10, 5);
        assertThat(rect.getArea()).isEqualTo(50d);
        assertThat(rect.getPerimeter()).isEqualTo(30d);

        rect.updateGeometry(5, 5);
        assertThat(rect.getArea()).isEqualTo(25d);
        assertThat(rect.getPerimeter()).isEqualTo(20d);
    }
}