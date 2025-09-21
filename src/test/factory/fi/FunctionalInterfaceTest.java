package test.factory.fi;

import java.util.Comparator;

@FunctionalInterface
interface Person{
    void run();
}

@FunctionalInterface
interface Operation{
    int op(int var1, int var2, int var3);
}

//class Student implements Person{
//    @Override
//    public void run() {
//        System.out.println("Student is running");
//    }
//}

public class FunctionalInterfaceTest {
    public static void main(String[] args) {

//        Student student = new Student();
//        student.run();
//        Person student = new Person() {
//            @Override
//            public void run() {
//                System.out.println("student is running");
//            }
//        };
//        Person student = () -> System.out.println("student is running");
//        Person teacher = () -> System.out.println("teacher is running");
//        student.run();
//        teacher.run();

//        Operation sum = (var1,var2) ->  var1 + var2;
//        Operation sub = (var1, var2) ->  var1-var2;
//        Operation mul = (var1, var2) -> var1*var2;
//        Operation mod = (var1, var2) ->  var1%var2;

        Operation sum = (var1, var2, var3) -> var1+var2+var3;

        Comparator<Integer> sum1 = Integer::sum;

        System.out.println(sum1.compare(1,2));

//        System.out.println(sum);

    }
}
