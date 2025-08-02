package comb.designpattern.abstractfactory;

import comb.designpattern.factory.Shape;

public abstract class AbstractFactory {
    public abstract Shape getShape(String type);
}
