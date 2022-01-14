package ru.alexander_kramarenko.polymorphic_1.shape;

import ru.alexander_kramarenko.polymorphic_1.base.ShapeBase;

public class Rectangle extends ShapeBase {

    public Rectangle(String name, double width, double height) {
        super(name, width, height);
    }

    public double calculateArea() {
        return width * height;
    }
}
