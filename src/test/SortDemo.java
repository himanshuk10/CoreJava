package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
    Integer roll;
    String name;
    String department;

    public Student(Integer roll, String name, String department) {
        this.roll = roll;
        this.name = name;
        this.department = department;
    }

    public Integer getRoll() {
        return roll;
    }

    public void setRoll(Integer roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }


//    @Override
//    public int compareTo(Student o) {
//        if (o.roll > this.roll){
//            return 1;
//        }
//        else if (o.roll < this.roll) {
//            return -1;
//        }else{
//            return 0;
//        }
//    }
}
public class SortDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"rohan", "eng"));
        students.add(new Student(2,"bob", "eng"));
        students.add(new Student(3,"kin", "hr"));
        students.add(new Student(4,"alice", "phy"));
//        Collections.sort(students);
//        for (Student st : students){
//            System.out.println(st);
//        }
        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getName().charAt(0) > o2.getName().charAt(0)){
                    return 1;
                } else if (o1.getName().charAt(0) < o2.getName().charAt(0)) {
                    return -1;
                }else{
                    return 0;
                }
            }
        };
        Collections.sort(students, comparator);
        for (Student st : students){
            System.out.println(st);
        }
    }
}
