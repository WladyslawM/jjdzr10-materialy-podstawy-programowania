package com.infoshareacademy;

public class Car {
    private String name;
    private int maxSpeed;
    private Engine engine;

    private MyEnum color;

    public MyEnum getColor() {
        return color;
    }

    public void setColor(MyEnum color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    public String getName() {
        return name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public Engine getEngine() {
        return engine;
    }


    public Car() {
        name = "default name";
        maxSpeed = 150;
    }
}
