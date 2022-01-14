package ru.alexander_kramarenko.polymorphic_1.shape;

import ru.alexander_kramarenko.polymorphic_1.base.ShapeBase;

public class Triangle extends ShapeBase {

    public Triangle(String name, double width, double height) {
        super(name, width, height);
    }

    public double calculateArea() {
        return width * height / 2;
    }
}
