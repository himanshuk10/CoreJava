package functionalProgrammings;

import java.util.List;

public class FP01Functional {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12,43,76,90,1,3,89);
        List<String> courses = List.of("java","spring","api","aws","git","docker","spring boot","spring mvc");
//        printAllNumberInListFunctional(numbers);
//        printEvenNumberInListFunctional(numbers);
//        printOddNumberInListFunctional(numbers);
        printAllTheCoursesFunctional(courses);
//        printSquareEvenNumberInListFunctional(numbers);
    }


//    private static void print(Integer number){
//        System.out.println(number);
//    }
//    private static boolean isEven(Integer num){
//        return num%2==0;
//    }


    private static void printAllNumberInListFunctional(List<Integer> numbers) {
        numbers.stream().forEach(System.out::println);
    }

    private static void printEvenNumberInListFunctional(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number%2==0)//lambda exp for checking even number
                .forEach(System.out::println);//method reference

        //.filter(FP01Functional::isEven)//filter only even number
    }
    private static void printSquareEvenNumberInListFunctional(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number%2==0)//lambda exp for checking even number
                .map(num -> num * num)
                .forEach(System.out::println);//method reference

        //.filter(FP01Functional::isEven)//filter only even number
    }
    private static void printOddNumberInListFunctional(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number%2!=0)//lambda exp for checking even number
                .forEach(System.out::println);//method reference
    }
    private static void printAllTheCoursesFunctional(List<String> courses) {
        /*
        //course contain spring
        courses.stream()
                .filter(course ->course.contains("spring"))
                .forEach(System.out::println);
         */
        /*
        //course have atleast 4 character
        courses.stream()
                .filter(course ->course.length()>=4)
                .forEach(System.out::println);
         */

        //number of character in course or length of each course
        courses.stream()
                .map(course -> course + ": " +course.length())
                .forEach(System.out::println);
    }
}
