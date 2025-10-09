package comb.CoreJavaInterview.TrickyQuestionCoreJava;

class Animal {
    public Animal() {
        System.out.println("Merge.Animal constructor...");
    }
}
class Dog extends Animal123 {
    public Dog(){
        System.out.println("Merge.Dog constructor.....");
    }
}
class LabraDog extends Dog{
    public LabraDog(){
        System.out.println("LabraGog constructor......");
    }
}

public class ConstructorExamples {
    public static void main(String[] args) {
        LabraDog animal = new LabraDog();
    }
}
