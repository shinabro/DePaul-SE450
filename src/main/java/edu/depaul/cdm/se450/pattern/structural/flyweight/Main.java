package edu.depaul.cdm.se450.pattern.structural.flyweight;


public class Main {
    public static void main(String[] args) {
        ComputerFlyweight.getComputer("Dell", "5600", "P5");
        ComputerFlyweight.getComputer("Dell", "5600", "P5");
        ComputerFlyweight.getComputer("Dell", "5600", "P5");
        ComputerFlyweight.getComputer("Dell", "5600", "P5");
        System.out.println(ComputerFlyweight.getCount());
        ComputerFlyweight.getComputer("Apple", "iPad", "II");
        System.out.println(ComputerFlyweight.getCount());
    }
}
