package edu.depaul.cdm.se450.pattern.behavioral.visitor;

/**
 * Calculates postage for everything that is in the shopping cart
 */
public class PostageVisitor implements Visitor{
    private double totalPostageForCart;

    public PostageVisitor() {
        totalPostageForCart = 0;
    }

    public double getTotalPostageForCart() {
        return totalPostageForCart;
    }

    @Override
    public void visit(Book book) {

        if (book.getPrice() < 10.0) {
            totalPostageForCart += book.getWeight() * 2;
        }
    }

    public void visit(VideoGame game) {
        if (game.getPrice() < 20.0) {
            totalPostageForCart += game.getWeight() * 2;
        }
    }
}
