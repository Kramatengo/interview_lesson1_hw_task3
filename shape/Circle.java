package ru.alexander_kramarenko.polymorphic_1.shape;

import ru.alexander_kramarenko.polymorphic_1.base.ShapeBase;

public class Circle extends ShapeBase {

    public Circle(String name, double radius) {
        super(name, radius);
    }

    public double calculateArea() {
        return radius * 2 * Math.PI;
    }
}
