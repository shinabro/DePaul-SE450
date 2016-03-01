package edu.depaul.cdm.se450.pattern.structural.flyweight;

import javax.swing.plaf.ComponentUI;
import java.util.HashSet;

public class ComputerFlyweight {
    private static HashSet<Computer> computers = new HashSet();

    public static Computer getComputer(String make, String model, String processor) {
        Computer computer = new Computer(make, model, processor);
        computers.add(computer);

        return computer;
    }

    public static int getCount() {
        return computers.size();
    }
}
