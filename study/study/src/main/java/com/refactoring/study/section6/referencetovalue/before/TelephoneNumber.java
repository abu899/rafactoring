package com.refactoring.study.section6.referencetovalue.before;

public class TelephoneNumber {
    private String areaCode;
    private String number;

    public String areaCode() {
        return areaCode;
    }

    public void areaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String number() {
        return number;
    }

    public void number(String number) {
        this.number = number;
    }
}
