package com.refactoring.study.section10.after;

public class Employee {

    private String name;
    private TelephoneNumber telephoneNumber;

    public Employee(String name, TelephoneNumber telephoneNumber) {
        this.name = name;
        this.telephoneNumber = telephoneNumber;
    }

    public String personalPhoneNumber() {
        return this.telephoneNumber.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPersonalAreaCode() {
        return this.telephoneNumber.getAreaCode();
    }

    public void setPersonalAreaCode(String personalAreaCode) {
        this.telephoneNumber.setAreaCode(personalAreaCode);
    }

    public String getPersonalNumber() {
        return this.telephoneNumber.getNumber();
    }

    public void setPersonalNumber(String personalNumber) {
        this.telephoneNumber.setNumber(personalNumber);
    }

    public TelephoneNumber getTelephoneNumber() {
        return telephoneNumber;
    }
}
