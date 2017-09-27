package com.company;

/**
 * PhoneRecord
 */
public class PhoneRecord {

    private String name;
    private String telNumber;

    public PhoneRecord() {
    }

    public PhoneRecord(String name, String telNumber) {
        this.name = name;
        this.telNumber = telNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNum) {
        this.telNumber = telNum;
    }
}
