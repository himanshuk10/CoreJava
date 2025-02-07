package abstractclassAndInterface;
/*
* can abstract calss have private constructor
* yes, -> an abstract class can have private constructors in Java, but there are specific implications and use
* cases to consider.
* ->
* */

abstract class Shape {
    String name;

    // Private constructor to prevent direct instantiation
    private Shape(String name) {
        this.name = name;
    }

    // Static factory method to create specific shapes
    public static Shape createShape(String type) {
        if ("Circle".equalsIgnoreCase(type)) {
            return new Circle();
        } else if ("Square".equalsIgnoreCase(type)) {
            return new Square();
        } else if ("Cube".equalsIgnoreCase(type)) {
            return new Cube();
        }
        throw new IllegalArgumentException("Unknown shape type");
    }

    // Abstract method to be implemented by subclasses
    public abstract void draw();

    // Subclass of Shape
    static class Circle extends Shape {
        public Circle() {
            super("Circle");  // Calling the private constructor from the subclass
        }

        @Override
        public void draw() {
            System.out.println("Drawing a Circle.");
        }
    }

    // Subclass of Shape
    static class Square extends Shape {
        public Square() {
            super("Square");
        }

        @Override
        public void draw() {
            System.out.println("Drawing a Square.");
        }
    }
    static class Cube extends Shape{

        private Cube() {
            super("Cube");
        }

        @Override
        public void draw() {
            System.out.println("Drawing a Cube");
        }
    }
}
public class AbstractDemo2 {
    public static void main(String[] args) {
        Shape shape1 = Shape.createShape("Circle");
        shape1.draw();

        Shape shape2 = Shape.createShape("Square");
        shape2.draw();

        Shape shape3 = Shape.createShape("Cube");
        shape3.draw();

    }
}
