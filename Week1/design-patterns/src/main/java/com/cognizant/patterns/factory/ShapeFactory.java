package com.cognizant.patterns.factory;

public class ShapeFactory {

    public static Shape getShape(String shapeType) {
        if (shapeType == null || shapeType.isBlank()) {
            throw new IllegalArgumentException("Shape type must not be null or blank");
        }
        return switch (shapeType.toUpperCase()) {
            case "CIRCLE"    -> new Circle();
            case "RECTANGLE" -> new Rectangle();
            case "TRIANGLE"  -> new Triangle();
            default -> throw new IllegalArgumentException("Unknown shape type: " + shapeType);
        };
    }
}
