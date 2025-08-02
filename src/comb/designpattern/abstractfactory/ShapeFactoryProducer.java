package comb.designpattern.abstractfactory;

public class ShapeFactoryProducer {
    public static AbstractFactory getFactory(boolean Rounded){
        return Rounded ? new RoundedShapeFactory() : new ShapeFactory();
    }
}
