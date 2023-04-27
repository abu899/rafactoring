package com.refactoring.study.section7.movefunction;

public class Account {
    private int daysOverdrawn;
    private AccountType type;

    public Account(int daysOverdrawn, AccountType type) {
        this.daysOverdrawn = daysOverdrawn;
        this.type = type;
    }

    public double getBankCharge() {
        double result = 4.5;
        if (daysOverdrawn() > 0) {
            result += type.overdraftCharge(daysOverdrawn());
        }
        return result;
    }

    private int daysOverdrawn() {
        return this.daysOverdrawn;
    }
}
