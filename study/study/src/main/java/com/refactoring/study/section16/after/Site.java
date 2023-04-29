package com.refactoring.study.section16.after;

public class Site {

    private Customer customer;

    public Site(Customer customer) {
        this.customer = customer.getName().equals("unknown") ? new UnknowCustomer() : customer;
    }

    public Customer getCustomer() {
        return customer;
    }
}
