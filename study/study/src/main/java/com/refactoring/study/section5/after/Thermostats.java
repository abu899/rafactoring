package com.refactoring.study.section5.after;

public class Thermostats {
    private static Integer targetTemperature = 70;
    private static Boolean heating = true;
    private static Boolean cooling = false;
    private static Boolean fahrenheit = true;

    public static Integer getTargetTemperature() {
        return targetTemperature;
    }

    public static void setTargetTemperature(Integer targetTemperature) {
        // validation
        if (targetTemperature == null || targetTemperature > 5000) {
            System.out.println("targetTemperature is not valid : " + targetTemperature);
            return;
        }
        Thermostats.targetTemperature = targetTemperature;
    }

    public static Boolean getHeating() {
        return heating;
    }

    public static void setHeating(Boolean heating) {
        Thermostats.heating = heating;
    }

    public static Boolean getCooling() {
        return cooling;
    }

    public static void setCooling(Boolean cooling) {
        Thermostats.cooling = cooling;
    }

    public static Boolean getFahrenheit() {
        return fahrenheit;
    }

    public static void setFahrenheit(Boolean fahrenheit) {
        Thermostats.fahrenheit = fahrenheit;
    }
}
