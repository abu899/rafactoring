package com.refactoring.study.section4.after.flag;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ShipmentTest {

    @Test
    void deliveryDate() {
        LocalDate placeOn = LocalDate.of(2023, 4, 21);
        Order orderFromWA = new Order(placeOn, "WA");

        Shipment shipment = new Shipment();
        assertThat(placeOn.plusDays(1)).isEqualTo(shipment.rushDeliveryDate(orderFromWA));
        assertThat(placeOn.plusDays(2)).isEqualTo(shipment.regularDeliveryDate(orderFromWA));
    }
}