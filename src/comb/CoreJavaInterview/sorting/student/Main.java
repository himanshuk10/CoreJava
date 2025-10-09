package comb.CoreJavaInterview.sorting.student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student{
    private String name;
    private double gpa;

    public Student() {
    }

    public Student(String  name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String  getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Charlie", 3.5));
        students.add(new Student("Bob", 3.7));
        students.add(new Student("Alice", 3.5));
        students.add(new Student("Akshay", 3.9));
        Comparator<Student> comparing = Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName);
        students.sort(comparing);

        for(Student s : students){
            System.out.println(s.getName() + ": "+s.getGpa());
        }

        /*
         List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(40);
        list.add(5);
        list.sort((o1,o2) ->  o2 - o1);


        students.sort((o1, o2) -> {
            if (o2.getGpa() - o1.getGpa() > 0){
                return 1;
            } else if (o2.getGpa() - o1.getGpa() > 0) {
                return -1;
            }else{
                return o1.getName().compareTo(o2.getName());
            }
        });
         */
    }
}
