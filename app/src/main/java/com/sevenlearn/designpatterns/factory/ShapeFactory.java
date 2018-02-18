package com.sevenlearn.designpatterns.factory;

/**
 * Created by user on 2/18/2018.
 */

public class ShapeFactory {

    public static Shape getShape(String type) {
        if (type.equalsIgnoreCase("Square")) {
            return new Square();
        } else if (type.equalsIgnoreCase("Circle")) {
            return new Circle();
        } else if (type.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        }else {
            throw new IllegalStateException();
        }
    }
}
