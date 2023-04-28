package com.refactoring.study.section11.after.subject.direct;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void employeeType() {
        assertThat(Employee.createEmployee("brett", "engineer").getType()).isEqualTo("engineer");
        assertThat(Employee.createEmployee("brett", "manager").getType()).isEqualTo("manager");
    }
}