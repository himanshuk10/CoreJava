package newTest;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeating {
    public static void main(String[] args) {
        String str = "Java articles are Awesome";
        LinkedHashMap<Character, Long> collect = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()));

        Optional<Map.Entry<Character, Long>> first = collect.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .findFirst();


        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Alice Johnson", "Computer Science"));
        students.add(new Student(2, "Bob Williams", "Electrical Engineering"));
        students.add(new Student(3, "Charlie Brown", "Mechanical Engineering"));
        students.add(new Student(4, "Diana Miller", "Physics"));
        students.add(new Student(5, "Eve Davis", "Mathematics"));
        students.add(new Student(6, "Frank Wilson", "Computer Science"));
        students.add(new Student(7, "Grace Garcia", "Biology"));
        students.add(new Student(8, "Heidi Rodriguez", "History"));
        students.add(new Student(9, "Ivan Martinez", "Art"));
        students.add(new Student(10, "Judy Hernandez", "Business"));
        students.add(new Student(11, "Kevin Lopez", "Electrical Engineering"));
        students.add(new Student(12, "Linda Lee", "Mechanical Engineering"));
        students.add(new Student(13, "Mike Gonzalez", "Computer Science"));
        students.add(new Student(14, "Nancy Perez", "Business"));
        students.add(new Student(15, "Oscar Sanchez", "Computer Science"));
        students.add(new Student(16, "Pamela King", "Physics"));
        students.add(new Student(17, "Quincy Wright", "Mathematics"));
        students.add(new Student(18, "Rachel Hill", "Biology"));
        students.add(new Student(19, "Sam Green", "Business"));
        students.add(new Student(20, "Tina Adams", "History"));

        LinkedHashMap<String, Long> collect1 = students.stream()
                .collect(Collectors.groupingBy(Student::getDepartment, LinkedHashMap::new, Collectors.counting()));
        System.out.println(collect1);

    }
}
