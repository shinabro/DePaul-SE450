package edu.depaul.cdm.se450.pattern.behavioral.templatemethod;

public class MockDataParser extends DataParser {

    void readData() {
        System.out.println("Reading data from hard coded file");
    }
    void processData() {
        System.out.println("Looping through hard coded file");
    }
}