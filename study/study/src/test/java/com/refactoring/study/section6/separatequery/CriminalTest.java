package com.refactoring.study.section6.separatequery;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CriminalTest {

    @Test
    void alert() {
        Criminal criminal = new Criminal();
        String found = criminal.findMiscreant(List.of(new Person("brett"), new Person("Don")));
        assertThat(found).isEqualTo("Don");

        found = criminal.findMiscreant(List.of(new Person("John"), new Person("Don")));
        assertThat(found).isEqualTo("John");

        found = criminal.findMiscreant(List.of(new Person("brett"), new Person("ahn")));
        assertThat(found).isEqualTo("");
    }
}