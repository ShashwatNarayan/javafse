package com.cognizant.patterns.factory;

public class FactoryMethodPatternDemo {

    public static void main(String[] args) {
        Shape circle = ShapeFactory.getShape("CIRCLE");
        circle.draw();

        Shape rectangle = ShapeFactory.getShape("RECTANGLE");
        rectangle.draw();

        Shape triangle = ShapeFactory.getShape("TRIANGLE");
        triangle.draw();
    }
}
