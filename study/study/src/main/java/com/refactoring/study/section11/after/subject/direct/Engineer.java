package com.refactoring.study.section11.after.subject.direct;

public class Engineer extends Employee{
    public Engineer(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "engineer";
    }
}
