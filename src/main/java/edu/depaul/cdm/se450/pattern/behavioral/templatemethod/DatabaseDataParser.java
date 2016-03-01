package edu.depaul.cdm.se450.pattern.behavioral.templatemethod;

public class DatabaseDataParser extends DataParser {

    void readData() {
        System.out.println("Reading data from database");
    }

    void processData() {
        System.out.println("Looping through datasets");
    }
}