package ru.alexander_kramarenko.polymorphic_1.base;

public class ShapeBase implements ShapeInterface {

    protected String name;
    protected double width, height, radius;

    public ShapeBase(String name, double width, double height) {
        super();
        this.name = name;
        this.width = width;
        this.height = height;
    }

    public ShapeBase(String name, double radius) {
        super();
        this.name = name;
        this.radius = radius;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setRadius() {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calculateArea() {
        return 0;
    }
}
