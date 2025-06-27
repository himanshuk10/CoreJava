package comb.CoreJavaInterview.TrickyQuestionCoreJava;

public class Animal11 {
    String name;
    public Animal11() {
        this("Himanshu");
        System.out.println("In default");
        this.name = "Default name";
    }
    public Animal11(String name){
        System.out.println("Calling parameterized");
    }

    public static void main(String[] args) {
        Animal11 animal = new Animal11();
        System.out.println(animal.name);
    }
}
