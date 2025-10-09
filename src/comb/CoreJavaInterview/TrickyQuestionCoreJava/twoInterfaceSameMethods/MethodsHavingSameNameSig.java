package comb.CoreJavaInterview.TrickyQuestionCoreJava.twoInterfaceSameMethods;
interface A{
    void method();
}
interface B{
    void method();
}
public class MethodsHavingSameNameSig implements A,B{

    @Override
    public void method() {
        System.out.println("Method implementation");
    }

    public static void main(String[] args) {
        MethodsHavingSameNameSig obj = new MethodsHavingSameNameSig();
        obj.method();
    }
}
