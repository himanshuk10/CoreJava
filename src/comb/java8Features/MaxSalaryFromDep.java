package comb.java8Features;

import java.util.*;
import java.util.stream.Collectors;

class Employee1{
    String name;
    String department;
    double salary;

    public Employee1(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public String getDepartment() {
        return department;
    }
    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class MaxSalaryFromDep {
    public static void main(String[] args) {
        List<Employee1> employees = Arrays.asList(
                new Employee1("Amit", "IT", 70000),
                new Employee1("Neha", "HR", 65000),
                new Employee1("Raj", "IT", 85000),
                new Employee1("Priya", "Finance", 90000),
                new Employee1("Karan", "HR", 75000)
        );

        //find the max salary of each department
        Map<String, Optional<Employee1>> collect = employees.stream()
                .collect(Collectors.groupingBy(Employee1::getDepartment,
                Collectors.maxBy(Comparator.comparingDouble(Employee1::getSalary))
                ));
        System.out.println(collect);

    }
}
