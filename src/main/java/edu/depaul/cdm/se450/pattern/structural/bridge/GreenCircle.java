package edu.depaul.cdm.se450.pattern.structural.bridge;

public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Triangle[ color: green, radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}
