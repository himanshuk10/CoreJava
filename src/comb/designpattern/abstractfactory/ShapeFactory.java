package comb.designpattern.abstractfactory;

import comb.designpattern.factory.Rectangle;
import comb.designpattern.factory.Shape;

public class ShapeFactory extends AbstractFactory{
    @Override
    public Shape getShape(String type) {
        if (type.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        return null;
    }
}


