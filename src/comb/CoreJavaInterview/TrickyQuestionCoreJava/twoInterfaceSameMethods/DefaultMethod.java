package comb.CoreJavaInterview.TrickyQuestionCoreJava.twoInterfaceSameMethods;
interface interface1{
    default void method(){
        System.out.println("Interface1's method impl");
    }
}
interface interface2{
    default void method(){
        System.out.println("Interface2's method impl");
    }
}
public class DefaultMethod implements interface1, interface2{
    @Override
    public void method() {
        interface1.super.method();
    }

    public static void main(String[] args) {
        DefaultMethod defaultMethod = new DefaultMethod();
        defaultMethod.method();
    }
}
