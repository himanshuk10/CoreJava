package java8Features;



import java.util.Arrays;
import java.util.List;


//class ConImpl implements Consumer<Integer>{
//
//    @Override
//    public void accept(Integer i) {
//        System.out.println(i);
//    }
//}

public class DemoforEach {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1,2,3,4,5);
//        Consumer<Integer> c = i -> System.out.println(i);//consumer//lambda

         number.forEach(i -> System.out.println(i));
//        number.forEach(n -> System.out.println(n));

        /*
        * foEach() method takes object of Consumer as parameter
        * */
    }
}
