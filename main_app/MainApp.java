package ru.alexander_kramarenko.polymorphic_1.main_app;


import ru.alexander_kramarenko.polymorphic_1.base.ShapeBase;
import ru.alexander_kramarenko.polymorphic_1.shape.Circle;
import ru.alexander_kramarenko.polymorphic_1.shape.Rectangle;
import ru.alexander_kramarenko.polymorphic_1.shape.Triangle;

public class MainApp {

    private static void displayArea(ShapeBase shapeBase) {
        System.out.println("Area for shape named : " + shapeBase.getName() + " Area is : " + shapeBase.calculateArea());
    }

    public static void main(String[] args) {

        ShapeBase[] shapes = new ShapeBase[3];
        shapes[0] = new Rectangle("Rectangle", 10, 20);
        shapes[1] = new Triangle("Rriangle", 10, 20);
        shapes[2] = new Circle("circle", 30);

        for (int i = 0; i < shapes.length; i++) {
            displayArea(shapes[i]);
        }
    }
}
