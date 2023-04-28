package com.refactoring.study.section11.after.object;

import java.util.List;

public class Priority {

    private String value;

    private List<String> legalValues = List.of("low", "normal", "high", "rush");

    public Priority(String value) {
        if (legalValues.contains(value)) {
            this.value = value;
        } else {
            throw new IllegalArgumentException("illegal argument value " + value);
        }
    }

    @Override
    public String toString() {
        return this.value;
    }

    private int index() {
        return this.legalValues.indexOf(this.value);
    }

    public boolean higherThan(Priority other) {
        return this.index() > other.index();
    }
}
