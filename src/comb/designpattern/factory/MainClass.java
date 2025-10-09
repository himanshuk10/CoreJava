package comb.designpattern.factory;

public class MainClass {
    public static void main(String[] args) {
//        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = ShapeFactory.getShape("RECTANGLE");
        shape.draw();
    }
}
