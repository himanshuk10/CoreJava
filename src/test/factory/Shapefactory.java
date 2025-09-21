package test.factory;

public class Shapefactory {
    public static Shape getShape(String string){
        switch (string){
            case "CIRCLE":
                return new Circle();
            case "RECTANGLE":
                return new Rectangle();
            default:
                return null;
        }
    }
}
