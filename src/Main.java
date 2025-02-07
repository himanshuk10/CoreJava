//interface y{
//   default void output(){
//       System.out.println("Inside y's implementation");
//   }
//}
//interface  x{
//    default void output(){
//        System.out.println("Inside x's implementation");
//    }
//
//}
//class A implements x,y {
//
//    @Override
//    public void output() {
//        System.out.println("implementing the method");
//    }
//}

class A
{
    void show(){System.out.println("I am in show");}
    public String toString() {
        return "A{}";
    }
}
public class Main{

    public static void main(String[] args)
    {
        System.out.println("Hello world");
        A obj = new A();
        obj.show();
    }

}