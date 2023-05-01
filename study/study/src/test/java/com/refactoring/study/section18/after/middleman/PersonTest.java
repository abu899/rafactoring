package com.refactoring.study.section18.after.middleman;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void getManager() {
        Person nick = new Person("nick", null);
        Person brett = new Person("brett", new Department(nick));
        assertThat(brett.getDepartment().getManager()).isEqualTo(nick);
    }
}