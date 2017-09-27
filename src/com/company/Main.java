package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // MidTerm Exam 1
        Scanner input = new Scanner(System.in);
        System.out.print("ID: ");
        String rawCode = input.next();

        Sibyl forecaster = new Sibyl(); // just forecaster object
        forecaster.encode(rawCode); // forecaster is predicting...

        int myPrediction = forecaster.getCode(); // get result of prediction

        System.out.print("Prediction result -> " + myPrediction + " -> ");
        // print result of prediction according to exam 1 conditions
        if (myPrediction <= 2) {
            System.out.println("Ok, just fine.");
        } else if (myPrediction > 2 && myPrediction <= 4) {
            System.out.println("GG");
        } else if (myPrediction > 4 && myPrediction <= 8) {
            System.out.println("GGWP");
        } else {
            System.out.println("Have a good time (: ");
        }
        // End of Exam 1

        // MidTerm Exam 2
        Time myClock = new Time();

        myClock.setTime(0, 34);
        myClock.printTime();
        myClock.printTime(true);

        myClock.setTime(12, 34, "A");
        myClock.printTime();
        myClock.printTime(true);
        // End of Exam 2

        //MidTerm Exam 3
        PhoneBook myContactBook = new PhoneBook(); // create contact book
        System.out.println("\nCreate my contact book...");

        // pick some contact
        PhoneRecord person1 = new PhoneRecord("Alice", "0891011123");
        PhoneRecord person2 = new PhoneRecord("Bob", "0924568542");
        PhoneRecord person3 = new PhoneRecord("Carol", "0921545328");
        PhoneRecord person4 = new PhoneRecord("Eve", "0813548569");
        PhoneRecord person5 = new PhoneRecord();
        person5.setName("Trudy");
        person5.setTelNumber("0871254563");

        // add contact to myContactBook
        myContactBook.addRecord(person1);
        myContactBook.addRecord(person2);
        myContactBook.addRecord(person3);
        myContactBook.addRecord(person4);
        myContactBook.addRecord(person5);

        HashMap<String, PhoneRecord> myAllRecord = myContactBook.getAllPhoneRecord();
        // print check information in myContactBook
        for (String contactName: myAllRecord.keySet()) {
            System.out.printf("Name: %s, ", myContactBook.findRecord(contactName).getName());
            System.out.printf("Tel: %s\n", myContactBook.findRecord(contactName).getTelNumber());
        }

        // edit myContactBook
        System.out.println("Edit my contact book...");
        person2.setTelNumber("0899999999");
        myContactBook.addRecord(person2);
        myContactBook.removeRecord("Trudy");

        HashMap<String, PhoneRecord> myAllRecord2 = myContactBook.getAllPhoneRecord();
        // print check information in myContactBook again!!
        for (String contactName: myAllRecord2.keySet()) {
            System.out.printf("Name: %s, ", myContactBook.findRecord(contactName).getName());
            System.out.printf("Tel: %s\n", myContactBook.findRecord(contactName).getTelNumber());
        }
        // End of Exam 3
    }
}
