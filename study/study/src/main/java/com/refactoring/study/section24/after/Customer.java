package com.refactoring.study.section24.after;

public class Customer {

    private Double discountRate;

    public double applyDiscount(double amount) {
        return (this.discountRate != null) ? amount - (this.discountRate * amount) : amount;
    }

    public Double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(Double discountRate) {
//        assert discountRate != null && discountRate > 0;
        if (discountRate == null || discountRate < 0) {
            throw new IllegalArgumentException("Discount rate is wrong :" + discountRate);
        }
        this.discountRate = discountRate;
    }
}
