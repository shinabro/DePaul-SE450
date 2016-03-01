package edu.depaul.cdm.se450.pattern.structural.facade;


public class HouseMaker {
    public void drawHouse() {
        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();

        triangle.draw();
        rectangle.draw();
    }
}
