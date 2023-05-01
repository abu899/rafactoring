package com.refactoring.study.section19.after;

import java.time.LocalDate;

public class Ticket {

    private LocalDate purchasedDate;

    private boolean prime;

    public Ticket(LocalDate purchasedDate, boolean prime) {
        this.purchasedDate = purchasedDate;
        this.prime = prime;
    }

    public LocalDate getPurchasedDate() {
        return purchasedDate;
    }

    public boolean isPrime() {
        return prime;
    }

    public boolean isFastPass() {
        LocalDate earlyBirdDate = LocalDate.of(2023, 6, 1);
        return isPrime() && getPurchasedDate().isBefore(earlyBirdDate);
    }
}
