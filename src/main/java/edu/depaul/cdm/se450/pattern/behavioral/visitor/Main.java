package edu.depaul.cdm.se450.pattern.behavioral.visitor;

/**
 * Created by ubuntu on 2/28/16.
 */
public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        // public Book(String title, double price, double weight)
        cart.addItems(new Book("Basic book", 5.99, 10));
        cart.addItems(new Book("Picture book", 25.99, 10));
        cart.addItems(new VideoGame("Brooks", 5.99, 10));
        cart.addItems(new VideoGame("Brooks V2", 25.99, 10));
        System.out.println(cart.calculatePostage());
    }
}
