package edu.depaul.cdm.se450.pattern.behavioral.visitor;

public class Book implements Visitable {
    private double price;
    private double weight;
    private String title;
    private String isbn;

    public Book(String title, double price, double weight) {
        this.title = title;
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
