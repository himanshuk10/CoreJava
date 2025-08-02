package comb.designpattern.abstractfactory;

import comb.designpattern.factory.Circle;
import comb.designpattern.factory.Shape;

public class RoundedShapeFactory extends AbstractFactory{
    @Override
    public Shape getShape(String type) {
        if (type.equalsIgnoreCase("ROUNDED")){
            return new Circle();
        }
        return null;
    }
}
