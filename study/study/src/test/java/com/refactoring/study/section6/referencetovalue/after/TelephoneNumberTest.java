package com.refactoring.study.section6.referencetovalue.after;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class TelephoneNumberTest {

    @Test
    void testEqual() {
        TelephoneNumber telephoneNumber1 = new TelephoneNumber("123", "1234");
        TelephoneNumber telephoneNumber2 = new TelephoneNumber("123", "1234");
        assertThat(telephoneNumber1).isEqualTo(telephoneNumber2);
    }
}