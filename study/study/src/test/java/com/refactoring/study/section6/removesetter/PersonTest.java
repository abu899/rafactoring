package com.refactoring.study.section6.removesetter;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void person() {
        Person person = new Person(10);
        person.setName("brett");
        assertThat(person.getId()).isEqualTo(10);
        assertThat(person.getName()).isEqualTo("brett");
        person.setName("ahn");
        assertThat(person.getName()).isEqualTo("ahn");
    }
}