package com.refactoring.study.section20.after;

public class Employee extends Party {
    public Employee(String name) {
        super(name);
    }

    private Integer id;

    private double monthlyCost;

    public Integer getId() {
        return id;
    }

    @Override
    protected double monthlyCost() {
        return this.monthlyCost;
    }
}
