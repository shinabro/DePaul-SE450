package edu.depaul.cdm.se450.pattern.behavioral.templatemethod;


public class Main {
    public static void main(String[] args) {

        MockDataParser csvDataParser=new MockDataParser();
        csvDataParser.parseDataAndGenerateOutput();
        System.out.println("**********************");
        DatabaseDataParser databaseDataParser=new DatabaseDataParser();
        databaseDataParser.parseDataAndGenerateOutput();
    }
}
