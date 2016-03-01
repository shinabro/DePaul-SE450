package edu.depaul.cdm.se450.pattern.structural.flyweight;


public class Computer {
    private String make;
    private String model;
    private String processor;

    public Computer(String make, String model, String processor) {
        this.make = make;
        this.model = model;
        this.processor = processor;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getProcessor() {
        return processor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computer)) return false;

        Computer computer = (Computer) o;

        if (!make.equals(computer.make)) return false;
        return model.equals(computer.model);

    }

    @Override
    public int hashCode() {
        int result = make.hashCode();
        result = 31 * result + model.hashCode();
        return result;
    }
}
