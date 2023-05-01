package com.refactoring.study.section18.after.subclass;

public class PremiumDelegate {
    private Booking host;
    private PremiumExtra premiumExtra;

    public PremiumDelegate(Booking host, PremiumExtra premiumExtra) {
        this.host = host;
        this.premiumExtra = premiumExtra;
    }

    public boolean hasTalkback() {
        return this.host.show.hasOwnProperty("talkback");
    }

    public double extendBasePrice(double result) {
        return Math.round(result + this.premiumExtra.getPremiumFee());
    }

    public boolean hasDinner() {
        return this.premiumExtra.hasOwnProperty("dinner") && !this.host.isPeakDay();
    }
}
