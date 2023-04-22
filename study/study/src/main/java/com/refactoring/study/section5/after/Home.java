package com.refactoring.study.section5.after;

public class Home {
    public static void main(String[] args) {
        System.out.println(Thermostats.getTargetTemperature());
        Thermostats.setTargetTemperature(50);
        Thermostats.setFahrenheit(false);
    }
}
