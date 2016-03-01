package edu.depaul.cdm.se450.pattern.creational.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * Demo of Singleton
 */
public class EagerStateLookupSingleton {
    private static EagerStateLookupSingleton instance;
    private static Map<String, USState> STATES;


    static {
        USState IL = new USState("IL", "Illinois");
        USState MI = new USState("MI", "Michigan");
        USState NY = new USState("NY", "New York");

        STATES = new HashMap<String, USState>();
        STATES.put(IL.getAbbr(), IL);
        STATES.put(MI.getAbbr(), MI);
        STATES.put(NY.getAbbr(), NY);

        instance = new EagerStateLookupSingleton();
    }

    private EagerStateLookupSingleton() {
    }

    public static EagerStateLookupSingleton getInstance() {
        return instance;
    }

    public USState findStateFor(String abbr) {
        return STATES.get(abbr);
    }

}
