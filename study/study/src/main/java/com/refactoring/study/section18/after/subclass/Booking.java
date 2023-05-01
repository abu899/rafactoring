package com.refactoring.study.section18.after.subclass;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class Booking {

    protected Show show;

    protected LocalDateTime time;

    protected PremiumDelegate premiumDelegate;

    public Booking(Show show, LocalDateTime time) {
        this.show = show;
        this.time = time;
    }

    public static Booking createBooking(Show show, LocalDateTime time) {
        return new Booking(show, time);
    }

    public static Booking createPremiumBooking(Show show, LocalDateTime time, PremiumExtra premiumExtra) {
//        PremiumBooking premiumBooking = new PremiumBooking(show, time, premiumExtra);
        Booking booking = createBooking(show, time);
        // subclass 를 위임으로 바꾸는 가장 중요한 장치
        booking.premiumDelegate = new PremiumDelegate(booking, premiumExtra);
        return booking;
    }

    public boolean hasTalkback() {
        return (this.premiumDelegate != null) ? this.premiumDelegate.hasTalkback() :
                this.show.hasOwnProperty("talkback") && !this.isPeakDay();
    }

    protected boolean isPeakDay() {
        DayOfWeek dayOfWeek = this.time.getDayOfWeek();
        return dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY;
    }

    public double basePrice() {
        double result = this.show.getPrice();
        if (this.isPeakDay()) result += Math.round(result * 0.15);
        return (this.premiumDelegate != null)
                ? this.premiumDelegate.extendBasePrice(result)
                : result;
    }

    public boolean hasDinner() {
        return this.premiumDelegate != null && this.premiumDelegate.hasDinner();
    }
}
