package com.refactoring.study.section11.after.polymorphism.after.switches;

import java.util.List;

public class PartTimeEmployee extends Employee {
    public PartTimeEmployee(List<String> availableProjects) {
        super(availableProjects);
    }

    @Override
    public int vacationHours() {
        return 80;
    }
}
