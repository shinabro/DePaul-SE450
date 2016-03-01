package edu.depaul.cdm.se450.pattern.behavioral.visitor;

public class VideoGame  implements Visitable {
    private double price;
    private double weight;
    private String gameName;

    public VideoGame(String gameName, double price, double weight) {
        this.gameName = gameName;
        this.price = price;
        this.weight = weight;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }
}