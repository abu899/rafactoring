package com.refactoring.study.section11.after.polymorphism.after.switches;

public class FullTimeEmployee extends Employee {

    @Override
    public int vacationHours() {
        return 120;
    }

    @Override
    public boolean canAccessTo(String project) {
        return true;
    }
}
