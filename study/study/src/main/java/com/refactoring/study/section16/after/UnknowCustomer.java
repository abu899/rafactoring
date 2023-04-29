package com.refactoring.study.section16.after;

public class UnknowCustomer extends Customer{
    public UnknowCustomer() {
        super("unknown", new BasicBillingPlan(), new NullPaymentHistory());
    }

    @Override
    public boolean isUnknown() {
        return true;
    }

    @Override
    public String getName() {
        return "occupant";
    }
}
