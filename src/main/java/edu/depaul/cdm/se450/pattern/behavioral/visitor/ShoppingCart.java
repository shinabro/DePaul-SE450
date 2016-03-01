package edu.depaul.cdm.se450.pattern.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Visitable> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }
    public void addItems(Visitable item) {
        items.add(item);
    }

    public double calculatePostage() {
        PostageVisitor visitor = new PostageVisitor();

        for(Visitable item: items) {
            item.accept(visitor);
        }

        double postage = visitor.getTotalPostageForCart();
        return postage;
    }
}
