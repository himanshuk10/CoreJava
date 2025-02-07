package abstractclassAndInterface;

abstract class A{
    public abstract void show();
    void talk(){
        System.out.println("I am inside talk");
    }
}
//interface A{
//    void show();
//}
//class B implements A{
//
//    @Override
//    public void show() {
//        System.out.println("I am in B show");
//    }
//    }
//}
public class Demo {
    public static void main(String[] args) {
//        A obj = new B();
//        obj.show();
        A obj  = new A() {
            @Override
            public void show() {
                System.out.println("I am in new Show");
            }

//            @Override
//            public void talk() {
//                System.out.println("talk is implementing in new");
//            }
        };
        obj.show();
        obj.talk();
    }
}

/**
 * abstract class is class with abstract keyword, can have abstract method(method without implementation) and concrete method as well
 * anonymous class can implement more than one abstract method
 *
 */

