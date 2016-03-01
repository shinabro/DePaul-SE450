package edu.depaul.cdm.se450.pattern.creational.singleton;

import java.util.HashMap;
import java.util.Map;

public class LazyStateLookupSingleton {
    private static LazyStateLookupSingleton instance;
    private static Map<String, USState> STATES;


    private LazyStateLookupSingleton() {
    }


    public static LazyStateLookupSingleton getInstance() {
        if (instance == null) {
            instance = new LazyStateLookupSingleton();

            USState IL = new USState("IL", "Illinois");
            USState MI = new USState("MI", "Michigan");
            USState NY = new USState("NY", "New York");

            STATES = new HashMap<String, USState>();
            STATES.put(IL.getAbbr(), IL);
            STATES.put(MI.getAbbr(), MI);
            STATES.put(NY.getAbbr(), NY);
        }

        return instance;
    }

    public USState findStateFor(String abbr) {
        return STATES.get(abbr);
    }
}
