package comb.CoreJavaInterview.TrickyQuestionCoreJava;
/*
* we can not override private method because they are not visible to sub class
*
* */
class Animal123 {
    private void name(){
        System.out.println("I am in Animal......");
    }
}
class Cat extends Animal123 {
    private void name(){
        System.out.println("I am in Cat......");
    }
}
public class PrivateMethodOverride {
    public static void main(String[] args) {
        Animal123 animal = new Cat();
//        animal.name();// Compilation error
    }
}
