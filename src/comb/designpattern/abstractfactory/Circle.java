package comb.designpattern.abstractfactory;

import comb.designpattern.factory.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle is drawing");
    }
}
