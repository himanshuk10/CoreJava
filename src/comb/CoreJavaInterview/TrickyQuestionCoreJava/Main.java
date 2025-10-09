package comb.CoreJavaInterview.TrickyQuestionCoreJava;//interface y{
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
//class Merge.A implements x,y {
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
        return "Merge.A{}";
    }
}
public class Main{

    public static void main(String[] args)
    {
//        System.out.println("Hello world");
//        Merge.A obj = new Merge.A();
//        obj.show();
//
        boolean isTrue = false;
        if(isTrue == true){
            System.out.println("TRUE TRUE");
        }
        if(isTrue = true){
            System.out.println("TRUE");
        }

        for (int i = 0, j = 0; i < 10; i++, j--) {
            System.out.print(j);
        }
    }

}