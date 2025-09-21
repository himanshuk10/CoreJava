package test.factory;



public class Client {
    public static void main(String[] args) {
        Shape shape = Shapefactory.getShape("CIRCLE");
        shape.draw();
    }
}
