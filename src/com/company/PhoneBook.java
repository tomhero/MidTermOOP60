package com.company;

import java.util.HashMap;

/**
 * PhoneBook
 */
public class PhoneBook {

    private HashMap<String, PhoneRecord> contactBook;

    public PhoneBook() {
        contactBook = new HashMap<>();
    }

    /**
     * @param record <- get name from PhoneRecord object using as key in HashMap
     * */
    public void addRecord(PhoneRecord record) {
        contactBook.put(record.getName(), record);
    }

    public void removeRecord(String name) {
        contactBook.remove(name);
    }

    public PhoneRecord findRecord(String name) {
        return contactBook.get(name);
    }

    public HashMap<String, PhoneRecord> getAllPhoneRecord() {
        return contactBook;
    }
}
