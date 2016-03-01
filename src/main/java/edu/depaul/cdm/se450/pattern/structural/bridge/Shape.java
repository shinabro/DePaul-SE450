package edu.depaul.cdm.se450.pattern.structural.bridge;

public abstract class Shape {
    private DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    protected DrawAPI getDrawAPI() { return drawAPI; }

    public abstract void draw();
}
