package com.refactoring.study.section18.after.subclass;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BookingTest {

    @Test
    void basePrice() {
        Show lionKing = new Show(List.of(), 120);
        LocalDateTime weekday = LocalDateTime.of(2023, 4, 28, 22, 0);

        Booking booking = Booking.createBooking(lionKing, weekday);
        assertThat(booking.basePrice()).isEqualTo(120);

        Booking premium = Booking.createPremiumBooking(lionKing, weekday, new PremiumExtra(List.of(), 50));
        assertThat(premium.basePrice()).isEqualTo(170);
    }

    @Test
    void basePrice_on_peakDay() {
        Show lionKing = new Show(List.of(), 120);
        LocalDateTime weekend = LocalDateTime.of(2023, 4, 29, 22, 0);

        Booking booking = Booking.createBooking(lionKing, weekend);
        assertThat(booking.basePrice()).isEqualTo(138);

        Booking premium = Booking.createPremiumBooking(lionKing, weekend, new PremiumExtra(List.of(), 50));
        assertThat(premium.basePrice()).isEqualTo(188);
    }

    @Test
    void talkback() {
        Show noTalkbackShow = new Show(List.of(), 120);
        Show talkbackShow = new Show(List.of("talkback"), 120);
        LocalDateTime nonPeekDay = LocalDateTime.of(2023, 4, 28, 22, 0);
        LocalDateTime peekDay = LocalDateTime.of(2023, 4, 29, 22, 0);

        assertFalse(Booking.createBooking(noTalkbackShow, nonPeekDay).hasTalkback());
        assertTrue(Booking.createBooking(talkbackShow, nonPeekDay).hasTalkback());
        assertFalse(Booking.createBooking(talkbackShow, peekDay).hasTalkback());

        PremiumExtra premiumExtra = new PremiumExtra(List.of(), 50);
        assertTrue(Booking.createPremiumBooking(talkbackShow, peekDay, premiumExtra).hasTalkback());
        assertFalse(Booking.createPremiumBooking(noTalkbackShow, peekDay, premiumExtra).hasTalkback());
    }

    @Test
    void hasDinner() {
        Show lionKing = new Show(List.of(), 120);
        LocalDateTime weekday = LocalDateTime.of(2023, 4, 28, 22, 0);
        LocalDateTime weekend = LocalDateTime.of(2023, 4, 29, 22, 0);
        PremiumExtra premiumExtra = new PremiumExtra(List.of("dinner"), 50);

        assertTrue(Booking.createPremiumBooking(lionKing, weekday, premiumExtra).hasDinner());
        assertFalse(Booking.createPremiumBooking(lionKing, weekend, premiumExtra).hasDinner());
        assertFalse(Booking.createBooking(lionKing, weekday).hasDinner());
        assertFalse(Booking.createBooking(lionKing, weekend).hasDinner());
    }

}