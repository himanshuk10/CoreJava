package comb.designpattern.abstractfactory;

import comb.designpattern.factory.Shape;

public class Client {
    public static void main(String[] args) {
        AbstractFactory factory = ShapeFactoryProducer.getFactory(true);
        Shape shape1 = factory.getShape("ROUNDED");
        shape1.draw();



    }
}
