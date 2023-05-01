package com.refactoring.study.section20.after;

import java.util.List;

public class Department extends Party {
    public Department(String name) {
        super(name);
    }

    private List<Employee> staff;

    public List<Employee> getStaff() {
        return staff;
    }

    @Override
    public double monthlyCost() {
        return this.staff.stream().mapToDouble(e -> e.monthlyCost()).sum();
    }

    public int headCount() {
        return this.staff.size();
    }
}
