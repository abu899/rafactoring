package com.refactoring.study.section11.after.subject.direct;

public class SalesMan extends Employee{
    public SalesMan(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "salesman";
    }
}
