package edu.depaul.cdm.se450.pattern.creational.singleton;

/**
 * Created by ubuntu on 2/6/16.
 */
public class Main {
    public static void main(String[] args) {
        EagerStateLookupSingleton instance = EagerStateLookupSingleton.getInstance();
        USState illinois = instance.findStateFor("IL");

    }
}
