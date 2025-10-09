package comb.CoreJavaInterview.inner;

/**
 * if we  use static class : A.B obj1= new A.B();
 * or A.B obj1= obj.new B();
 */

class A{
    int age;
    void show(){
        System.out.println("in show");
    }

    static class B{
        void config(){
            System.out.println("in config");
        }
    }
}

public class InnerClassEx {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        A.B obj1= new A.B();
        obj1.config();
    }
}
