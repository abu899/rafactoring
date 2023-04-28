package com.refactoring.study.section11.after.subject.direct;

public class Manager extends Employee{
    public Manager(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "manager";
    }
}
