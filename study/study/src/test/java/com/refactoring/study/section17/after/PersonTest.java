package com.refactoring.study.section17.after;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    void manager() {
        Person brett = new Person("brett");
        Person nick = new Person("nick");
        brett.setDepartment(new Department("m365deploy", nick));

        Person manager = brett.getManager();
        assertEquals(nick, manager);
    }

}