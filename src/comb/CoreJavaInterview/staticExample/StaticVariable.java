package comb.CoreJavaInterview.staticExample;

public class StaticVariable {

    static int x = 10;
    static int f;
    int y = 10;

    public static void main(String[] args) {
        int z;
//        System.out.println(z);//local variable must have to initialize before use
        System.out.println(f);// It will take default value of static variable type (int)
        StaticVariable obj1 = new StaticVariable();
        StaticVariable obj2 = new StaticVariable();
        obj1.x += 10;
        System.out.println("after first increment: " + obj1.x);
        obj2.x += 10;
        System.out.println("after second increment: " + obj2.x);

        System.out.println(obj1.x  + obj2.y);
    }
}
